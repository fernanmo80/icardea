Imports System.Windows.Forms

Public Class Vital

    Dim dr As DataRow
    Dim dv As DataView
    Dim vitalcode, vitaltext As String
    Public Sub New(ByVal dr As DataRow)

        ' This call is required by the Windows Form Designer.
        InitializeComponent()

        ' Add any initialization after the InitializeComponent() call.
        'vitalcsComboBox.DataSource = declarations.codesystems_dt
        'vitalcsComboBox.DisplayMember = "descr"
        'vitalcsComboBox.ValueMember = "code"

        'vitalComboBox.DataSource = declarations.vitallist_dt
        'vitalComboBox.DisplayMember = "descr"
        'vitalComboBox.ValueMember = "code"
        dv = New DataView(vitallist_dt)
        dv.Sort = "descr"
        RefreshGrid(vitalDataGridView, dv)
        vitalcode = ""
        vitaltext = ""
        Me.dr = dr
        If Not IsNothing(dr) Then
            Try
                'vitalcodeTextBox.Text = dr("vital_code")
                'vitaltextTextBox.Text = dr("vital_text")
                'vitalcsComboBox.SelectedValue = dr("vital_codesystem").ToString
                'vitalComboBox.SelectedValue = dr("vital_code").ToString
                vitalcode = dr("vital_code").ToString.Trim
                vitaltext = dr("vital_text").ToString.Trim
                For i = 0 To dv.Count - 1
                    If vitalDataGridView.Rows(i).Cells(0).Value.ToString.Trim = vitalcode Then
                        vitalDataGridView.CurrentCell = vitalDataGridView.Rows(i).Cells(0)
                    Else
                        vitalDataGridView.Rows(i).Selected = False
                    End If
                Next
                selectedLabel.Text = vitalDataGridView.SelectedRows(0).Cells(0).Value.ToString + " - " + vitalDataGridView.SelectedRows(0).Cells(1).Value.ToString
                vitalvalTextBox.Text = dr("vital_value")
                vitalunitTextBox.Text = dr("vital_unit")
                Dim vitaldate As String = dr("vital_date")
                Dim hour, min, sec As Integer
                Try
                    hour = CInt(vitaldate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(vitaldate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(vitaldate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    vitalDateTimePicker.Value = New Date(CInt(vitaldate.Substring(0, 4)), CInt(vitaldate.Substring(4, 2)), CInt(vitaldate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try
            Catch ex As Exception
                MessageBox.Show("Unable to load vital signs data: " + ex.Message)
                Me.DialogResult = System.Windows.Forms.DialogResult.Cancel
                'Me.Close()
            End Try
        End If

    End Sub

    Private Sub OK_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OK_Button.Click
        'If vitalcodeTextBox.Text.Trim.Length = 0 Or vitaltextTextBox.Text.Trim.Length = 0 Or vitalcsComboBox.SelectedValue = "EMPTY" Or vitalDateTimePicker.Value = Nothing Or vitalvalTextBox.Text.Trim.Length = 0 Or vitalunitTextBox.Text.Trim.Length = 0 Then
        '    MessageBox.Show("Input missing")
        '    Return
        'End If
        If vitalcode.Trim.Length = 0 Or vitaltext.Trim.Length = 0 Then
            MessageBox.Show("Input missing")
            Return
        End If
        If Not IsNothing(dr) Then
            'EditVitalEntry(dr("vital_id").ToString, vitalcodeTextBox.Text.Trim, vitaltextTextBox.Text.Trim, vitalcsComboBox.SelectedValue, vitalcsComboBox.Text, vitalDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", vitalvalTextBox.Text.Trim, vitalunitTextBox.Text.Trim)
            Dim tdr As DataRow = vitallist_dt.Rows.Find(vitalcode)
            If Not IsNothing(tdr) Then
                EditVitalEntry(dr("vital_id").ToString, vitalcode, vitaltext, tdr("codesystem"), tdr("codesystemname"), vitalDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", vitalvalTextBox.Text.Trim, vitalunitTextBox.Text.Trim)
            Else
                MessageBox.Show("Vital signs codes error")
            End If
        Else
            'NewVitalEntry(vitalcodeTextBox.Text.Trim, vitaltextTextBox.Text.Trim, vitalcsComboBox.SelectedValue, vitalcsComboBox.Text, vitalDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", vitalvalTextBox.Text.Trim, vitalunitTextBox.Text.Trim)
            Dim tdr As DataRow = vitallist_dt.Rows.Find(vitalcode)
            If Not IsNothing(tdr) Then
                NewVitalEntry(vitalcode, vitaltext, tdr("codesystem"), tdr("codesystemname"), vitalDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", vitalvalTextBox.Text.Trim, vitalunitTextBox.Text.Trim)
            Else
                MessageBox.Show("Vital signs codes error")
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
        RefreshGrid(vitalDataGridView, dv)
    End Sub

    Private Sub codeTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles codeTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(vitalDataGridView, dv)
        For i = 0 To dv.Count - 1
            If vitalDataGridView.Rows(i).Cells(0).Value.ToString.Trim = vitalcode Then
                vitalDataGridView.CurrentCell = vitalDataGridView.Rows(i).Cells(0)
                vitalcode = vitalDataGridView.SelectedRows(0).Cells(0).Value.ToString
                vitaltext = vitalDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                vitalDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub

    Private Sub descrTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles descrTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(vitalDataGridView, dv)
        For i = 0 To dv.Count - 1
            If vitalDataGridView.Rows(i).Cells(0).Value.ToString.Trim = vitalcode Then
                vitalDataGridView.CurrentCell = vitalDataGridView.Rows(i).Cells(0)
                vitalcode = vitalDataGridView.SelectedRows(0).Cells(0).Value.ToString
                vitaltext = vitalDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                vitalDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub



    Private Sub medDataGridView_CellMouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles vitalDataGridView.CellMouseClick
        Try
            vitalDataGridView.CurrentCell = vitalDataGridView.Rows(e.RowIndex).Cells(0)
            vitalcode = vitalDataGridView.SelectedRows(0).Cells(0).Value.ToString
            vitaltext = vitalDataGridView.SelectedRows(0).Cells(1).Value.ToString
            selectedLabel.Text = vitalcode + " - " + vitaltext
        Catch ex As Exception
        End Try
    End Sub
End Class
