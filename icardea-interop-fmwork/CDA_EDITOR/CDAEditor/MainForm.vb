Imports System.IO
Imports System.Net
Imports System.Xml
Imports System.Xml.XPath
Imports System.Configuration
Imports System.Security.Cryptography.X509Certificates
Imports System.Net.Security

Public Class MainForm
    Dim dt As DataTable
    Dim dv As DataView
    Dim path As String = ""
    Dim pnr_path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString() + "\\pnr.xml"
    Dim boundary_uuid As String
    Dim selectedCDA, selectedFile As String
    Dim edit As Boolean = False
    Dim editCDA As String = ""
    'Dim medical_data, general_data, lab_data, proc_data, prob_data As String




    Private Function GetUUID() As String
        Dim RandomClass As New Random()
        Dim RandomNumber As Integer
        RandomNumber = RandomClass.Next(Integer.MinValue, Integer.MaxValue)
        Dim res As String = RandomNumber.ToString("X")
        Return res
    End Function

    Private Sub CheckDir()

        Try
            Dim strFileSize As String = ""
            Dim di As New IO.DirectoryInfo(path)
            Dim aryFi As IO.FileInfo() = di.GetFiles("*.xml")
            Dim fi As IO.FileInfo
            dt.Rows.Clear()
            For Each fi In aryFi
                strFileSize = (Math.Round(fi.Length / 1024)).ToString()
                Dim dr As DataRow = dt.NewRow
                dr("FILENAME") = fi.DirectoryName + "\" + fi.Name
                dr("FILESIZE") = strFileSize
                dr("DATECREATED") = fi.CreationTime
                'Console.WriteLine("File Name: {0}", fi.Name)
                'Console.WriteLine("File Full Name: {0}", fi.FullName)
                'Console.WriteLine("File Size (KB): {0}", strFileSize)
                'Console.WriteLine("File Extension: {0}", fi.Extension)
                'Console.WriteLine("Last Accessed: {0}", fi..LastAccessTime)
                'Console.WriteLine("Read Only: {0}", (fi.Attributes.ReadOnly = True).ToString)
                dt.Rows.Add(dr)
            Next
            Dim selected As Integer = 0
            Try
                selected = FilesDataGridView.SelectedRows.Item(0).Index
            Catch ex As Exception
            End Try
            dv = New DataView(dt, "", "DATECREATED desc", DataViewRowState.CurrentRows)
            FilesDataGridView.DataSource = dv
            FilesDataGridView.CurrentCell = FilesDataGridView.Rows(selected).Cells(0)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Function GetPNRTemplate() As String
        Dim sr As StreamReader = Nothing
        Try
            sr = New StreamReader(pnr_path)
            Dim content As String = sr.ReadToEnd()
            Return content
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Function

    Private Sub MainForm_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Try
            path = System.Configuration.ConfigurationSettings.AppSettings("sharedDir").ToString()
            If Not Directory.Exists(path) Then
                MessageBox.Show("The path you have set for reading CDA documents is invalid")
                'Application.Exit()
            End If
            dt = New DataTable
            dt.Columns.Add("FILENAME")
            dt.Columns.Add("FILESIZE")
            Dim dc As DataColumn = New DataColumn("DATECREATED", System.Type.GetType("System.DateTime"))
            dt.Columns.Add(dc)



            declarations.GetTemplates()
            declarations.InitLists()
            InitVitalCodeList()
            InitLabCodeList()
            InitProbCodeList()
            InitProcCodeList()
            InitMedCodeList()
            sexComboBox.DataSource = declarations.sex_dt
            sexComboBox.DisplayMember = "descr"
            sexComboBox.ValueMember = "code"
            esexComboBox.DataSource = declarations.sex_dt
            esexComboBox.DisplayMember = "descr"
            esexComboBox.ValueMember = "code"

            declarations.InitDTs()

            cdaSaveFileDialog.InitialDirectory = path
            cdaSaveFileDialog.Filter = "XML File|*.xml"

        Catch ex As Exception
            MessageBox.Show("Error loading config info")
            Application.Exit()
        Finally

        End Try

    End Sub

    Private Sub dirTimer_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles dirTimer.Tick
        If Directory.Exists(path) Then
            CheckDir()
        End If

    End Sub

    Private Sub GetGeneral(ByVal xd As XmlDocument)
        Try
            Dim node As XmlNode
            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/patient/name/given")
            If Not IsNothing(node) Then
                fnameTextBox.Text = node.InnerText.Trim
            End If

            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/patient/name/family")
            If Not IsNothing(node) Then
                lnameTextBox.Text = node.InnerText.Trim
            End If

            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/id/@root")
            If Not IsNothing(node) Then
                nspTextBox.Text = node.Value
            End If

            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/id/@extension")
            If Not IsNothing(node) Then
                idTextBox.Text = node.Value
            End If

            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/patient/administrativeGenderCode/@code")
            If Not IsNothing(node) Then
                sexComboBox.SelectedValue = node.Value
            End If

            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/patient/birthTime/@value")
            If Not IsNothing(node) Then
                Dim dob As Date
                dob = New Date(CInt(node.Value.Substring(0, 4)), CInt(node.Value.Substring(4, 2)), CInt(node.Value.Substring(6, 2)))
                dobDateTimePicker.Value = dob
            End If

        Catch ex As Exception
            MessageBox.Show("Error loading general info: " + ex.Message)
        End Try
    End Sub

    Private Sub GetProb(ByVal xd As XmlDocument)
        Dim prob_status, prob_type_code, prob_type_text, prob_codesystem, prob_codesysname, prob_date_low, prob_date_high, prob_xsitype, prob_value_code, prob_text
        Try
            Dim nodelist As XmlNodeList
            nodelist = xd.SelectNodes("/ClinicalDocument/component/structuredBody/component/section/entry/observation")
            If IsNothing(nodelist) Then
                Return
            End If

            For i As Integer = 0 To nodelist.Count - 1
                If nodelist(i).SelectNodes("templateId[@root='1.3.6.1.4.1.19376.1.5.3.1.4.5']").Count > 0 Then
                    prob_date_low = nodelist(i).SelectSingleNode("effectiveTime/low/@value").Value
                    prob_date_high = nodelist(i).SelectSingleNode("effectiveTime/high/@value").Value
                    prob_type_code = nodelist(i).SelectSingleNode("code/@code").Value
                    prob_type_text = nodelist(i).SelectSingleNode("code/@displayName").Value
                    'prob_xsitype = nodelist(i).SelectSingleNode("entryRelationship/observation/value/@xsi:type").Value
                    prob_value_code = nodelist(i).SelectSingleNode("value/@code").Value
                    prob_text = nodelist(i).SelectSingleNode("value/@displayName").Value
                    prob_codesystem = nodelist(i).SelectSingleNode("value/@codeSystem").Value
                    prob_codesysname = nodelist(i).SelectSingleNode("value/@codeSystemName").Value
                    prob_status = nodelist(i).SelectSingleNode("statusCode/@code").Value
                    NewProbEntry(prob_type_code, prob_type_text, prob_codesystem, prob_codesysname, prob_date_low, prob_date_high, "CD", prob_value_code, prob_text, prob_status)
                End If
            Next
        Catch ex As Exception
            MessageBox.Show("Error loading Problem info: " + ex.Message)
        End Try
    End Sub

    Private Sub GetLab(ByVal xd As XmlDocument)
        Dim lab_code, lab_text, lab_codesystem, lab_codesysname, lab_date, lab_xsitype, lab_value, lab_unit
        Try
            Dim nodelist As XmlNodeList
            nodelist = xd.SelectNodes("/ClinicalDocument/component/structuredBody/component/section/entry/observation")
            If IsNothing(nodelist) Then
                Return
            End If
            For i As Integer = 0 To nodelist.Count - 1
                If nodelist(i).SelectNodes("templateId[@root='1.3.6.1.4.1.19376.1.5.3.1.4.13']").Count > 0 AndAlso nodelist(i).SelectNodes("templateId[@root='1.3.6.1.4.1.19376.1.5.3.1.4.13.2']").Count = 0 Then
                    lab_date = nodelist(i).SelectSingleNode("effectiveTime/@value").Value
                    lab_value = nodelist(i).SelectSingleNode("value/@value").Value
                    lab_unit = nodelist(i).SelectSingleNode("value/@unit").Value
                    'lab_xsitype = nodelist(i).SelectSingleNode("code/@xsi:type").Value
                    lab_code = nodelist(i).SelectSingleNode("code/@code").Value
                    lab_text = nodelist(i).SelectSingleNode("code/@displayName").Value
                    lab_codesystem = nodelist(i).SelectSingleNode("code/@codeSystem").Value
                    lab_codesysname = nodelist(i).SelectSingleNode("code/@codeSystemName").Value
                    NewLabEntry(lab_code, lab_text, lab_codesystem, lab_codesysname, lab_date, "PQ", lab_value, lab_unit)
                End If
            Next
        Catch ex As Exception
            MessageBox.Show("Error loading Problem info: " + ex.Message)
        End Try
    End Sub

    Private Sub GetVital(ByVal xd As XmlDocument)
        Dim vital_code, vital_text, vital_codesystem, vital_codesysname, vital_date, vital_xsitype, vital_value, vital_unit
        Try
            Dim nodelist As XmlNodeList
            nodelist = xd.SelectNodes("/ClinicalDocument/component/structuredBody/component/section/entry/observation")
            If IsNothing(nodelist) Then
                Return
            End If
            For i As Integer = 0 To nodelist.Count - 1
                If nodelist(i).SelectNodes("templateId[@root='1.3.6.1.4.1.19376.1.5.3.1.4.13']").Count = 0 AndAlso nodelist(i).SelectNodes("templateId[@root='1.3.6.1.4.1.19376.1.5.3.1.4.13.2']").Count > 0 Then
                    vital_date = nodelist(i).SelectSingleNode("effectiveTime/@value").Value
                    vital_value = nodelist(i).SelectSingleNode("value/@value").Value
                    vital_unit = nodelist(i).SelectSingleNode("value/@unit").Value
                    'vital_xsitype = nodelist(i).SelectSingleNode("code/@xsi:type").Value
                    vital_code = nodelist(i).SelectSingleNode("code/@code").Value
                    vital_text = nodelist(i).SelectSingleNode("code/@displayName").Value
                    vital_codesystem = nodelist(i).SelectSingleNode("code/@codeSystem").Value
                    vital_codesysname = nodelist(i).SelectSingleNode("code/@codeSystemName").Value
                    NewVitalEntry(vital_code, vital_text, vital_codesystem, vital_codesysname, vital_date, "PQ", vital_value, vital_unit)
                End If
            Next
        Catch ex As Exception
            MessageBox.Show("Error loading Problem info: " + ex.Message)
        End Try
    End Sub

    Private Sub GetProc(ByVal xd As XmlDocument)
        Dim proc_codesystem, proc_codesysname, proc_date_low, proc_date_high, proc_code, proc_text
        Try
            Dim nodelist As XmlNodeList
            nodelist = xd.SelectNodes("/ClinicalDocument/component/structuredBody/component/section/entry/procedure")
            If IsNothing(nodelist) Then
                Return
            End If

            For i As Integer = 0 To nodelist.Count - 1
                If nodelist(i).SelectNodes("templateId[@root='1.3.6.1.4.1.19376.1.5.3.1.4.19']").Count > 0 Then
                    proc_date_low = nodelist(i).SelectSingleNode("effectiveTime/low/@value").Value
                    proc_date_high = nodelist(i).SelectSingleNode("effectiveTime/high/@value").Value
                    proc_code = nodelist(i).SelectSingleNode("code/@code").Value
                    proc_text = nodelist(i).SelectSingleNode("code/@displayName").Value
                    proc_codesystem = nodelist(i).SelectSingleNode("code/@codeSystem").Value
                    proc_codesysname = nodelist(i).SelectSingleNode("code/@codeSystemName").Value
                    NewProcEntry(proc_code, proc_text, proc_codesystem, proc_codesysname, proc_date_low, proc_date_high)
                End If
            Next
        Catch ex As Exception
            MessageBox.Show("Error loading Problem info: " + ex.Message)
        End Try
    End Sub

    Private Sub GetMed(ByVal xd As XmlDocument)
        Dim med_code, med_text, med_codesystem, med_codesysname, med_date_low, med_date_high, med_dose, med_unit
        Try
            Dim nodelist As XmlNodeList
            nodelist = xd.SelectNodes("/ClinicalDocument/component/structuredBody/component/section/entry/substanceAdministration")
            If IsNothing(nodelist) Then
                Return
            End If
            For i As Integer = 0 To nodelist.Count - 1
                If nodelist(i).SelectNodes("templateId[@root='1.3.6.1.4.1.19376.1.5.3.1.4.7']").Count > 0 Then
                    med_date_low = nodelist(i).SelectSingleNode("effectiveTime/low/@value").Value
                    med_date_high = nodelist(i).SelectSingleNode("effectiveTime/high/@value").Value
                    med_dose = nodelist(i).SelectSingleNode("doseQuantity/@value").Value
                    med_unit = nodelist(i).SelectSingleNode("doseQuantity/@unit").Value
                    med_code = nodelist(i).SelectSingleNode("consumable/manufacturedProduct/manufacturedLabeledDrug/code/@code").Value
                    med_text = nodelist(i).SelectSingleNode("consumable/manufacturedProduct/manufacturedLabeledDrug/code/@displayName").Value
                    med_codesystem = nodelist(i).SelectSingleNode("consumable/manufacturedProduct/manufacturedLabeledDrug/code/@codeSystem").Value
                    med_codesysname = nodelist(i).SelectSingleNode("consumable/manufacturedProduct/manufacturedLabeledDrug/code/@codeSystemName").Value
                    NewMedEntry(med_code, med_text, med_codesystem, med_codesysname, med_date_low, med_date_high, med_dose, med_unit)
                End If
            Next
        Catch ex As Exception
            MessageBox.Show("Error loading Medications info: " + ex.Message)
        End Try
    End Sub

    Private Sub FilesDataGridView_CellMouseDoubleClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles FilesDataGridView.CellMouseDoubleClick
        Dim xd As XmlDocument = New XmlDocument()
        Dim sr As StreamReader = Nothing
        Try
            editCDA = FilesDataGridView.SelectedRows(0).Cells(0).Value.ToString
            FileNameTextBox.Text = editCDA
            sr = New StreamReader(editCDA)
            Dim content As String = sr.ReadToEnd()
            content = content.Replace("xmlns=""urn:hl7-org:v3""", "")
            xd.LoadXml(content)
            declarations.InitDTs()
            edit = True
            GetGeneral(xd)
            GetLab(xd)
            GetVital(xd)
            GetProb(xd)
            GetProc(xd)
            GetMed(xd)
            RefreshGrid(probentriesDataGridView, prob_dt)
            RefreshGrid(labentriesDataGridView, lab_dt)
            RefreshGrid(vitalentriesDataGridView, vital_dt)
            RefreshGrid(procentriesDataGridView, proc_dt)
            RefreshGrid(medentriesDataGridView, med_dt)
            MainTabControl.SelectTab(EditTabPage)
        Catch ex As Exception
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try

    End Sub

    Public Shared Function StrToByteArray(ByVal str As String) As Byte()
        Dim encoding As New System.Text.UTF8Encoding()
        Return encoding.GetBytes(str)
    End Function

    Private Function StrToBase64(ByVal strOriginal As String)
        Dim byt As Byte() = System.Text.Encoding.UTF8.GetBytes(strOriginal)
        Dim strModified As String = Convert.ToBase64String(byt)
        Return strModified
    End Function


    Private Function Provide_Register(ByVal doc_id As String, ByVal cda_content As String) As String
        Dim SoapEnv As String = ""
        'Dim url As String = "http://iapetus.ics.forth.gr:9080/"
        Dim url As String
        Dim result As String = ""
        Dim myWriter As StreamWriter

        url = System.Configuration.ConfigurationSettings.AppSettings("xds").ToString()

        boundary_uuid = GetUUID()
        'Return ""
        SoapEnv = "" + _
            "--MIMEBoundaryurn_uuid_" + boundary_uuid + vbCrLf + _
                "Content-Type: application/xop+xml; charset=UTF-8; type=""application/soap+xml""" + vbCrLf + vbCrLf
        'SoapEnv = "--MIMEBoundaryurn_uuid_" + boundary_uuid + vbCrLf + _
        '        "Content-Type: application/soap+xml; charset=UTF-8" + vbCrLf + vbCrLf




        Dim tmp As String = GetPNRTemplate()
        tmp = tmp.Replace("BASE64_DOCUMENT", StrToBase64(cda_content))
        tmp = tmp.Replace("MESSAGE_UUID", GetUUID())

        'Dim xpathDoc As XPathDocument
        'Dim xmlNav As XPathNavigator
        'Dim xmlNI As XPathNodeIterator
        Dim DOCUMENT_TYPE_CODE_CODING_SCHEME, DOCUMENT_CLASS_CODE_CODING_SCHEME, DOCUMENT_CREATION_TIME, DOCUMENT_LANGUAGE_CODE, DOCUMENT_SERVICE_START_TIME, DOCUMENT_SERVICE_STOP_TIME, PATIENT_ID, AUTHOR_NAME, AUTHOR_INSTITUTION, DOCUMENT_CLASS_CODE, DOCUMENT_TYPE_CODE, DOCUMENT_UNIQUE_ID As String
        Dim SUBMISSION_SET_SUBMISSION_TIME, SUBMISSION_SET_UNIQUE_ID, SUBMISSION_SET_SOURCE_ID As String

        '???DOCUMENT_CLASS_CODE_CODING_SCHEME,DOCUMENT_CLASS_CODE,SUBMISSION_SET_UNIQUE_ID,SUBMISSION_SET_SOURCE_ID

        Dim xd As XmlDocument = New XmlDocument()
        Try
            'xd.Load(selectedCDA)
            Dim tmp_cda As String = cda_content.Replace("xmlns=""urn:hl7-org:v3""", "")
            xd.LoadXml(tmp_cda)
            Dim node As XmlNode

            node = xd.SelectSingleNode("/ClinicalDocument/effectiveTime/@value")
            If Not IsNothing(node) Then
                DOCUMENT_CREATION_TIME = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_CREATION_TIME", DOCUMENT_CREATION_TIME)

            node = xd.SelectSingleNode("/ClinicalDocument/documentationOf/serviceEvent/effectiveTime/low/@value")
            If Not IsNothing(node) Then
                DOCUMENT_SERVICE_START_TIME = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_SERVICE_START_TIME", DOCUMENT_SERVICE_START_TIME)

            node = xd.SelectSingleNode("/ClinicalDocument/documentationOf/serviceEvent/effectiveTime/high/@value")
            If Not IsNothing(node) Then
                DOCUMENT_SERVICE_STOP_TIME = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_SERVICE_STOP_TIME", DOCUMENT_SERVICE_STOP_TIME)

            node = xd.SelectSingleNode("/ClinicalDocument/languageCode/@code")
            If Not IsNothing(node) Then
                DOCUMENT_LANGUAGE_CODE = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_LANGUAGE_CODE", DOCUMENT_LANGUAGE_CODE)

            node = xd.SelectSingleNode("/ClinicalDocument/code/@codeSystem")
            If Not IsNothing(node) Then
                DOCUMENT_CLASS_CODE_CODING_SCHEME = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_CLASS_CODE_CODING_SCHEME", DOCUMENT_CLASS_CODE_CODING_SCHEME)

            node = xd.SelectSingleNode("/ClinicalDocument/code/@code")
            If Not IsNothing(node) Then
                DOCUMENT_CLASS_CODE = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_CLASS_CODE", DOCUMENT_CLASS_CODE)

            node = xd.SelectSingleNode("/ClinicalDocument/code/@codeSystem")
            If Not IsNothing(node) Then
                DOCUMENT_TYPE_CODE_CODING_SCHEME = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_TYPE_CODE_CODING_SCHEME", DOCUMENT_TYPE_CODE_CODING_SCHEME)

            node = xd.SelectSingleNode("/ClinicalDocument/code/@code")
            If Not IsNothing(node) Then
                DOCUMENT_TYPE_CODE = node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_TYPE_CODE", DOCUMENT_TYPE_CODE)

            node = xd.SelectSingleNode("/ClinicalDocument/id/@root")
            If Not IsNothing(node) Then
                DOCUMENT_UNIQUE_ID = node.Value
            End If
            node = xd.SelectSingleNode("/ClinicalDocument/id/@extension")
            If Not IsNothing(node) Then
                DOCUMENT_UNIQUE_ID += "^" + node.Value
            End If
            tmp = tmp.Replace("DOCUMENT_UNIQUE_ID", DOCUMENT_UNIQUE_ID)

            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/id/@extension")
            If Not IsNothing(node) Then
                PATIENT_ID = node.Value
                Audit.patientid = PATIENT_ID
            End If
            node = xd.SelectSingleNode("/ClinicalDocument/recordTarget/patientRole/id/@root")
            If Not IsNothing(node) Then
                PATIENT_ID += "^^^&" + node.Value
            End If
            tmp = tmp.Replace("PATIENT_ID", PATIENT_ID)

            node = xd.SelectSingleNode("/ClinicalDocument/author/assignedAuthor/assignedPerson/name/family")
            If Not IsNothing(node) Then
                AUTHOR_NAME = "^" + node.InnerText
            End If
            node = xd.SelectSingleNode("/ClinicalDocument/author/assignedAuthor/assignedPerson/name/given")
            If Not IsNothing(node) Then
                AUTHOR_NAME += "^" + node.InnerText + "^^^"
            End If
            tmp = tmp.Replace("AUTHOR_NAME", AUTHOR_NAME)

            node = xd.SelectSingleNode("/ClinicalDocument/author/assignedAuthor/representedOrganization/name")
            If Not IsNothing(node) Then
                AUTHOR_INSTITUTION = node.InnerText
            End If
            tmp = tmp.Replace("AUTHOR_INSTITUTION", AUTHOR_INSTITUTION)

            Dim s As String = DateTime.Now.Year.ToString + Format(DateTime.Now, "MMddHHmmss")
            SUBMISSION_SET_SUBMISSION_TIME = s.Substring(0, 4) + s.Substring(4, 2) + s.Substring(6, 2) + s.Substring(8, 2) + s.Substring(10, 2) + s.Substring(12, 2)
            tmp = tmp.Replace("SUBMISSION_SET_SUBMISSION_TIME", SUBMISSION_SET_SUBMISSION_TIME)

            tmp = tmp.Replace("SUBMISSION_SET_SOURCE_ID", "5.4.3.2.1")
            SUBMISSION_SET_UNIQUE_ID = GetUUID()
            Audit.submissionsetid = SUBMISSION_SET_UNIQUE_ID
            tmp = tmp.Replace("SUBMISSION_SET_UNIQUE_ID", SUBMISSION_SET_UNIQUE_ID)
            'Audit.patientid = PATIENT_ID





        Catch ex As XPathException
            'MessageBox.Show("XMLException: " + ex.Message)
            Return ""
        Catch ex As Exception
            'MessageBox.Show("Exception: " + ex.Message)
            Return ""
        End Try
        SoapEnv += tmp

        SoapEnv += vbCrLf + "--MIMEBoundaryurn_uuid_" + boundary_uuid + "--"
        SoapEnv = SoapEnv.Replace("&", "&amp;")



        ServicePointManager.ServerCertificateValidationCallback = New System.Net.Security.RemoteCertificateValidationCallback(Function(sender2 As Object, certificate As X509Certificate, chain As X509Chain, sslPolicyErrors As SslPolicyErrors) True)




        Dim objRequest As HttpWebRequest = WebRequest.Create(url)


        If Not objRequest Is Nothing Then
            objRequest.Method = "POST"
            objRequest.ContentType = "multipart/related; boundary=MIMEBoundaryurn_uuid_" + boundary_uuid + "; type=""application/xop+xml"";  start-info=""application/soap+xml""; action=""urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b"""
            'objRequest.ContentType = "multipart/related; boundary=MIME_boundary; type=""application/xop+xml""; start-info=""application/soap+xml""; action=""urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b"""

            'objRequest.Headers.Add("SOAPAction", "http://tempuri.org/HelloWorld")
            Dim sr As StreamReader = Nothing
            Dim objResponse As HttpWebResponse = Nothing
            Dim esr As StreamReader = Nothing
            Try
                myWriter = New StreamWriter(objRequest.GetRequestStream())
                myWriter.Write(SoapEnv)


                If Not myWriter Is Nothing Then
                    myWriter.Close()
                End If

                objResponse = objRequest.GetResponse()

                sr = New StreamReader(objResponse.GetResponseStream())
                result = sr.ReadToEnd()
            Catch ex As WebException 'Exception
                'esr = New StreamReader(ex.Response.GetResponseStream())

                'result = esr.ReadToEnd()
                MessageBox.Show(ex.Message)
                Return ""
            Catch ex As Exception
                Return ""
            Finally
                If Not IsNothing(sr) Then
                    sr.Close()
                End If
                If Not IsNothing(objResponse) Then
                    objResponse.Close()
                    objRequest.Abort()
                End If
                objRequest = Nothing
                myWriter = Nothing
            End Try

        End If

        Audit.AuditMsgITI41()

        Return result
    End Function

    Private Sub PRButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles PRButton.Click, registerButton2.Click
        Dim res As String
        res = Provide_Register("Document01", cdaRichTextBox.Text.Trim)
        If res = "" Then
            MessageBox.Show("Failed to make the registration")
        Else
            MessageBox.Show("Registration completed")
        End If
    End Sub

    Private Sub FilesDataGridView_RowsAdded(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewRowsAddedEventArgs) Handles FilesDataGridView.RowsAdded
        'FilesDataGridView.row()
        'FilesDataGridView.Rows(e.RowIndex).DefaultCellStyle.BackColor = Color.White
        Dim i, j As Integer
        For i = 0 To FilesDataGridView.Rows(e.RowIndex).Cells.Count - 1
            FilesDataGridView.Rows(e.RowIndex).Cells(i).Style.SelectionBackColor = Color.White
            FilesDataGridView.Rows(e.RowIndex).Cells(i).Style.SelectionForeColor = Color.Black
        Next
        If Not IsNothing(selectedFile) Then
            If FilesDataGridView.Rows(e.RowIndex).Cells(0).Value = selectedFile Then
                FilesDataGridView.Rows(e.RowIndex).Selected = True
                For j = 0 To FilesDataGridView.Rows(e.RowIndex).Cells.Count - 1
                    FilesDataGridView.Rows(e.RowIndex).Cells(j).Style.SelectionBackColor = Color.Silver
                    FilesDataGridView.Rows(e.RowIndex).Cells(j).Style.SelectionForeColor = Color.Black
                Next
            Else
                FilesDataGridView.Rows(e.RowIndex).Selected = False
            End If
        End If
    End Sub

    Private Sub browseButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles browseButton.Click
        cdaSaveFileDialog.ShowDialog()
        FileNameTextBox.Text = cdaSaveFileDialog.FileName.Trim
    End Sub

    Private Sub CDAsaveButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles CDAsaveButton.Click
        Dim sw As StreamWriter = Nothing
        Dim str As String = ""
        Dim medical_data As String = ""
        Try
            sw = New StreamWriter(FileNameTextBox.Text.Trim, False)
            str = SetGeneralStr()
            If str.Trim.Length = 0 Then
                MessageBox.Show("Input missing")
                Return
            End If
            medical_data += GetLabEntries(lab_dt)
            medical_data += GetVitalEntries(vital_dt)
            medical_data += GetProbEntries(prob_dt)
            medical_data += GetProcEntries(proc_dt)
            medical_data += GetMedEntries(med_dt)
            str = str.Replace("TMP_MEDICAL_DATA", medical_data)
            sw.Write(str.Replace("&", "&amp;"))
            MainTabControl.SelectTab(ViewTabPage)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(sw) Then
                sw.Close()
            End If
        End Try
    End Sub

    Private Function SetGeneralStr() As String
        If fnameTextBox.Text.Trim.Length = 0 Or lnameTextBox.Text.Trim.Length = 0 Or nspTextBox.Text.Trim.Length = 0 Or idTextBox.Text.Trim.Length = 0 Or sexComboBox.SelectedValue.ToString = "EMPTY" Or dobDateTimePicker.Value = Nothing Then
            Return ""
        End If
        Dim general_tmp As String = declarations.general
        Dim cur_date As String = Date.Now.ToString("yyyyMMddHHmmss")
        general_tmp = general_tmp.Replace("TMP_CREATION_DATE", cur_date)
        general_tmp = general_tmp.Replace("TMP_AUTHOR_TIME", cur_date)
        general_tmp = general_tmp.Replace("TMP_AUTHOR_GIVEN", "V1")
        general_tmp = general_tmp.Replace("TMP_AUTHOR_FAMILY", "CDA_EDITOR")
        general_tmp = general_tmp.Replace("TMP_LEGALAUTH_TIME", cur_date)
        general_tmp = general_tmp.Replace("TMP_GIVEN_NAME", fnameTextBox.Text.Trim)
        general_tmp = general_tmp.Replace("TMP_FAMILY_NAME", lnameTextBox.Text.Trim)
        general_tmp = general_tmp.Replace("TMP_PATIENTID_ROOT", nspTextBox.Text.Trim)
        general_tmp = general_tmp.Replace("TMP_PATIENTID_EXT", idTextBox.Text.Trim)
        general_tmp = general_tmp.Replace("TMP_SEX", sexComboBox.SelectedValue.ToString)
        general_tmp = general_tmp.Replace("TMP_BIRTHDATE", dobDateTimePicker.Value.ToString("yyyyMMdd"))
        general_tmp = general_tmp.Replace("TMP_CDA_EXT", "c" + cur_date)
        general_tmp = general_tmp.Replace("TMP_CDA_RELATEDDOC", "")
        Return general_tmp
    End Function

    Private Sub EditTabPage_Enter(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EditTabPage.Enter
        Try
            'declarations.RefreshGrid(labentriesDataGridView, lab_dt)

        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try

    End Sub

    Private Sub NewLabButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NewLabButton.Click
        Dim frm As Lab = New Lab(Nothing)
        Try
            Dim res As DialogResult = frm.ShowDialog()
            If DialogResult.OK = res Then
                declarations.RefreshGrid(labentriesDataGridView, declarations.lab_dt)
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(frm) Then
                frm.Dispose()
            End If
        End Try
    End Sub

    Private Sub NewCDAButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NewCDAButton.Click
        edit = False
        declarations.InitDTs()
        RefreshGrid(probentriesDataGridView, prob_dt)
        RefreshGrid(labentriesDataGridView, lab_dt)
        RefreshGrid(vitalentriesDataGridView, vital_dt)
        RefreshGrid(procentriesDataGridView, proc_dt)
        RefreshGrid(medentriesDataGridView, med_dt)
        FileNameTextBox.Text = ""
        fnameTextBox.Text = ""
        lnameTextBox.Text = ""
        idTextBox.Text = ""
        nspTextBox.Text = ""
        sexComboBox.SelectedValue = "EMPTY"
        dobDateTimePicker.Value = Date.Now
        MainTabControl.SelectTab(EditTabPage)
    End Sub

    Private Sub DelLabButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles DelLabButton.Click
        Try
            If labentriesDataGridView.SelectedRows.Count = 0 OrElse labentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse labentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim res As DialogResult = MessageBox.Show("Remove the selected entry?", "WARNING", MessageBoxButtons.YesNo, MessageBoxIcon.Warning, MessageBoxDefaultButton.Button2)
            If res = DialogResult.No Then
                Return
            End If
            lab_dt.Rows.Remove(lab_dt.Rows.Find(CInt(labentriesDataGridView.SelectedRows(0).Cells(0).Value)))
            RefreshGrid(labentriesDataGridView, lab_dt)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub EditLabButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EditLabButton.Click
        Try
            If labentriesDataGridView.SelectedRows.Count = 0 OrElse labentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse labentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim dr As DataRow = lab_dt.Rows.Find(CInt(labentriesDataGridView.SelectedRows(0).Cells(0).Value))
            Dim frm As Lab = New Lab(dr)
            Try
                Dim res As DialogResult = frm.ShowDialog()
                If DialogResult.OK = res Then
                    declarations.RefreshGrid(labentriesDataGridView, declarations.lab_dt)
                End If
            Catch ex As Exception
                MessageBox.Show(ex.Message)
            Finally
                If Not IsNothing(frm) Then
                    frm.Dispose()
                End If
            End Try
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub AddProbButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles AddProbButton.Click
        Dim frm As Prob = New Prob(Nothing)
        Try
            Dim res As DialogResult = frm.ShowDialog()
            If DialogResult.OK = res Then
                declarations.RefreshGrid(probentriesDataGridView, declarations.prob_dt)
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(frm) Then
                frm.Dispose()
            End If
        End Try
    End Sub

    Private Sub EditProbButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EditProbButton.Click
        Try
            If probentriesDataGridView.SelectedRows.Count = 0 OrElse probentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse probentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim dr As DataRow = prob_dt.Rows.Find(CInt(probentriesDataGridView.SelectedRows(0).Cells(0).Value))
            Dim frm As Prob = New Prob(dr)
            Try
                Dim res As DialogResult = frm.ShowDialog()
                If DialogResult.OK = res Then
                    declarations.RefreshGrid(probentriesDataGridView, declarations.prob_dt)
                End If
            Catch ex As Exception
                MessageBox.Show(ex.Message)
            Finally
                If Not IsNothing(frm) Then
                    frm.Dispose()
                End If
            End Try
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub DelProbButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles DelProbButton.Click
        Try
            If probentriesDataGridView.SelectedRows.Count = 0 OrElse probentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse probentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim res As DialogResult = MessageBox.Show("Remove the selected entry?", "WARNING", MessageBoxButtons.YesNo, MessageBoxIcon.Warning, MessageBoxDefaultButton.Button2)
            If res = DialogResult.No Then
                Return
            End If
            prob_dt.Rows.Remove(prob_dt.Rows.Find(CInt(probentriesDataGridView.SelectedRows(0).Cells(0).Value)))
            RefreshGrid(probentriesDataGridView, prob_dt)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub AddProcButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles AddProcButton.Click
        Dim frm As Proc = New Proc(Nothing)
        Try
            Dim res As DialogResult = frm.ShowDialog()
            If DialogResult.OK = res Then
                declarations.RefreshGrid(procentriesDataGridView, declarations.proc_dt)
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(frm) Then
                frm.Dispose()
            End If
        End Try
    End Sub

    Private Sub EditProcButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EditProcButton.Click
        Try
            If procentriesDataGridView.SelectedRows.Count = 0 OrElse procentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse procentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim dr As DataRow = proc_dt.Rows.Find(CInt(procentriesDataGridView.SelectedRows(0).Cells(0).Value))
            Dim frm As Proc = New Proc(dr)
            Try
                Dim res As DialogResult = frm.ShowDialog()
                If DialogResult.OK = res Then
                    declarations.RefreshGrid(procentriesDataGridView, declarations.proc_dt)
                End If
            Catch ex As Exception
                MessageBox.Show(ex.Message)
            Finally
                If Not IsNothing(frm) Then
                    frm.Dispose()
                End If
            End Try
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub delProcButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles delProcButton.Click
        Try
            If procentriesDataGridView.SelectedRows.Count = 0 OrElse procentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse procentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim res As DialogResult = MessageBox.Show("Remove the selected entry?", "WARNING", MessageBoxButtons.YesNo, MessageBoxIcon.Warning, MessageBoxDefaultButton.Button2)
            If res = DialogResult.No Then
                Return
            End If
            proc_dt.Rows.Remove(proc_dt.Rows.Find(CInt(procentriesDataGridView.SelectedRows(0).Cells(0).Value)))
            RefreshGrid(procentriesDataGridView, proc_dt)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub NewVitalButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NewVitalButton.Click
        Dim frm As Vital = New Vital(Nothing)
        Try
            Dim res As DialogResult = frm.ShowDialog()
            If DialogResult.OK = res Then
                declarations.RefreshGrid(vitalentriesDataGridView, declarations.vital_dt)
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(frm) Then
                frm.Dispose()
            End If
        End Try
    End Sub

    Private Sub EditVitalButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EditVitalButton.Click
        Try
            If vitalentriesDataGridView.SelectedRows.Count = 0 OrElse vitalentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse vitalentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim dr As DataRow = vital_dt.Rows.Find(CInt(vitalentriesDataGridView.SelectedRows(0).Cells(0).Value))
            Dim frm As Vital = New Vital(dr)
            Try
                Dim res As DialogResult = frm.ShowDialog()
                If DialogResult.OK = res Then
                    declarations.RefreshGrid(vitalentriesDataGridView, declarations.vital_dt)
                End If
            Catch ex As Exception
                MessageBox.Show(ex.Message)
            Finally
                If Not IsNothing(frm) Then
                    frm.Dispose()
                End If
            End Try
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub DelVitalButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles DelVitalButton.Click
        Try
            If vitalentriesDataGridView.SelectedRows.Count = 0 OrElse vitalentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse vitalentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim res As DialogResult = MessageBox.Show("Remove the selected entry?", "WARNING", MessageBoxButtons.YesNo, MessageBoxIcon.Warning, MessageBoxDefaultButton.Button2)
            If res = DialogResult.No Then
                Return
            End If
            vital_dt.Rows.Remove(vital_dt.Rows.Find(CInt(vitalentriesDataGridView.SelectedRows(0).Cells(0).Value)))
            RefreshGrid(vitalentriesDataGridView, vital_dt)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub NewMedButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles NewMedButton.Click
        Dim frm As Med = New Med(Nothing)
        Try
            Dim res As DialogResult = frm.ShowDialog()
            If DialogResult.OK = res Then
                declarations.RefreshGrid(medentriesDataGridView, declarations.med_dt)
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(frm) Then
                frm.Dispose()
            End If
        End Try
    End Sub

    Private Sub EditMedButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EditMedButton.Click
        Try
            If medentriesDataGridView.SelectedRows.Count = 0 OrElse medentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse medentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim dr As DataRow = med_dt.Rows.Find(CInt(medentriesDataGridView.SelectedRows(0).Cells(0).Value))
            Dim frm As Med = New Med(dr)
            Try
                Dim res As DialogResult = frm.ShowDialog()
                If DialogResult.OK = res Then
                    declarations.RefreshGrid(medentriesDataGridView, declarations.med_dt)
                End If
            Catch ex As Exception
                MessageBox.Show(ex.Message)
            Finally
                If Not IsNothing(frm) Then
                    frm.Dispose()
                End If
            End Try
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub DelMedButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles DelMedButton.Click
        Try
            If medentriesDataGridView.SelectedRows.Count = 0 OrElse medentriesDataGridView.SelectedRows(0).Cells(0).Value = Nothing OrElse medentriesDataGridView.SelectedRows(0).Cells(0).Value.ToString.Trim.Length = 0 Then
                Return
            End If
            Dim res As DialogResult = MessageBox.Show("Remove the selected entry?", "WARNING", MessageBoxButtons.YesNo, MessageBoxIcon.Warning, MessageBoxDefaultButton.Button2)
            If res = DialogResult.No Then
                Return
            End If
            med_dt.Rows.Remove(med_dt.Rows.Find(CInt(medentriesDataGridView.SelectedRows(0).Cells(0).Value)))
            RefreshGrid(medentriesDataGridView, med_dt)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub GetIDButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles GetIDButton.Click
        Dim frm As New MapID
        Dim res As DialogResult = frm.ShowDialog
        If res = DialogResult.Cancel Then
            Return
        ElseIf res = DialogResult.OK Then
            Try
                idTextBox.Text = pid.Trim
                Dim s As String()
                s = pnsp.Trim.Split("&")
                nspTextBox.Text = s(1) + "&" + s(2)
                fnameTextBox.Text = pfname.Trim
                lnameTextBox.Text = plname.Trim
                sexComboBox.SelectedValue = psex.Trim
                dobDateTimePicker.Value = New Date(CInt(pdob.Trim.Substring(0, 4)), CInt(pdob.Trim.Substring(4, 2)), CInt(pdob.Trim.Substring(6, 2)))
            Catch ex As Exception
            End Try
        End If
    End Sub

    Private Sub FilesDataGridView_CellMouseClick(ByVal sender As System.Object, ByVal e As System.Windows.Forms.DataGridViewCellMouseEventArgs) Handles FilesDataGridView.CellMouseClick
        Dim sr As StreamReader
        Try
            Dim fname As String = FilesDataGridView.Rows(e.RowIndex).Cells("FileNameColumn").Value
            selectedCDA = fname
            sr = New StreamReader(selectedCDA)
            Dim content As String = sr.ReadToEnd()
            cdaRichTextBox.Text = content
            cdaTabControl.Visible = True
            fnameLabel.Text = fname
            fnameLabel2.Text = fname
            'cdaRichTextBox.Visible = True
            'fnameLabel.Visible = True
            'closeButton.Visible = True
            'PRButton.Visible = True
            cdaWebBrowser.Navigate(selectedCDA)
            selectedFile = fname

            FilesDataGridView.Rows(e.RowIndex).Selected = True
            For j = 0 To FilesDataGridView.Rows(e.RowIndex).Cells.Count - 1
                FilesDataGridView.Rows(e.RowIndex).Cells(j).Style.SelectionBackColor = Color.Silver
                FilesDataGridView.Rows(e.RowIndex).Cells(j).Style.SelectionForeColor = Color.Black
            Next
        Catch ex As Exception
            'MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Private Sub EDFPIXButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EDFPIXButton.Click
        Dim frm As New MapID
        Dim res As DialogResult = frm.ShowDialog
        If res = DialogResult.Cancel Then
            Return
        ElseIf res = DialogResult.OK Then
            Try
                eidTextBox.Text = pid.Trim
                Dim s As String()
                s = pnsp.Trim.Split("&")
                enspTextBox.Text = s(1) + "&" + s(2)
                efirstTextBox.Text = pfname.Trim
                elastTextBox.Text = plname.Trim
                esexComboBox.SelectedValue = psex.Trim
                edobDateTimePicker.Value = New Date(CInt(pdob.Trim.Substring(0, 4)), CInt(pdob.Trim.Substring(4, 2)), CInt(pdob.Trim.Substring(6, 2)))
            Catch ex As Exception
            End Try
        End If
    End Sub

    Private Sub EDFBrowseButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles EDFBrowseButton.Click
        EdfOpenFileDialog.ShowDialog()
        EDFTextBox.Text = EdfOpenFileDialog.FileName.Trim
    End Sub

    Private Sub importButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles importButton.Click
        If CreateCDA(EDFTextBox.Text.Trim) = "" Then
            MessageBox.Show("Failed to create CDA doc")
        End If
    End Sub

    Private Function getDateTime() As String
        Return DateTime.Now.ToString("yyyyMMddHHmmss")
    End Function


    ''' <summary>
    ''' EDF Parse
    ''' </summary>
    ''' <param name="s"></param>
    ''' <returns></returns>
    ''' <remarks></remarks>

    'Private Function ClearEdfMed(ByVal s As String) As String
    '    Dim ret As String = ""
    '    ret = s.Replace("'FTX+BFD++", "")
    '    ret = ret.Replace("?:", "000")
    '    ret = ret.Replace(":", "")
    '    ret = ret.Replace("000", ":")
    '    ret = ret.Replace("?.", ".")
    '    ret = ret.Replace("?+", "+")
    '    Return ret
    'End Function

    'Private Function ClearEdf(ByVal s As String) As String
    '    Dim ret As String = ""
    '    ret = s.Replace("?:", "000")
    '    ret = ret.Replace(":", "")
    '    ret = ret.Replace("000", ":")
    '    ret = ret.Replace("?.", ".")
    '    ret = ret.Replace("?+", "+")
    '    'ret=ret.replace("*", "")
    '    Return ret
    'End Function

    Private Function GetDose(ByVal s As String, ByVal key As String) As String
        Dim froh As String = ""
        Dim fint As Integer = s.indexOf(key)
        If fint >= 0 Then
            Dim endd As Integer = s.IndexOf("|", fint)
            If endd > 0 Then
                froh = s.Substring(s.IndexOf(key) + key.Length(), endd - s.IndexOf(key) - key.Length()).Trim()
            Else
                froh = s.Substring(s.IndexOf(key) + key.Length()).Trim()
            End If
            Try
                If froh.Equals("½") = True Then
                    froh = "0.5"
                End If

            Catch e As Exception
                froh = "0"
            End Try

        Else
            froh = ""
        End If
        Return froh
    End Function

    Private Function ParseEdfMed(ByVal s As String) As ArrayList
        Try
            Dim l As New ArrayList
            Dim descr = s.Substring(0, s.IndexOf(":"))
            Dim froh As String = GetDose(s, "Fruh:")
            If froh.Trim().Length() = 0 Then
                froh = GetDose(s, "Frόh:")
            End If
            Dim mittag As String = GetDose(s, "Mittag:")
            Dim abend As String = GetDose(s, "Abend:")
            Dim nacht As String = GetDose(s, "Nacht:")
            l.Add(descr)
            l.Add(froh)
            l.Add(mittag)
            l.Add(abend)
            l.Add(nacht)
            Return l
        Catch ex As Exception
            Return Nothing
        End Try
    End Function

    Private Function GetSegment(ByVal s As String, ByVal key As String) As String
        Dim ret As String = ""
        Try
            ret = s.Substring(s.IndexOf(key) + key.Length(), s.IndexOf("'", s.IndexOf(key) + key.Length())).Trim()
        Catch ex As Exception
            Return ""
        End Try
        Return ret
    End Function

    Private Function GetFTXBFD(ByVal s As String) As String
        Dim ret As String = ""
        Dim curr As Integer = 0
        Dim endd As Integer
        Try
            While (s.IndexOf("FTX+BFD++", curr) >= 0)
                curr = s.IndexOf("FTX+BFD++", curr) + 9
                endd = s.IndexOf("'", curr)
                ret += s.Substring(curr, endd - curr)
                curr = endd + 1
            End While

        Catch ex As Exception
            Return ""
        End Try
        Return ret.Trim()
    End Function

    Private Function ClearFTXBFD(ByVal s As String) As String
        Dim ret As String = ""
        ret = s.Replace("?:", "TMPP")
        ret = ret.Replace(":", "")
        ret = ret.Replace("TMPP", ":")
        ret = ret.Replace("?.", ".")
        ret = ret.Replace("?+", "+")
        ret = ret.Replace("*", "")
        Return ret
    End Function


    Private Function GetPatientInfo() As ArrayList
        Dim pat As String = ""
        Dim bgm As String = ""
        Try
            Dim root As String = enspTextBox.Text.Trim
            Dim ext As String = eidTextBox.Text.Trim
            Dim first As String = efirstTextBox.Text.Trim
            Dim last As String = elastTextBox.Text.Trim
            Dim dob As String = edobDateTimePicker.Value.ToString("yyyyMMdd")
            Dim sex As String = esexComboBox.SelectedValue.ToString
            Dim l As New ArrayList()
            l.Add(root)
            l.Add(ext)
            l.Add(first)
            l.Add(last)
            l.Add(dob)
            l.Add(sex)
            Return l

        Catch ex As Exception
            Return Nothing
        End Try
    End Function


    Private Function NewCDAMedEntry(ByVal med_template As String, ByVal code As String, ByVal descr As String, ByVal cs As String, ByVal csname As String, ByVal dose As String, ByVal unit As String, ByVal datelow As String, ByVal datehigh As String) As String
        Dim res As String = med_template
        res = res.Replace("TMP_MED_PRODUCTCODE_SYSNAME", csname)
        res = res.Replace("TMP_MED_PRODUCTCODESYSTEM", cs)
        res = res.Replace("TMP_MED_PRODUCTCODE", code)
        res = res.Replace("TMP_MED_PRODUCTNAME", descr)
        res = res.Replace("TMP_MED_DOSE", dose)
        res = res.Replace("TMP_MED_UNIT", unit)
        res = res.Replace("TMP_MED_DATE_LOW", datelow)
        res = res.Replace("TMP_MED_DATE_HIGH", datehigh)
        Return res
    End Function

    Private Function GetCDAGeneral(ByVal edf_content As String, ByVal ftx_bfd As String) As String
        Dim filestr As String = ""
        Dim general_template As String = ""
        Dim genera As String = ""
        Dim tmp As String = ""
        Try
            Dim cpath As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString()
            Dim br As StreamReader = New StreamReader(cpath + "\\templates\\general.xml")
            general_template = br.ReadToEnd
            br.Close()

            Dim current_date As String = getDateTime()

            general = general_template
            general = general.Replace("TMP_CREATION_DATE", current_date)
            general = general.Replace("TMP_AUTHOR_TIME", current_date)
            general = general.Replace("TMP_AUTHOR_GIVEN", "V1")
            general = general.Replace("TMP_AUTHOR_FAMILY", "CDA_EDITOR")
            general = general.Replace("TMP_LEGALAUTH_TIME", current_date)
            general = general.Replace("TMP_CDA_EXT", "c" + current_date)
            general = general.Replace("TMP_CDA_RELATEDDOC", "")

            Dim pid, pnamespace As String
            pid = eidTextBox.Text.Trim
            pnamespace = enspTextBox.Text.Trim
            general = general.Replace("TMP_PATIENTID_ROOT", pnamespace)
            general = general.Replace("TMP_PATIENTID_EXT", pid)

            'PATIENT INFO
            Dim l As ArrayList = GetPatientInfo()
            general = general.Replace("TMP_GIVEN_NAME", l.Item(2).ToString)
            general = general.Replace("TMP_FAMILY_NAME", l.Item(3).ToString())
            general = general.Replace("TMP_BIRTHDATE", l.Item(4).ToString())
            general = general.Replace("TMP_SEX", l.Item(5).ToString())

        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        End Try
        Return general

    End Function

    Private Function GetMedList(ByVal medication As String) As String()
        Dim br As StreamReader = Nothing
        Dim tmp As String()
        Try
            Dim cpath As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString()
            br = New StreamReader(cpath + "\\medlist.txt")
            Dim s As String
            s = br.ReadLine()
            Do Until s Is Nothing
                tmp = s.Trim().Split("|")
                If Not s.Trim().StartsWith("#") AndAlso tmp(0) = medication Then
                    Return tmp
                End If
                s = br.ReadLine()
            Loop
            Return Nothing
        Catch ex As Exception
            MessageBox.Show("Error retrieving the medication list: " + ex.Message)
            Return Nothing
        Finally
            If Not IsNothing(br) Then
                br.Close()
            End If
        End Try

    End Function

    Private Function CreateCDA(ByVal new_file As String) As String
        Dim filestr As String = ""
        Dim edf_content As String = ""
        Dim general, med_template, med, edf_med, medstr, contents_template, contents, content_items As String
        general = ""
        med_template = ""
        med = ""
        edf_med = ""
        medstr = ""
        contents_template = ""
        contents = ""
        content_items = ""
        Try
            Dim cpath As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString()
            Dim br As StreamReader = New StreamReader(cpath + "\\templates\\medentry.xml")
            med_template = br.ReadToEnd
            br.Close()

            br = New StreamReader(cpath + "\\templates\\contents.xml")
            contents_template = br.ReadToEnd
            br.Close()

            br = New StreamReader(new_file)
            While (br.Peek <> -1)
                edf_content = edf_content + br.ReadLine().Trim + vbCrLf
            End While
            br.Close()




            'GET FTX+BFD++ segment
            Dim ftx_bfd As String = GetFTXBFD(edf_content)
            ftx_bfd = ClearFTXBFD(ftx_bfd)
            '**********************

            'GET GENERAL DATA
            general = GetCDAGeneral(edf_content, ftx_bfd)
            If general.Trim().Length() = 0 Then
                Return ""
            End If
            '******************


            'GET MEDICATIONS SECTION
            If ftx_bfd.IndexOf("MEDIKAMENTE") >= 0 Then
                Dim a As Integer = ftx_bfd.IndexOf("MEDIKAMENTE") + 11
                Dim b As Integer = ftx_bfd.IndexOf(vbCrLf + vbCrLf, a) - a
                medstr = ftx_bfd.Substring(a, b).Trim()
                Dim records As String() = medstr.Split(vbCrLf)
                For i As Integer = 0 To records.Length - 1
                    Dim code, descr, codesys, codesysname, dose, unit, datelow, datehigh As String
                    code = ""
                    descr = ""
                    codesys = ""
                    codesysname = ""
                    dose = ""
                    unit = ""
                    datelow = ""
                    datehigh = ""
                    Dim l As ArrayList = ParseEdfMed(records(i))
                    descr = l.Item(0).ToString().Trim
                    Dim medication As String() = GetMedList(descr)
                    If Not IsNothing(medication) Then
                        code = medication(1).Trim()
                        codesys = medication(2).Trim()
                        codesysname = medication(3).Trim()
                        Dim dosage As Double
                        dosage = CDbl(medication(4).Trim()) * (CDbl(l.Item(1).ToString()) + CDbl(l.Item(2).ToString()) + CDbl(l.Item(3).ToString()) + CDbl(l.Item(4).ToString()))
                        dose = dosage.ToString
                        unit = medication(5).Trim()
                    End If
                    med += NewCDAMedEntry(med_template, code, descr, codesys, codesysname, dose, unit, datelow, datehigh) + vbCrLf
                    content_items += "<item>" + descr + "</item>" + vbCrLf
                Next
                contents = contents_template
                contents = contents.Replace("TMP_CONTENTS_TITLE", "MEDICATIONS")
                contents = contents.Replace("TMP_CONTENTS_CODESYSTEMNAME", "LOINC")
                contents = contents.Replace("TMP_CONTENTS_CODESYSTEM", "2.16.840.1.113883.6.1")
                contents = contents.Replace("TMP_CONTENTS_ITEMS", content_items)
                contents = contents.Replace("TMP_ENTRIES", med)
            End If
            '************************


            general = general.Replace("TMP_MEDICAL_DATA", contents)
            general = general.Replace("&", "&amp;")

            Dim writer As StreamWriter = Nothing

            Dim cda_path As String = System.Configuration.ConfigurationSettings.AppSettings("sharedDir").ToString() + "\\" + EdfOpenFileDialog.SafeFileName + ".xml"
            writer = New StreamWriter(cda_path)
            writer.Write(general)
            writer.Close()
            MessageBox.Show(cda_path + " created successfully")
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        Finally
        End Try

        Return general

    End Function





    Private Sub SaveRegButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles SaveRegButton.Click
        Dim sw As StreamWriter = Nothing
        Dim str As String = ""
        Dim medical_data As String = ""
        Try
            sw = New StreamWriter(FileNameTextBox.Text.Trim, False)
            str = SetGeneralStr()
            If str.Trim.Length = 0 Then
                MessageBox.Show("Input missing")
                Return
            End If
            medical_data += GetLabEntries(lab_dt)
            medical_data += GetVitalEntries(vital_dt)
            medical_data += GetProbEntries(prob_dt)
            medical_data += GetProcEntries(proc_dt)
            medical_data += GetMedEntries(med_dt)
            str = str.Replace("TMP_MEDICAL_DATA", medical_data)
            sw.Write(str.Replace("&", "&amp;"))

            Dim res As String
            res = Provide_Register("Document01", str.Replace("&", "&amp;"))
            If res = "" Then
                MessageBox.Show("Failed to make the registration")
            Else
                MessageBox.Show("Registration completed")
            End If

            MainTabControl.SelectTab(ViewTabPage)
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(sw) Then
                sw.Close()
            End If
        End Try
    End Sub



    Private Sub cdabrowse_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles cdabrowse.Click
        Dim res As DialogResult = settingsFolderBrowserDialog.ShowDialog
        If res = DialogResult.OK Then
            cdaTextBox.Text = settingsFolderBrowserDialog.SelectedPath
        End If
    End Sub

    Private Sub MainTabControl_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MainTabControl.SelectedIndexChanged
        If MainTabControl.SelectedIndex = 3 Then
            cdaTextBox.Text = System.Configuration.ConfigurationSettings.AppSettings("sharedDir").ToString()
            xdsTextBox.Text = System.Configuration.ConfigurationSettings.AppSettings("xds").ToString()
            pixipTextBox.Text = System.Configuration.ConfigurationSettings.AppSettings("PIX_ip").ToString()
            pixportTextBox.Text = System.Configuration.ConfigurationSettings.AppSettings("PIX_port").ToString()
            atnaipTextBox.Text = System.Configuration.ConfigurationSettings.AppSettings("ATNA_ip").ToString()
            atnaportTextBox.Text = System.Configuration.ConfigurationSettings.AppSettings("ATNA_port").ToString()
        End If
    End Sub

    Private Sub savesettingsButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles savesettingsButton.Click
        Dim xd As XmlDocument = New XmlDocument()
        Try
            ' read the Test1 value from the config file
            'Dim sharedDir As String = ConfigSettings.ReadSetting("sharedDir")

            ' write a new value for the Test1 setting
            ConfigSettings.WriteSetting("sharedDir", cdaTextBox.Text.Trim)
            ConfigSettings.WriteSetting("xds", xdsTextBox.Text.Trim)
            ConfigSettings.WriteSetting("PIX_ip", pixipTextBox.Text.Trim)
            ConfigSettings.WriteSetting("PIX_port", pixportTextBox.Text.Trim)
            ConfigSettings.WriteSetting("ATNA_ip", atnaipTextBox.Text.Trim)
            ConfigSettings.WriteSetting("ATNA_port", atnaportTextBox.Text.Trim)

            MessageBox.Show("SETTINGS SAVED.", "SUCCESS", MessageBoxButtons.OK, MessageBoxIcon.Information, MessageBoxDefaultButton.Button1)
            Dim res As DialogResult = MessageBox.Show("You need to restart the application for the changes to take effect!! Do you want to restart the application now?", "RESTART", MessageBoxButtons.YesNo, MessageBoxIcon.Question, MessageBoxDefaultButton.Button1)
            If res = DialogResult.Yes Then
                Application.Restart()
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message, "FAILED", MessageBoxButtons.OK, MessageBoxIcon.Error, MessageBoxDefaultButton.Button1)
        Finally
        End Try
    End Sub

    Private Sub edfcrButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles edfcrButton.Click
        Dim cda As String = CreateCDA(EDFTextBox.Text.Trim)
        If cda = "" Then
            MessageBox.Show("Failed to create CDA doc")
            Return
        End If

        Dim res As String
        res = Provide_Register("Document01", cda)
        If res = "" Then
            MessageBox.Show("Failed to make the registration")
        Else
            MessageBox.Show("Registration completed")
        End If

        MainTabControl.SelectTab(ViewTabPage)
    End Sub
End Class
