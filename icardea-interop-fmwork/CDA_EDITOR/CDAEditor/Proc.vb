Imports System.Windows.Forms

Public Class Proc

    Dim dr As DataRow
    Dim dv As DataView
    Dim proccode, proctext As String

    Public Sub New(ByVal dr As DataRow)

        ' This call is required by the Windows Form Designer.
        InitializeComponent()

        ' Add any initialization after the InitializeComponent() call.
        'proccsComboBox.DataSource = declarations.codesystems_dt
        'proccsComboBox.DisplayMember = "descr"
        'proccsComboBox.ValueMember = "code"
        'procComboBox.DataSource = declarations.proclist_dt
        'procComboBox.DisplayMember = "descr"
        'procComboBox.ValueMember = "code"
        dv = New DataView(proclist_dt)
        dv.Sort = "descr"
        RefreshGrid(procDataGridView, dv)
        proccode = ""
        proctext = ""
        Me.dr = dr
        If Not IsNothing(dr) Then
            Try
                'proccodeTextBox.Text = dr("proc_code")
                'proctextTextBox.Text = dr("proc_text")
                'proccsComboBox.SelectedValue = dr("proc_codesystem").ToString
                'procComboBox.SelectedValue = dr("proc_code")
                proccode = dr("proc_code").ToString.Trim
                proctext = dr("proc_text").ToString.Trim
                For i = 0 To dv.Count - 1
                    If procDataGridView.Rows(i).Cells(0).Value.ToString.Trim = proccode Then
                        procDataGridView.CurrentCell = procDataGridView.Rows(i).Cells(0)
                    Else
                        procDataGridView.Rows(i).Selected = False
                    End If
                Next
                selectedLabel.Text = procDataGridView.SelectedRows(0).Cells(0).Value.ToString + " - " + procDataGridView.SelectedRows(0).Cells(1).Value.ToString
                Dim procdate As String = dr("proc_date_low")
                Dim hour, min, sec As Integer
                Try
                    hour = CInt(procdate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(procdate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(procdate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    procDate1TimePicker.Value = New Date(CInt(procdate.Substring(0, 4)), CInt(procdate.Substring(4, 2)), CInt(procdate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try

                procdate = dr("proc_date_high")
                Try
                    hour = CInt(procdate.Substring(8, 2))
                Catch ex As Exception
                    hour = 0
                End Try
                Try
                    min = CInt(procdate.Substring(10, 2))
                Catch ex As Exception
                    min = 0
                End Try
                Try
                    sec = CInt(procdate.Substring(12, 2))
                Catch ex As Exception
                    sec = 0
                End Try
                Try
                    procDate2TimePicker.Value = New Date(CInt(procdate.Substring(0, 4)), CInt(procdate.Substring(4, 2)), CInt(procdate.Substring(6, 2)), hour, min, sec)
                Catch ex As Exception
                End Try
            Catch ex As Exception
                MessageBox.Show("Unable to load procedure data: " + ex.Message)
                Me.DialogResult = System.Windows.Forms.DialogResult.Cancel
                'Me.Close()
            End Try
        End If

    End Sub
    Private Sub OK_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OK_Button.Click
        'If proccodeTextBox.Text.Trim.Length = 0 Or proctextTextBox.Text.Trim.Length = 0 Or proccsComboBox.SelectedValue = "EMPTY" Or procDateTimePicker.Value = Nothing Then
        '    MessageBox.Show("Input missing")
        '    Return
        'End If
        If proccode.Trim.Length = 0 Or proctext.Trim.Length = 0 Then
            MessageBox.Show("Input missing")
            Return
        End If
        If Not IsNothing(dr) Then
            Dim tdr As DataRow = proclist_dt.Rows.Find(proccode)
            If Not IsNothing(tdr) Then
                EditProcEntry(dr("proc_id").ToString, proccode, proctext, tdr("codesystem"), tdr("codesystemname"), procDate1TimePicker.Value.ToString("yyyyMMddhhmmss"), procDate2TimePicker.Value.ToString("yyyyMMddhhmmss"))
            Else
                MessageBox.Show("Procedure codes error")
            End If
        Else
            Dim tdr As DataRow = proclist_dt.Rows.Find(proccode)
            If Not IsNothing(tdr) Then
                NewProcEntry(proccode, proctext, tdr("codesystem"), tdr("codesystemname"), procDate1TimePicker.Value.ToString("yyyyMMddhhmmss"), procDate2TimePicker.Value.ToString("yyyyMMddhhmmss"))
            Else
                MessageBox.Show("Procedure codes error")
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
        RefreshGrid(procDataGridView, dv)
    End Sub

    Private Sub codeTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles codeTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(procDataGridView, dv)
        For i = 0 To dv.Count - 1
            If procDataGridView.Rows(i).Cells(0).Value.ToString.Trim = proccode Then
                procDataGridView.CurrentCell = procDataGridView.Rows(i).Cells(0)
                proccode = procDataGridView.SelectedRows(0).Cells(0).Value.ToString
                proctext = procDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                procDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub

    Private Sub descrTextBox_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles descrTextBox.TextChanged
        dv.RowFilter = "code like '%" + codeTextBox.Text.Trim + "%' and descr like '%" + descrTextBox.Text.Trim + "%'"
        RefreshGrid(procDataGridView, dv)
        For i = 0 To dv.Count - 1
            If procDataGridView.Rows(i).Cells(0).Value.ToString.Trim = proccode Then
                procDataGridView.CurrentCell = procDataGridView.Rows(i).Cells(0)
                proccode = procDataGridView.SelectedRows(0).Cells(0).Value.ToString
                proctext = procDataGridView.SelectedRows(0).Cells(1).Value.ToString
            Else
                procDataGridView.Rows(i).Selected = False
            End If
        Next
    End Sub



    Private Sub medDataGridView_CellMouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles procDataGridView.CellMouseClick
        Try
            procDataGridView.CurrentCell = procDataGridView.Rows(e.RowIndex).Cells(0)
            proccode = procDataGridView.SelectedRows(0).Cells(0).Value.ToString
            proctext = procDataGridView.SelectedRows(0).Cells(1).Value.ToString
            selectedLabel.Text = proccode + " - " + proctext
        Catch ex As Exception
        End Try
    End Sub

End Class
