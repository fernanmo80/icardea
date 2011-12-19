Imports System.Windows.Forms

Public Class Med

    Dim dr As DataRow
    Dim dv As DataView
    Dim medcode, medtext As String
    Public Sub New(ByVal dr As DataRow)

        ' This call is required by the Windows Form Designer.
        InitializeComponent()

        ' Add any initialization after the InitializeComponent() call.
        'medcsComboBox.DataSource = declarations.codesystems_dt
        'medcsComboBox.DisplayMember = "descr"
        'medcsComboBox.ValueMember = "code"
        dv = New DataView(medlist_dt)
        dv.Sort = "descr"
        RefreshGrid(medDataGridView, dv)
        medcode = ""
        medtext = ""
        Me.dr = dr
        If Not IsNothing(dr) Then
            Try
                'medcodeTextBox.Text = dr("med_code")
                'medtextTextBox.Text = dr("med_text")
                'medcsComboBox.SelectedValue = dr("med_codesystem").ToString
                medcode = dr("med_code").ToString.Trim
                medtext = dr("med_text").ToString.Trim
                For i = 0 To dv.Count - 1
                    If medDataGridView.Rows(i).Cells(0).Value.ToString.Trim = medcode Then
                        medDataGridView.CurrentCell = medDataGridView.Rows(i).Cells(0)
                    Else
                        medDataGridView.Rows(i).Selected = False
                    End If
                Next
                selectedLabel.Text = medDataGridView.SelectedRows(0).Cells(0).Value.ToString + " - " + medDataGridView.SelectedRows(0).Cells(1).Value.ToString
                meddoseTextBox.Text = dr("med_dose")
                medunitTextBox.Text = dr("med_unit")
                Dim meddate As String = dr("med_date_low")
                Dim hour, min, sec As Integer
                Try
                    hour = CInt(meddate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(meddate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(meddate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    medDate1TimePicker.Value = New Date(CInt(meddate.Substring(0, 4)), CInt(meddate.Substring(4, 2)), CInt(meddate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try

                meddate = dr("med_date_high")
                Try
                    hour = CInt(meddate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(meddate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(meddate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    medDate2TimePicker.Value = New Date(CInt(meddate.Substring(0, 4)), CInt(meddate.Substring(4, 2)), CInt(meddate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try
            Catch ex As Exception
                MessageBox.Show("Unable to load medications data: " + ex.Message)
                Me.DialogResult = System.Windows.Forms.DialogResult.Cancel
                'Me.Close()
            End Try
        End If

    End Sub


    Private Sub OK_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OK_Button.Click
        If medcode.Trim.Length = 0 Or medtext.Trim.Length = 0 Then
            MessageBox.Show("Input missing")
            Return
        End If
        Dim tdr As DataRow = medlist_dt.Rows.Find(medcode)
        If Not IsNothing(dr) Then
            EditMedEntry(dr("med_id").ToString, medcode, medtext, tdr("codesystem"), tdr("codesystemname"), medDate1TimePicker.Value.ToString("yyyyMMddhhmmss"), medDate2TimePicker.Value.ToString("yyyyMMddhhmmss"), meddoseTextBox.Text.Trim, medunitTextBox.Text.Trim)
        Else
            NewMedEntry(medcode, medtext, tdr("codesystem"), tdr("codesystemname"), medDate1TimePicker.Value.ToString("yyyyMMddhhmmss"), medDate2TimePicker.Value.ToString("yyyyMMddhhmmss"), meddoseTextBox.Text.Trim, medunitTextBox.Text.Trim)
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
        RefreshGrid(medDataGridView, dv)
    End Sub

    Private Sub codeTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles codeTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(medDataGridView, dv)
        For i = 0 To dv.Count - 1
            If medDataGridView.Rows(i).Cells(0).Value.ToString.Trim = medcode Then
                medDataGridView.CurrentCell = medDataGridView.Rows(i).Cells(0)
                medcode = medDataGridView.SelectedRows(0).Cells(0).Value.ToString
                medtext = medDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                medDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub

    Private Sub descrTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles descrTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(medDataGridView, dv)
        For i = 0 To dv.Count - 1
            If medDataGridView.Rows(i).Cells(0).Value.ToString.Trim = medcode Then
                medDataGridView.CurrentCell = medDataGridView.Rows(i).Cells(0)
                medcode = medDataGridView.SelectedRows(0).Cells(0).Value.ToString
                medtext = medDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                medDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub



    Private Sub medDataGridView_CellMouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles medDataGridView.CellMouseClick
        Try
            medDataGridView.CurrentCell = medDataGridView.Rows(e.RowIndex).Cells(0)
            medcode = medDataGridView.SelectedRows(0).Cells(0).Value.ToString
            medtext = medDataGridView.SelectedRows(0).Cells(1).Value.ToString
            selectedLabel.Text = medcode + " - " + medtext
        Catch ex As Exception
        End Try
    End Sub
End Class
