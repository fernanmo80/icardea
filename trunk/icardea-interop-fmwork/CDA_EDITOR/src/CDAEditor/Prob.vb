Imports System.Windows.Forms

Public Class Prob

    Dim dv As DataView
    Dim probcode, probtext As String
    Dim dr As DataRow

    Public Sub New(ByVal dr As DataRow)

        ' This call is required by the Windows Form Designer.
        InitializeComponent()

        ' Add any initialization after the InitializeComponent() call.
        'probcsComboBox.DataSource = declarations.codesystems_dt
        'probcsComboBox.DisplayMember = "descr"
        'probcsComboBox.ValueMember = "code"
        'probComboBox.DataSource = declarations.problist_dt
        'probComboBox.DisplayMember = "descr"
        'probComboBox.ValueMember = "code"
        dv = New DataView(problist_dt)
        dv.Sort = "descr"
        RefreshGrid(probDataGridView, dv)
        probcode = ""
        probtext = ""
        probtypeComboBox.DataSource = declarations.prob_types_dt
        probtypeComboBox.DisplayMember = "descr"
        probtypeComboBox.ValueMember = "code"
        statusComboBox.DataSource = declarations.status_dt
        statusComboBox.DisplayMember = "descr"
        statusComboBox.ValueMember = "code"
        severityComboBox.DataSource = declarations.severity_dt
        severityComboBox.DisplayMember = "descr"
        severityComboBox.ValueMember = "code"
        Me.dr = dr
        If Not IsNothing(dr) Then
            Try
                'probcodeTextBox.Text = dr("prob_value_code")
                'probtextTextBox.Text = dr("prob_text")
                'probcsComboBox.SelectedValue = dr("prob_codesystem").ToString
                'probComboBox.SelectedValue = dr("prob_value_code")
                probcode = dr("prob_value_code").ToString.Trim
                probtext = dr("prob_text").ToString.Trim
                For i = 0 To dv.Count - 1
                    If probDataGridView.Rows(i).Cells(0).Value.ToString.Trim = probcode Then
                        probDataGridView.CurrentCell = probDataGridView.Rows(i).Cells(0)
                    Else
                        probDataGridView.Rows(i).Selected = False
                    End If
                Next
                selectedLabel.Text = probDataGridView.SelectedRows(0).Cells(0).Value.ToString + " - " + probDataGridView.SelectedRows(0).Cells(1).Value.ToString
                statusComboBox.SelectedValue = CStr(dr("prob_status")).ToLower
                probtypeComboBox.SelectedValue = dr("prob_type_code").ToString
                Dim probdate As String = dr("prob_date_low")
                Dim hour, min, sec As Integer
                Try
                    hour = CInt(probdate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(probdate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(probdate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    probDate1TimePicker.Value = New Date(CInt(probdate.Substring(0, 4)), CInt(probdate.Substring(4, 2)), CInt(probdate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try
                probdate = dr("prob_date_high")
                Try
                    hour = CInt(probdate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(probdate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(probdate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    probdate2DateTimePicker.Value = New Date(CInt(probdate.Substring(0, 4)), CInt(probdate.Substring(4, 2)), CInt(probdate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try
            Catch ex As Exception
                'MessageBox.Show("Unable to load problem data: " + ex.Message)
                MessageBox.Show("THE PROBLEM CODE WAS NOT FOUND...YOU HAVE TO SELECT THE PROBLEM FROM THE LIST!!!", "PROBLEM CODE MISSING", MessageBoxButtons.OK, MessageBoxIcon.Warning, MessageBoxDefaultButton.Button1)
                Me.DialogResult = System.Windows.Forms.DialogResult.Cancel
                'Me.Close()
            End Try
        End If

    End Sub

    Private Sub OK_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OK_Button.Click
        'If probcodeTextBox.Text.Trim.Length = 0 Or probtextTextBox.Text.Trim.Length = 0 Or probcsComboBox.SelectedValue = "EMPTY" Or probDateTimePicker.Value = Nothing Or probtypeComboBox.SelectedValue = "EMPTY" Then
        '    MessageBox.Show("Input missing")
        '    Return
        'End If
        If probcode.Trim.Length = 0 Or probtext.Trim.Length = 0 Then
            MessageBox.Show("Input missing")
            Return
        End If
        Dim probtype As String = ""
        Dim probtypetext As String = ""
        If Not IsNothing(probtypeComboBox.SelectedValue) AndAlso probtypeComboBox.SelectedValue.ToString.Trim.Length > 0 AndAlso probtypeComboBox.SelectedValue.ToString <> "EMPTY" Then
            probtype = probtypeComboBox.SelectedValue.ToString
            probtypetext = probtypeComboBox.Text
        End If

        Dim status As String = ""
        If Not IsNothing(statusComboBox.SelectedValue) AndAlso statusComboBox.SelectedValue.ToString.Trim.Length > 0 AndAlso statusComboBox.SelectedValue.ToString <> "EMPTY" Then
            status = statusComboBox.SelectedValue
        End If

        If Not IsNothing(dr) Then
            Dim tdr As DataRow = problist_dt.Rows.Find(probcode)
            If Not IsNothing(tdr) Then
                EditProbEntry(dr("prob_id").ToString, probtype, probtypetext, tdr("codesystem"), tdr("codesystemname"), probDate1TimePicker.Value.ToString("yyyyMMddhhmmss"), probdate2DateTimePicker.Value.ToString("yyyyMMddhhmmss"), "CD", probcode, probtext, status)
            Else
                MessageBox.Show("Problem codes error")
            End If
            'EditProbEntry(dr("prob_id").ToString, probtypeComboBox.SelectedValue.ToString, probtypeComboBox.Text, probcsComboBox.SelectedValue.ToString, probcsComboBox.Text, probDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "CD", probcodeTextBox.Text.Trim, probtextTextBox.Text.Trim, "completed")
        Else
            Dim tdr As DataRow = problist_dt.Rows.Find(probcode)
            If Not IsNothing(tdr) Then
                NewProbEntry(probtype, probtypetext, tdr("codesystem"), tdr("codesystemname"), probDate1TimePicker.Value.ToString("yyyyMMddhhmmss"), probdate2DateTimePicker.Value.ToString("yyyyMMddhhmmss"), "CD", probcode, probtext, status)
                'NewProbEntry(probtypeComboBox.SelectedValue.ToString, probtypeComboBox.Text, probcsComboBox.SelectedValue.ToString, probcsComboBox.Text, probDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "CD", probcodeTextBox.Text.Trim, probtextTextBox.Text.Trim, "completed")
            Else
                MessageBox.Show("Problem codes error")
            End If
        End If
        Me.DialogResult = System.Windows.Forms.DialogResult.OK
        Me.Close()
    End Sub

    Private Sub Cancel_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Cancel_Button.Click
        Me.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.Close()
    End Sub

    Private Sub searchButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles searchButton.Click
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(probDataGridView, dv)
    End Sub

    Private Sub codeTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles codeTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(probDataGridView, dv)
        For i = 0 To dv.Count - 1
            If probDataGridView.Rows(i).Cells(0).Value.ToString.Trim = probcode Then
                probDataGridView.CurrentCell = probDataGridView.Rows(i).Cells(0)
                probcode = probDataGridView.SelectedRows(0).Cells(0).Value.ToString
                probtext = probDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                probDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub

    Private Sub descrTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles descrTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(probDataGridView, dv)
        For i = 0 To dv.Count - 1
            If probDataGridView.Rows(i).Cells(0).Value.ToString.Trim = probcode Then
                probDataGridView.CurrentCell = probDataGridView.Rows(i).Cells(0)
                probcode = probDataGridView.SelectedRows(0).Cells(0).Value.ToString
                probtext = probDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                probDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub



    Private Sub medDataGridView_CellMouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles probDataGridView.CellMouseClick
        Try
            probDataGridView.CurrentCell = probDataGridView.Rows(e.RowIndex).Cells(0)
            probcode = probDataGridView.SelectedRows(0).Cells(0).Value.ToString
            probtext = probDataGridView.SelectedRows(0).Cells(1).Value.ToString
            selectedLabel.Text = probcode + " - " + probtext
        Catch ex As Exception
        End Try
    End Sub

End Class
