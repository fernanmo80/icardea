Imports System.Windows.Forms

Public Class Lab

    Dim dr As DataRow
    Dim dv As DataView
    Dim labcode, labtext As String
    Public Sub New(ByVal dr As DataRow)

        ' This call is required by the Windows Form Designer.
        InitializeComponent()

        ' Add any initialization after the InitializeComponent() call.
        'obscsComboBox.DataSource = declarations.codesystems_dt
        'obscsComboBox.DisplayMember = "descr"
        'obscsComboBox.ValueMember = "code"

        'obslistComboBox.DataSource = declarations.lablist_dt
        'obslistComboBox.DisplayMember = "descr"
        'obslistComboBox.ValueMember = "code"
        dv = New DataView(lablist_dt)
        dv.Sort = "descr"
        RefreshGrid(labDataGridView, dv)
        labcode = ""
        labtext = ""
        Me.dr = dr
        If Not IsNothing(dr) Then
            Try
                'obscodeTextBox.Text = dr("lab_code")
                'obstextTextBox.Text = dr("lab_text")
                'obscsComboBox.SelectedValue = dr("lab_codesystem").ToString
                'obslistComboBox.SelectedValue = dr("lab_code").ToString
                labcode = dr("lab_code").ToString.Trim
                labtext = dr("lab_text").ToString.Trim
                For i = 0 To dv.Count - 1
                    If labDataGridView.Rows(i).Cells(0).Value.ToString.Trim = labcode Then
                        labDataGridView.CurrentCell = labDataGridView.Rows(i).Cells(0)
                    Else
                        labDataGridView.Rows(i).Selected = False
                    End If
                Next
                selectedLabel.Text = labDataGridView.SelectedRows(0).Cells(0).Value.ToString + " - " + labDataGridView.SelectedRows(0).Cells(1).Value.ToString
                labvalTextBox.Text = dr("lab_value")
                labunitTextBox.Text = dr("lab_unit")
                Dim labdate As String = dr("lab_date")
                Dim hour, min, sec As Integer
                Try
                    hour = CInt(labdate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(labdate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(labdate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    labDateTimePicker.Value = New Date(CInt(labdate.Substring(0, 4)), CInt(labdate.Substring(4, 2)), CInt(labdate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try
            Catch ex As Exception
                MessageBox.Show("Unable to load lab data: " + ex.Message)
                Me.DialogResult = System.Windows.Forms.DialogResult.Cancel
                'Me.Close()
            End Try
        End If

    End Sub

    Private Sub OK_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OK_Button.Click
        'If obscodeTextBox.Text.Trim.Length = 0 Or obstextTextBox.Text.Trim.Length = 0 Or obscsComboBox.SelectedValue = "EMPTY" Or labDateTimePicker.Value = Nothing Or labvalTextBox.Text.Trim.Length = 0 Or labunitTextBox.Text.Trim.Length = 0 Then
        '    MessageBox.Show("Input missing")
        '    Return
        'End If
        If labcode.Trim.Length = 0 Or labtext.Trim.Length = 0 Then
            MessageBox.Show("Input missing")
            Return
        End If
        If Not IsNothing(dr) Then
            'EditLabEntry(dr("lab_id").ToString, obscodeTextBox.Text.Trim, obstextTextBox.Text.Trim, obscsComboBox.SelectedValue, obscsComboBox.Text, labDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", labvalTextBox.Text.Trim, labunitTextBox.Text.Trim)
            Dim tdr As DataRow = lablist_dt.Rows.Find(labcode)
            If Not IsNothing(tdr) Then
                EditLabEntry(dr("lab_id").ToString, labcode, labtext, tdr("codesystem"), tdr("codesystemname"), labDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", labvalTextBox.Text.Trim, labunitTextBox.Text.Trim)
            Else
                MessageBox.Show("Lab codes error")
            End If
        Else
            'NewLabEntry(obscodeTextBox.Text.Trim, obstextTextBox.Text.Trim, obscsComboBox.SelectedValue, obscsComboBox.Text, labDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", labvalTextBox.Text.Trim, labunitTextBox.Text.Trim)
            Dim tdr As DataRow = lablist_dt.Rows.Find(labcode)
            If Not IsNothing(tdr) Then
                NewLabEntry(labcode, labtext, tdr("codesystem"), tdr("codesystemname"), labDateTimePicker.Value.ToString("yyyyMMddhhmmss"), "PQ", labvalTextBox.Text.Trim, labunitTextBox.Text.Trim)
            Else
                MessageBox.Show("Lab codes error")
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
        RefreshGrid(labDataGridView, dv)
    End Sub

    Private Sub codeTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles codeTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(labDataGridView, dv)
        For i = 0 To dv.Count - 1
            If labDataGridView.Rows(i).Cells(0).Value.ToString.Trim = labcode Then
                labDataGridView.CurrentCell = labDataGridView.Rows(i).Cells(0)
                labcode = labDataGridView.SelectedRows(0).Cells(0).Value.ToString
                labtext = labDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                labDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub

    Private Sub descrTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles descrTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(labDataGridView, dv)
        For i = 0 To dv.Count - 1
            If labDataGridView.Rows(i).Cells(0).Value.ToString.Trim = labcode Then
                labDataGridView.CurrentCell = labDataGridView.Rows(i).Cells(0)
                labcode = labDataGridView.SelectedRows(0).Cells(0).Value.ToString
                labtext = labDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                labDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub



    Private Sub medDataGridView_CellMouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles labDataGridView.CellMouseClick
        Try
            labDataGridView.CurrentCell = labDataGridView.Rows(e.RowIndex).Cells(0)
            labcode = labDataGridView.SelectedRows(0).Cells(0).Value.ToString
            labtext = labDataGridView.SelectedRows(0).Cells(1).Value.ToString
            selectedLabel.Text = labcode + " - " + labtext
        Catch ex As Exception
        End Try
    End Sub

End Class
