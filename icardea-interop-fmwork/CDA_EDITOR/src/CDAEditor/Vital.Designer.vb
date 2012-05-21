<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Vital
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.TableLayoutPanel1 = New System.Windows.Forms.TableLayoutPanel
        Me.OK_Button = New System.Windows.Forms.Button
        Me.Cancel_Button = New System.Windows.Forms.Button
        Me.vitalDateTimePicker = New System.Windows.Forms.DateTimePicker
        Me.Label14 = New System.Windows.Forms.Label
        Me.vitalunitTextBox = New System.Windows.Forms.TextBox
        Me.Label13 = New System.Windows.Forms.Label
        Me.vitalvalTextBox = New System.Windows.Forms.TextBox
        Me.Label12 = New System.Windows.Forms.Label
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.selectedLabel = New System.Windows.Forms.Label
        Me.Label6 = New System.Windows.Forms.Label
        Me.searchButton = New System.Windows.Forms.Button
        Me.Label5 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.descrTextBox = New System.Windows.Forms.TextBox
        Me.codeTextBox = New System.Windows.Forms.TextBox
        Me.vitalDataGridView = New System.Windows.Forms.DataGridView
        Me.Column1 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.Column2 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.Column3 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.Column4 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.TableLayoutPanel1.SuspendLayout()
        Me.GroupBox1.SuspendLayout()
        CType(Me.vitalDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'TableLayoutPanel1
        '
        Me.TableLayoutPanel1.Anchor = CType((System.Windows.Forms.AnchorStyles.Bottom Or System.Windows.Forms.AnchorStyles.Right), System.Windows.Forms.AnchorStyles)
        Me.TableLayoutPanel1.ColumnCount = 2
        Me.TableLayoutPanel1.ColumnStyles.Add(New System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50.0!))
        Me.TableLayoutPanel1.ColumnStyles.Add(New System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50.0!))
        Me.TableLayoutPanel1.Controls.Add(Me.OK_Button, 0, 0)
        Me.TableLayoutPanel1.Controls.Add(Me.Cancel_Button, 1, 0)
        Me.TableLayoutPanel1.Location = New System.Drawing.Point(426, 431)
        Me.TableLayoutPanel1.Name = "TableLayoutPanel1"
        Me.TableLayoutPanel1.RowCount = 1
        Me.TableLayoutPanel1.RowStyles.Add(New System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 50.0!))
        Me.TableLayoutPanel1.Size = New System.Drawing.Size(146, 29)
        Me.TableLayoutPanel1.TabIndex = 0
        '
        'OK_Button
        '
        Me.OK_Button.Anchor = System.Windows.Forms.AnchorStyles.None
        Me.OK_Button.Location = New System.Drawing.Point(3, 3)
        Me.OK_Button.Name = "OK_Button"
        Me.OK_Button.Size = New System.Drawing.Size(67, 23)
        Me.OK_Button.TabIndex = 0
        Me.OK_Button.Text = "OK"
        '
        'Cancel_Button
        '
        Me.Cancel_Button.Anchor = System.Windows.Forms.AnchorStyles.None
        Me.Cancel_Button.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.Cancel_Button.Location = New System.Drawing.Point(76, 3)
        Me.Cancel_Button.Name = "Cancel_Button"
        Me.Cancel_Button.Size = New System.Drawing.Size(67, 23)
        Me.Cancel_Button.TabIndex = 1
        Me.Cancel_Button.Text = "Cancel"
        '
        'vitalDateTimePicker
        '
        Me.vitalDateTimePicker.CustomFormat = "dd/MM/yyyy HH:mm:ss"
        Me.vitalDateTimePicker.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.vitalDateTimePicker.Location = New System.Drawing.Point(247, 372)
        Me.vitalDateTimePicker.Name = "vitalDateTimePicker"
        Me.vitalDateTimePicker.Size = New System.Drawing.Size(159, 20)
        Me.vitalDateTimePicker.TabIndex = 81
        '
        'Label14
        '
        Me.Label14.AutoSize = True
        Me.Label14.Location = New System.Drawing.Point(182, 376)
        Me.Label14.Name = "Label14"
        Me.Label14.Size = New System.Drawing.Size(30, 13)
        Me.Label14.TabIndex = 80
        Me.Label14.Text = "Date"
        '
        'vitalunitTextBox
        '
        Me.vitalunitTextBox.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.vitalunitTextBox.Location = New System.Drawing.Point(247, 336)
        Me.vitalunitTextBox.Name = "vitalunitTextBox"
        Me.vitalunitTextBox.Size = New System.Drawing.Size(61, 20)
        Me.vitalunitTextBox.TabIndex = 79
        '
        'Label13
        '
        Me.Label13.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label13.AutoSize = True
        Me.Label13.Location = New System.Drawing.Point(181, 339)
        Me.Label13.Name = "Label13"
        Me.Label13.Size = New System.Drawing.Size(26, 13)
        Me.Label13.TabIndex = 78
        Me.Label13.Text = "Unit"
        '
        'vitalvalTextBox
        '
        Me.vitalvalTextBox.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.vitalvalTextBox.Location = New System.Drawing.Point(248, 300)
        Me.vitalvalTextBox.Name = "vitalvalTextBox"
        Me.vitalvalTextBox.Size = New System.Drawing.Size(60, 20)
        Me.vitalvalTextBox.TabIndex = 77
        '
        'Label12
        '
        Me.Label12.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label12.AutoSize = True
        Me.Label12.Location = New System.Drawing.Point(178, 303)
        Me.Label12.Name = "Label12"
        Me.Label12.Size = New System.Drawing.Size(34, 13)
        Me.Label12.TabIndex = 76
        Me.Label12.Text = "Value"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.selectedLabel)
        Me.GroupBox1.Controls.Add(Me.Label6)
        Me.GroupBox1.Controls.Add(Me.searchButton)
        Me.GroupBox1.Controls.Add(Me.Label5)
        Me.GroupBox1.Controls.Add(Me.Label4)
        Me.GroupBox1.Controls.Add(Me.descrTextBox)
        Me.GroupBox1.Controls.Add(Me.codeTextBox)
        Me.GroupBox1.Controls.Add(Me.vitalDataGridView)
        Me.GroupBox1.Location = New System.Drawing.Point(13, 7)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(556, 283)
        Me.GroupBox1.TabIndex = 92
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Medications"
        '
        'selectedLabel
        '
        Me.selectedLabel.AutoSize = True
        Me.selectedLabel.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(161, Byte))
        Me.selectedLabel.ForeColor = System.Drawing.Color.Blue
        Me.selectedLabel.Location = New System.Drawing.Point(92, 257)
        Me.selectedLabel.Name = "selectedLabel"
        Me.selectedLabel.Size = New System.Drawing.Size(0, 16)
        Me.selectedLabel.TabIndex = 101
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(161, Byte))
        Me.Label6.Location = New System.Drawing.Point(12, 257)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(74, 16)
        Me.Label6.TabIndex = 100
        Me.Label6.Text = "Selected:"
        '
        'searchButton
        '
        Me.searchButton.Location = New System.Drawing.Point(40, 183)
        Me.searchButton.Name = "searchButton"
        Me.searchButton.Size = New System.Drawing.Size(75, 23)
        Me.searchButton.TabIndex = 99
        Me.searchButton.Text = "Search"
        Me.searchButton.UseVisualStyleBackColor = True
        Me.searchButton.Visible = False
        '
        'Label5
        '
        Me.Label5.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(6, 141)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(58, 13)
        Me.Label5.TabIndex = 98
        Me.Label5.Text = "description"
        '
        'Label4
        '
        Me.Label4.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(6, 86)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(31, 13)
        Me.Label4.TabIndex = 97
        Me.Label4.Text = "code"
        '
        'descrTextBox
        '
        Me.descrTextBox.Location = New System.Drawing.Point(9, 157)
        Me.descrTextBox.Name = "descrTextBox"
        Me.descrTextBox.Size = New System.Drawing.Size(147, 20)
        Me.descrTextBox.TabIndex = 96
        '
        'codeTextBox
        '
        Me.codeTextBox.Location = New System.Drawing.Point(9, 102)
        Me.codeTextBox.Name = "codeTextBox"
        Me.codeTextBox.Size = New System.Drawing.Size(147, 20)
        Me.codeTextBox.TabIndex = 95
        '
        'vitalDataGridView
        '
        Me.vitalDataGridView.AllowUserToAddRows = False
        Me.vitalDataGridView.AllowUserToDeleteRows = False
        Me.vitalDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.vitalDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.Column1, Me.Column2, Me.Column3, Me.Column4})
        Me.vitalDataGridView.Location = New System.Drawing.Point(162, 26)
        Me.vitalDataGridView.Name = "vitalDataGridView"
        Me.vitalDataGridView.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect
        Me.vitalDataGridView.Size = New System.Drawing.Size(384, 210)
        Me.vitalDataGridView.TabIndex = 94
        '
        'Column1
        '
        Me.Column1.DataPropertyName = "code"
        Me.Column1.HeaderText = "Code"
        Me.Column1.Name = "Column1"
        Me.Column1.ReadOnly = True
        Me.Column1.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable
        '
        'Column2
        '
        Me.Column2.DataPropertyName = "descr"
        Me.Column2.HeaderText = "Description"
        Me.Column2.Name = "Column2"
        Me.Column2.ReadOnly = True
        Me.Column2.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable
        Me.Column2.Width = 220
        '
        'Column3
        '
        Me.Column3.DataPropertyName = "codesystem"
        Me.Column3.HeaderText = "codsys"
        Me.Column3.Name = "Column3"
        Me.Column3.ReadOnly = True
        Me.Column3.Visible = False
        '
        'Column4
        '
        Me.Column4.DataPropertyName = "codesystemname"
        Me.Column4.HeaderText = "Code System"
        Me.Column4.Name = "Column4"
        Me.Column4.ReadOnly = True
        Me.Column4.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable
        '
        'Vital
        '
        Me.AcceptButton = Me.OK_Button
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.CancelButton = Me.Cancel_Button
        Me.ClientSize = New System.Drawing.Size(584, 472)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.vitalDateTimePicker)
        Me.Controls.Add(Me.Label14)
        Me.Controls.Add(Me.vitalunitTextBox)
        Me.Controls.Add(Me.Label13)
        Me.Controls.Add(Me.vitalvalTextBox)
        Me.Controls.Add(Me.Label12)
        Me.Controls.Add(Me.TableLayoutPanel1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.MaximizeBox = False
        Me.MinimizeBox = False
        Me.Name = "Vital"
        Me.ShowInTaskbar = False
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent
        Me.Text = "Vital sign entry"
        Me.TableLayoutPanel1.ResumeLayout(False)
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.vitalDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents TableLayoutPanel1 As System.Windows.Forms.TableLayoutPanel
    Friend WithEvents OK_Button As System.Windows.Forms.Button
    Friend WithEvents Cancel_Button As System.Windows.Forms.Button
    Friend WithEvents vitalDateTimePicker As System.Windows.Forms.DateTimePicker
    Friend WithEvents Label14 As System.Windows.Forms.Label
    Friend WithEvents vitalunitTextBox As System.Windows.Forms.TextBox
    Friend WithEvents Label13 As System.Windows.Forms.Label
    Friend WithEvents vitalvalTextBox As System.Windows.Forms.TextBox
    Friend WithEvents Label12 As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents selectedLabel As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents searchButton As System.Windows.Forms.Button
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents descrTextBox As System.Windows.Forms.TextBox
    Friend WithEvents codeTextBox As System.Windows.Forms.TextBox
    Friend WithEvents vitalDataGridView As System.Windows.Forms.DataGridView
    Friend WithEvents Column1 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Column2 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Column3 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Column4 As System.Windows.Forms.DataGridViewTextBoxColumn

End Class
