<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Med
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
        Me.medDate1TimePicker = New System.Windows.Forms.DateTimePicker
        Me.Label14 = New System.Windows.Forms.Label
        Me.meddoseTextBox = New System.Windows.Forms.TextBox
        Me.Label12 = New System.Windows.Forms.Label
        Me.medtextTextBox = New System.Windows.Forms.TextBox
        Me.Label1 = New System.Windows.Forms.Label
        Me.medcsComboBox = New System.Windows.Forms.ComboBox
        Me.Label15 = New System.Windows.Forms.Label
        Me.medcodeTextBox = New System.Windows.Forms.TextBox
        Me.Label11 = New System.Windows.Forms.Label
        Me.medunitTextBox = New System.Windows.Forms.TextBox
        Me.Label2 = New System.Windows.Forms.Label
        Me.medDate2TimePicker = New System.Windows.Forms.DateTimePicker
        Me.Label3 = New System.Windows.Forms.Label
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.selectedLabel = New System.Windows.Forms.Label
        Me.Label6 = New System.Windows.Forms.Label
        Me.searchButton = New System.Windows.Forms.Button
        Me.Label5 = New System.Windows.Forms.Label
        Me.Label4 = New System.Windows.Forms.Label
        Me.descrTextBox = New System.Windows.Forms.TextBox
        Me.codeTextBox = New System.Windows.Forms.TextBox
        Me.medDataGridView = New System.Windows.Forms.DataGridView
        Me.Column1 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.Column2 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.Column3 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.Column4 = New System.Windows.Forms.DataGridViewTextBoxColumn
        Me.TableLayoutPanel1.SuspendLayout()
        Me.GroupBox1.SuspendLayout()
        CType(Me.medDataGridView, System.ComponentModel.ISupportInitialize).BeginInit()
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
        'medDate1TimePicker
        '
        Me.medDate1TimePicker.CustomFormat = "dd/MM/yyyy HH:mm:ss"
        Me.medDate1TimePicker.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.medDate1TimePicker.Location = New System.Drawing.Point(245, 376)
        Me.medDate1TimePicker.Name = "medDate1TimePicker"
        Me.medDate1TimePicker.Size = New System.Drawing.Size(159, 20)
        Me.medDate1TimePicker.TabIndex = 81
        '
        'Label14
        '
        Me.Label14.AutoSize = True
        Me.Label14.Location = New System.Drawing.Point(180, 380)
        Me.Label14.Name = "Label14"
        Me.Label14.Size = New System.Drawing.Size(53, 13)
        Me.Label14.TabIndex = 80
        Me.Label14.Text = "Date Low"
        '
        'meddoseTextBox
        '
        Me.meddoseTextBox.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.meddoseTextBox.Location = New System.Drawing.Point(246, 318)
        Me.meddoseTextBox.Name = "meddoseTextBox"
        Me.meddoseTextBox.Size = New System.Drawing.Size(60, 20)
        Me.meddoseTextBox.TabIndex = 77
        '
        'Label12
        '
        Me.Label12.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label12.AutoSize = True
        Me.Label12.Location = New System.Drawing.Point(180, 321)
        Me.Label12.Name = "Label12"
        Me.Label12.Size = New System.Drawing.Size(32, 13)
        Me.Label12.TabIndex = 76
        Me.Label12.Text = "Dose"
        '
        'medtextTextBox
        '
        Me.medtextTextBox.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.medtextTextBox.Location = New System.Drawing.Point(399, 90)
        Me.medtextTextBox.Name = "medtextTextBox"
        Me.medtextTextBox.Size = New System.Drawing.Size(160, 20)
        Me.medtextTextBox.TabIndex = 87
        Me.medtextTextBox.Visible = False
        '
        'Label1
        '
        Me.Label1.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(331, 93)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(58, 13)
        Me.Label1.TabIndex = 86
        Me.Label1.Text = "description"
        Me.Label1.Visible = False
        '
        'medcsComboBox
        '
        Me.medcsComboBox.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.medcsComboBox.FormattingEnabled = True
        Me.medcsComboBox.Location = New System.Drawing.Point(399, 56)
        Me.medcsComboBox.Name = "medcsComboBox"
        Me.medcsComboBox.Size = New System.Drawing.Size(160, 21)
        Me.medcsComboBox.TabIndex = 85
        Me.medcsComboBox.Visible = False
        '
        'Label15
        '
        Me.Label15.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label15.AutoSize = True
        Me.Label15.Location = New System.Drawing.Point(331, 59)
        Me.Label15.Name = "Label15"
        Me.Label15.Size = New System.Drawing.Size(69, 13)
        Me.Label15.TabIndex = 84
        Me.Label15.Text = "Code System"
        Me.Label15.Visible = False
        '
        'medcodeTextBox
        '
        Me.medcodeTextBox.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.medcodeTextBox.Location = New System.Drawing.Point(399, 20)
        Me.medcodeTextBox.Name = "medcodeTextBox"
        Me.medcodeTextBox.Size = New System.Drawing.Size(160, 20)
        Me.medcodeTextBox.TabIndex = 83
        Me.medcodeTextBox.Visible = False
        '
        'Label11
        '
        Me.Label11.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label11.AutoSize = True
        Me.Label11.Location = New System.Drawing.Point(331, 23)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(31, 13)
        Me.Label11.TabIndex = 82
        Me.Label11.Text = "code"
        Me.Label11.Visible = False
        '
        'medunitTextBox
        '
        Me.medunitTextBox.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.medunitTextBox.Location = New System.Drawing.Point(246, 347)
        Me.medunitTextBox.Name = "medunitTextBox"
        Me.medunitTextBox.Size = New System.Drawing.Size(60, 20)
        Me.medunitTextBox.TabIndex = 79
        '
        'Label2
        '
        Me.Label2.Anchor = CType(((System.Windows.Forms.AnchorStyles.Top Or System.Windows.Forms.AnchorStyles.Bottom) _
                    Or System.Windows.Forms.AnchorStyles.Left), System.Windows.Forms.AnchorStyles)
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(180, 353)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(26, 13)
        Me.Label2.TabIndex = 88
        Me.Label2.Text = "Unit"
        '
        'medDate2TimePicker
        '
        Me.medDate2TimePicker.CustomFormat = "dd/MM/yyyy HH:mm:ss"
        Me.medDate2TimePicker.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.medDate2TimePicker.Location = New System.Drawing.Point(246, 405)
        Me.medDate2TimePicker.Name = "medDate2TimePicker"
        Me.medDate2TimePicker.Size = New System.Drawing.Size(159, 20)
        Me.medDate2TimePicker.TabIndex = 90
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(180, 409)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(55, 13)
        Me.Label3.TabIndex = 89
        Me.Label3.Text = "Date High"
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
        Me.GroupBox1.Controls.Add(Me.medDataGridView)
        Me.GroupBox1.Location = New System.Drawing.Point(13, 7)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(556, 283)
        Me.GroupBox1.TabIndex = 91
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
        'medDataGridView
        '
        Me.medDataGridView.AllowUserToAddRows = False
        Me.medDataGridView.AllowUserToDeleteRows = False
        Me.medDataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.medDataGridView.Columns.AddRange(New System.Windows.Forms.DataGridViewColumn() {Me.Column1, Me.Column2, Me.Column3, Me.Column4})
        Me.medDataGridView.Location = New System.Drawing.Point(162, 26)
        Me.medDataGridView.Name = "medDataGridView"
        Me.medDataGridView.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect
        Me.medDataGridView.Size = New System.Drawing.Size(384, 210)
        Me.medDataGridView.TabIndex = 94
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
        'Med
        '
        Me.AcceptButton = Me.OK_Button
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.CancelButton = Me.Cancel_Button
        Me.ClientSize = New System.Drawing.Size(584, 472)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.medDate2TimePicker)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.medunitTextBox)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.medtextTextBox)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.medcsComboBox)
        Me.Controls.Add(Me.Label15)
        Me.Controls.Add(Me.medcodeTextBox)
        Me.Controls.Add(Me.Label11)
        Me.Controls.Add(Me.medDate1TimePicker)
        Me.Controls.Add(Me.Label14)
        Me.Controls.Add(Me.meddoseTextBox)
        Me.Controls.Add(Me.Label12)
        Me.Controls.Add(Me.TableLayoutPanel1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.MaximizeBox = False
        Me.MinimizeBox = False
        Me.Name = "Med"
        Me.ShowInTaskbar = False
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent
        Me.Text = "Medication entry"
        Me.TableLayoutPanel1.ResumeLayout(False)
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.medDataGridView, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents TableLayoutPanel1 As System.Windows.Forms.TableLayoutPanel
    Friend WithEvents OK_Button As System.Windows.Forms.Button
    Friend WithEvents Cancel_Button As System.Windows.Forms.Button
    Friend WithEvents medDate1TimePicker As System.Windows.Forms.DateTimePicker
    Friend WithEvents Label14 As System.Windows.Forms.Label
    Friend WithEvents meddoseTextBox As System.Windows.Forms.TextBox
    Friend WithEvents Label12 As System.Windows.Forms.Label
    Friend WithEvents medtextTextBox As System.Windows.Forms.TextBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents medcsComboBox As System.Windows.Forms.ComboBox
    Friend WithEvents Label15 As System.Windows.Forms.Label
    Friend WithEvents medcodeTextBox As System.Windows.Forms.TextBox
    Friend WithEvents Label11 As System.Windows.Forms.Label
    Friend WithEvents medunitTextBox As System.Windows.Forms.TextBox
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents medDate2TimePicker As System.Windows.Forms.DateTimePicker
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents descrTextBox As System.Windows.Forms.TextBox
    Friend WithEvents codeTextBox As System.Windows.Forms.TextBox
    Friend WithEvents medDataGridView As System.Windows.Forms.DataGridView
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents searchButton As System.Windows.Forms.Button
    Friend WithEvents selectedLabel As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents Column1 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Column2 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Column3 As System.Windows.Forms.DataGridViewTextBoxColumn
    Friend WithEvents Column4 As System.Windows.Forms.DataGridViewTextBoxColumn

End Class
