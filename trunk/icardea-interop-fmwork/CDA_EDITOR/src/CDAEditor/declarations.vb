Imports System.Windows.Forms
Imports System.IO
Imports System.Xml
Public Module declarations
    Public lab_dt, proc_dt, prob_dt, vital_dt, med_dt As DataTable
    Public sex_dt, codesystems_dt, prob_types_dt As DataTable
    Public general, contents, labentry, procentry, probentry, vitalentry, medentry As String
    Public pid, pnsp, pfname, plname, psex, pdob As String
    Public lablist_dt, problist_dt, proclist_dt, medlist_dt, vitallist_dt As DataTable
    Public status_dt, severity_dt As DataTable

    Public Sub InitLabCodeList()
        Dim sr As StreamReader = Nothing
        Try
            declarations.lablist_dt = New DataTable("lablist_dt")
            declarations.lablist_dt.Columns.Add("code")
            declarations.lablist_dt.Columns.Add("descr")
            declarations.lablist_dt.Columns.Add("codesystem")
            declarations.lablist_dt.Columns.Add("codesystemname")
            Dim dc As New DataColumn()
            dc = lablist_dt.Columns("code")
            declarations.lablist_dt.PrimaryKey = New DataColumn() {dc}
            Dim dr As DataRow 

            Dim path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString() + "\\codes\\labs.txt"
            sr = New StreamReader(path)
            Dim line As String
            While (sr.EndOfStream = False)
                Try
                    line = sr.ReadLine().Trim
                    If line.Length = 0 Then
                        Exit While
                    End If
                    Dim tmp() As String
                    tmp = line.Split("|")
                    Dim s As String = ""
                    'Dim cdr As DataRow = codesystems_dt.Rows.Find(tmp(2))
                    For i As Integer = 0 To codesystems_dt.Rows.Count - 1
                        If codesystems_dt.Rows(i)("descr").ToString().Trim.ToUpper = tmp(2).Trim.ToUpper Then
                            s = codesystems_dt.Rows(i)("code").ToString().Trim
                        End If
                    Next
                    dr = declarations.lablist_dt.NewRow
                    dr("code") = tmp(1).Trim
                    dr("descr") = tmp(0).Trim
                    dr("codesystem") = s
                    dr("codesystemname") = tmp(2).Trim
                    declarations.lablist_dt.Rows.Add(dr)
                Catch e As Exception
                End Try
            End While
        Catch ex As Exception
            MessageBox.Show("ERROR READING lab codes file: " + ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Public Sub InitVitalCodeList()
        Dim sr As StreamReader = Nothing
        Try
            declarations.vitallist_dt = New DataTable("vitallist_dt")
            declarations.vitallist_dt.Columns.Add("code")
            declarations.vitallist_dt.Columns.Add("descr")
            declarations.vitallist_dt.Columns.Add("codesystem")
            declarations.vitallist_dt.Columns.Add("codesystemname")
            Dim dc As New DataColumn()
            dc = vitallist_dt.Columns("code")
            declarations.vitallist_dt.PrimaryKey = New DataColumn() {dc}
            Dim dr As DataRow 

            Dim path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString() + "\\codes\\vitals.txt"
            sr = New StreamReader(path)
            Dim line As String
            While (sr.EndOfStream = False)
                Try
                    line = sr.ReadLine().Trim
                    If line.Length = 0 Then
                        Exit While
                    End If
                    Dim tmp() As String
                    tmp = line.Split("|")
                    Dim s As String = ""
                    'Dim cdr As DataRow = codesystems_dt.Rows.Find(tmp(2))
                    For i As Integer = 0 To codesystems_dt.Rows.Count - 1
                        If codesystems_dt.Rows(i)("descr").ToString().Trim.ToUpper = tmp(2).Trim.ToUpper Then
                            s = codesystems_dt.Rows(i)("code").ToString().Trim
                        End If
                    Next
                    dr = declarations.vitallist_dt.NewRow
                    dr("code") = tmp(1).Trim
                    dr("descr") = tmp(0).Trim
                    dr("codesystem") = s
                    dr("codesystemname") = tmp(2).Trim
                    declarations.vitallist_dt.Rows.Add(dr)
                Catch e As Exception
                End Try
            End While
        Catch ex As Exception
            MessageBox.Show("ERROR READING vital codes file: " + ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Public Sub InitProbCodeList()
        Dim sr As StreamReader = Nothing
        Try
            declarations.problist_dt = New DataTable("problist_dt")
            declarations.problist_dt.Columns.Add("code")
            declarations.problist_dt.Columns.Add("descr")
            declarations.problist_dt.Columns.Add("codesystem")
            declarations.problist_dt.Columns.Add("codesystemname")
            Dim dc As New DataColumn()
            dc = problist_dt.Columns("code")
            declarations.problist_dt.PrimaryKey = New DataColumn() {dc}
            Dim dr As DataRow 

            Dim path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString() + "\\codes\\probs.txt"
            sr = New StreamReader(path)
            Dim line As String
            While (sr.EndOfStream = False)
                Try
                    line = sr.ReadLine().Trim
                    If line.Length = 0 Then
                        Exit While
                    End If
                    Dim tmp() As String
                    tmp = line.Split("|")
                    Dim s As String = ""
                    'Dim cdr As DataRow = codesystems_dt.Rows.Find(tmp(2))
                    For i As Integer = 0 To codesystems_dt.Rows.Count - 1
                        If codesystems_dt.Rows(i)("descr").ToString().Trim.ToUpper = tmp(2).Trim.ToUpper Then
                            s = codesystems_dt.Rows(i)("code").ToString().Trim
                        End If
                    Next
                    dr = declarations.problist_dt.NewRow
                    dr("code") = tmp(1).Trim
                    dr("descr") = tmp(0).Trim
                    dr("codesystem") = s
                    dr("codesystemname") = tmp(2).Trim
                    declarations.problist_dt.Rows.Add(dr)
                Catch e As Exception
                End Try
            End While
        Catch ex As Exception
            MessageBox.Show("ERROR READING problem codes file: " + ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Public Sub InitProcCodeList()
        Dim sr As StreamReader = Nothing
        Try
            declarations.proclist_dt = New DataTable("proclist_dt")
            declarations.proclist_dt.Columns.Add("code")
            declarations.proclist_dt.Columns.Add("descr")
            declarations.proclist_dt.Columns.Add("codesystem")
            declarations.proclist_dt.Columns.Add("codesystemname")
            Dim dc As New DataColumn()
            dc = proclist_dt.Columns("code")
            declarations.proclist_dt.PrimaryKey = New DataColumn() {dc}
            Dim dr As DataRow 
            Dim path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString() + "\\codes\\procs.txt"
            sr = New StreamReader(path)
            Dim line As String
            While (sr.EndOfStream = False)
                Try
                    line = sr.ReadLine().Trim
                    If line.Length = 0 Then
                        Exit While
                    End If
                    Dim tmp() As String
                    tmp = line.Split("|")
                    Dim s As String = ""
                    'Dim cdr As DataRow = codesystems_dt.Rows.Find(tmp(2))
                    For i As Integer = 0 To codesystems_dt.Rows.Count - 1
                        If codesystems_dt.Rows(i)("descr").ToString().Trim.ToUpper = tmp(2).Trim.ToUpper Then
                            s = codesystems_dt.Rows(i)("code").ToString().Trim
                        End If
                    Next
                    dr = declarations.proclist_dt.NewRow
                    dr("code") = tmp(1).Trim
                    dr("descr") = tmp(0).Trim
                    dr("codesystem") = s
                    dr("codesystemname") = tmp(2).Trim
                    declarations.proclist_dt.Rows.Add(dr)
                Catch e As Exception
                End Try
            End While
        Catch ex As Exception
            MessageBox.Show("ERROR READING procedure codes file: " + ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Public Sub InitCodeSystemsList()
        Dim sr As StreamReader = Nothing
        Try
            declarations.codesystems_dt = New DataTable("codesystems_dt")
            declarations.codesystems_dt.Columns.Add("code")
            declarations.codesystems_dt.Columns.Add("descr")
            Dim dc As New DataColumn()
            dc = codesystems_dt.Columns("code")
            declarations.codesystems_dt.PrimaryKey = New DataColumn() {dc}
            Dim dr As DataRow = declarations.codesystems_dt.NewRow
            dr("code") = "EMPTY"
            dr("descr") = "---Select---"
            declarations.codesystems_dt.Rows.Add(dr)

            Dim path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString() + "\\codes\\codesystems.txt"
            sr = New StreamReader(path)
            Dim line As String
            While (sr.EndOfStream = False)
                line = sr.ReadLine().Trim
                If line.Length = 0 Then
                    Exit While
                End If
                Dim tmp() As String
                tmp = line.Split("|")
                Dim s As String = ""
                'Dim cdr As DataRow = codesystems_dt.Rows.Find(tmp(2))
                dr = declarations.codesystems_dt.NewRow
                dr("code") = tmp(0).Trim
                dr("descr") = tmp(1).Trim
                declarations.codesystems_dt.Rows.Add(dr)
            End While
        Catch ex As Exception
            MessageBox.Show("ERROR READING code systems file: " + ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Public Sub InitMedCodeList()
        Dim sr As StreamReader = Nothing
        Try
            declarations.medlist_dt = New DataTable("medlist_dt")
            declarations.medlist_dt.Columns.Add("code")
            declarations.medlist_dt.Columns.Add("descr")
            declarations.medlist_dt.Columns.Add("codesystem")
            declarations.medlist_dt.Columns.Add("codesystemname")
            Dim dc As New DataColumn()
            dc = medlist_dt.Columns("code")
            declarations.medlist_dt.PrimaryKey = New DataColumn() {dc}
            Dim dr As DataRow
            'Dim dr As DataRow = declarations.medlist_dt.NewRow
            'dr("code") = "EMPTY"
            'dr("descr") = "---Select---"
            'declarations.medlist_dt.Rows.Add(dr)

            Dim path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString() + "\\codes\\meds.txt"
            sr = New StreamReader(path)
            Dim line As String
            While (sr.EndOfStream = False)
                Try
                    line = sr.ReadLine().Trim
                    If line.Length = 0 Then
                        Exit While
                    End If
                    Dim tmp() As String
                    tmp = line.Split("|")
                    Dim s As String = ""
                    'Dim cdr As DataRow = codesystems_dt.Rows.Find(tmp(2))
                    For i As Integer = 0 To codesystems_dt.Rows.Count - 1
                        If codesystems_dt.Rows(i)("descr").ToString().Trim.ToUpper = tmp(2).Trim.ToUpper Then
                            s = codesystems_dt.Rows(i)("code").ToString().Trim
                        End If
                    Next
                    dr = declarations.medlist_dt.NewRow
                    dr("code") = tmp(1).Trim
                    dr("descr") = tmp(0).Trim
                    dr("codesystem") = s
                    dr("codesystemname") = tmp(2).Trim
                    declarations.medlist_dt.Rows.Add(dr)
                Catch e As Exception
                End Try
            End While
        Catch ex As Exception
            MessageBox.Show("ERROR READING medication codes file: " + ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Public Sub InitLists()
        InitCodeSystemsList()

        declarations.sex_dt = New DataTable("SEX_DT")
        declarations.sex_dt.Columns.Add("code")
        declarations.sex_dt.Columns.Add("descr")
        Dim dc As New DataColumn()
        dc = sex_dt.Columns("code")
        declarations.sex_dt.PrimaryKey = New DataColumn() {dc}
        Dim dr As DataRow = declarations.sex_dt.NewRow
        dr("code") = "EMPTY"
        dr("descr") = "---Select---"
        declarations.sex_dt.Rows.Add(dr)
        dr = sex_dt.NewRow
        dr("code") = "M"
        dr("descr") = "Male"
        declarations.sex_dt.Rows.Add(dr)
        dr = sex_dt.NewRow
        dr("code") = "F"
        dr("descr") = "Female"
        declarations.sex_dt.Rows.Add(dr)

        declarations.status_dt = New DataTable("STATUS_DT")
        declarations.status_dt.Columns.Add("code")
        declarations.status_dt.Columns.Add("descr")
        dc = status_dt.Columns("code")
        declarations.status_dt.PrimaryKey = New DataColumn() {dc}
        dr = status_dt.NewRow
        dr("code") = "completed"
        dr("descr") = "completed"
        declarations.status_dt.Rows.Add(dr)
        dr = status_dt.NewRow
        dr("code") = "active"
        dr("descr") = "active"
        declarations.status_dt.Rows.Add(dr)
        dr = status_dt.NewRow
        dr("code") = "suspended"
        dr("descr") = "suspended"
        declarations.status_dt.Rows.Add(dr)
        dr = status_dt.NewRow
        dr("code") = "aborted"
        dr("descr") = "aborted"
        declarations.status_dt.Rows.Add(dr)

        declarations.severity_dt = New DataTable("SEVERITY_DT")
        declarations.severity_dt.Columns.Add("code")
        declarations.severity_dt.Columns.Add("descr")
        dc = severity_dt.Columns("code")
        declarations.severity_dt.PrimaryKey = New DataColumn() {dc}
        dr = declarations.severity_dt.NewRow
        dr("code") = "EMPTY"
        dr("descr") = "---Select---"
        declarations.severity_dt.Rows.Add(dr)
        dr = severity_dt.NewRow
        dr("code") = "Moderate"
        dr("descr") = "Moderate"
        declarations.severity_dt.Rows.Add(dr)
        dr = severity_dt.NewRow
        dr("code") = "High"
        dr("descr") = "High"
        declarations.severity_dt.Rows.Add(dr)
        dr = severity_dt.NewRow
        dr("code") = "Low"
        dr("descr") = "Low"
        declarations.severity_dt.Rows.Add(dr)



        declarations.prob_types_dt = New DataTable("prob_types_DT")
        declarations.prob_types_dt.Columns.Add("code")
        declarations.prob_types_dt.Columns.Add("descr")
        dc = New DataColumn()
        dc = prob_types_dt.Columns("code")
        declarations.prob_types_dt.PrimaryKey = New DataColumn() {dc}
        dr = declarations.prob_types_dt.NewRow
        dr("code") = "EMPTY"
        dr("descr") = "---Select---"
        declarations.prob_types_dt.Rows.Add(dr)
        dr = prob_types_dt.NewRow
        dr("code") = "64572001"
        dr("descr") = "Condition"
        declarations.prob_types_dt.Rows.Add(dr)
        dr = prob_types_dt.NewRow
        dr("code") = "418799008"
        dr("descr") = "Symptom"
        declarations.prob_types_dt.Rows.Add(dr)
        dr = prob_types_dt.NewRow
        dr("code") = "404684003"
        dr("descr") = "Finding"
        declarations.prob_types_dt.Rows.Add(dr)
        dr = prob_types_dt.NewRow
        dr("code") = "409586006"
        dr("descr") = "Complaint"
        declarations.prob_types_dt.Rows.Add(dr)
        dr = prob_types_dt.NewRow
        dr("code") = "248536006"
        dr("descr") = "Functional limitation"
        declarations.prob_types_dt.Rows.Add(dr)
        dr = prob_types_dt.NewRow
        dr("code") = "55607006"
        dr("descr") = "Problem"
        declarations.prob_types_dt.Rows.Add(dr)
        dr = prob_types_dt.NewRow
        dr("code") = "282291009"
        dr("descr") = "Diagnosis"
        declarations.prob_types_dt.Rows.Add(dr)


    End Sub

    Public Sub RefreshGrid(ByVal dg As DataGridView, ByVal dt As DataTable)
        dg.DataSource = dt
        dg.Update()
    End Sub

    Public Sub RefreshGrid(ByVal dg As DataGridView, ByVal dv As DataView)
        dg.DataSource = dv
        dg.Update()
    End Sub

    Public Sub InitDTs()
        declarations.lab_dt = New DataTable("lab_dt")
        Dim dc As DataColumn = New DataColumn("lab_id")
        declarations.lab_dt.Columns.Add(dc)
        declarations.lab_dt.Columns.Add("lab_code")
        declarations.lab_dt.Columns.Add("lab_text")
        declarations.lab_dt.Columns.Add("lab_codesystem")
        declarations.lab_dt.Columns.Add("lab_codesystemname")
        declarations.lab_dt.Columns.Add("lab_date")
        declarations.lab_dt.Columns.Add("lab_xsitype")
        declarations.lab_dt.Columns.Add("lab_value")
        declarations.lab_dt.Columns.Add("lab_unit")
        declarations.lab_dt.PrimaryKey = New DataColumn() {dc}

        declarations.prob_dt = New DataTable("prob_dt")
        dc = New DataColumn("prob_id")
        declarations.prob_dt.Columns.Add(dc)
        declarations.prob_dt.Columns.Add("prob_type_code")
        declarations.prob_dt.Columns.Add("prob_type_text")
        declarations.prob_dt.Columns.Add("prob_codesystem")
        declarations.prob_dt.Columns.Add("prob_codesystemname")
        declarations.prob_dt.Columns.Add("prob_date_low")
        declarations.prob_dt.Columns.Add("prob_date_high")
        declarations.prob_dt.Columns.Add("prob_xsitype")
        declarations.prob_dt.Columns.Add("prob_value_code")
        declarations.prob_dt.Columns.Add("prob_text")
        declarations.prob_dt.Columns.Add("prob_status")
        declarations.prob_dt.PrimaryKey = New DataColumn() {dc}

        declarations.proc_dt = New DataTable("proc_dt")
        dc = New DataColumn("proc_id")
        declarations.proc_dt.Columns.Add(dc)
        declarations.proc_dt.Columns.Add("proc_code")
        declarations.proc_dt.Columns.Add("proc_text")
        declarations.proc_dt.Columns.Add("proc_codesystem")
        declarations.proc_dt.Columns.Add("proc_codesystemname")
        declarations.proc_dt.Columns.Add("proc_date_low")
        declarations.proc_dt.Columns.Add("proc_date_high")
        declarations.proc_dt.PrimaryKey = New DataColumn() {dc}

        declarations.vital_dt = New DataTable("vital_dt")
        dc = New DataColumn("vital_id")
        declarations.vital_dt.Columns.Add(dc)
        declarations.vital_dt.Columns.Add("vital_code")
        declarations.vital_dt.Columns.Add("vital_text")
        declarations.vital_dt.Columns.Add("vital_codesystem")
        declarations.vital_dt.Columns.Add("vital_codesystemname")
        declarations.vital_dt.Columns.Add("vital_date")
        declarations.vital_dt.Columns.Add("vital_xsitype")
        declarations.vital_dt.Columns.Add("vital_value")
        declarations.vital_dt.Columns.Add("vital_unit")
        declarations.vital_dt.PrimaryKey = New DataColumn() {dc}

        declarations.med_dt = New DataTable("med_dt")
        dc = New DataColumn("med_id")
        declarations.med_dt.Columns.Add(dc)
        declarations.med_dt.Columns.Add("med_code")
        declarations.med_dt.Columns.Add("med_text")
        declarations.med_dt.Columns.Add("med_codesystem")
        declarations.med_dt.Columns.Add("med_codesystemname")
        declarations.med_dt.Columns.Add("med_date_low")
        declarations.med_dt.Columns.Add("med_date_high")
        declarations.med_dt.Columns.Add("med_dose")
        declarations.med_dt.Columns.Add("med_unit")
        'declarations.med_dt.Columns.Add("med_code")
        'declarations.med_dt.Columns.Add("med_text")
        'declarations.med_dt.Columns.Add("med_codesystem")
        'declarations.med_dt.Columns.Add("med_codesystemname")
        declarations.med_dt.PrimaryKey = New DataColumn() {dc}
    End Sub

    Public Sub NewLabEntry(ByVal lab_code As String, ByVal lab_text As String, ByVal lab_codesystem As String, ByVal lab_codesysname As String, ByVal lab_date As String, ByVal lab_xsitype As String, ByVal lab_value As String, ByVal lab_unit As String)
        Dim id As Integer
        Dim max As Integer = 0
        For i = 0 To lab_dt.Rows.Count - 1
            If CInt(lab_dt.Rows(i)("lab_id")) > max Then
                max = CInt(lab_dt.Rows(i)("lab_id"))
            End If
        Next
        id = max + 1
        Dim dr As DataRow = lab_dt.NewRow
        dr("lab_id") = id.ToString
        dr("lab_code") = lab_code
        dr("lab_text") = lab_text
        dr("lab_codesystem") = lab_codesystem
        dr("lab_codesystemname") = lab_codesysname
        dr("lab_date") = lab_date
        dr("lab_xsitype") = lab_xsitype
        dr("lab_value") = lab_value
        dr("lab_unit") = lab_unit
        lab_dt.Rows.Add(dr)
    End Sub

    Public Sub EditLabEntry(ByVal id As String, ByVal lab_code As String, ByVal lab_text As String, ByVal lab_codesystem As String, ByVal lab_codesysname As String, ByVal lab_date As String, ByVal lab_xsitype As String, ByVal lab_value As String, ByVal lab_unit As String)
        Dim dr As DataRow = lab_dt.Rows.Find(id)
        dr("lab_id") = id.ToString
        dr("lab_code") = lab_code
        dr("lab_text") = lab_text
        dr("lab_codesystem") = lab_codesystem
        dr("lab_codesystemname") = lab_codesysname
        dr("lab_date") = lab_date
        dr("lab_xsitype") = lab_xsitype
        dr("lab_value") = lab_value
        dr("lab_unit") = lab_unit
    End Sub

    Public Sub NewVitalEntry(ByVal vital_code As String, ByVal vital_text As String, ByVal vital_codesystem As String, ByVal vital_codesysname As String, ByVal vital_date As String, ByVal vital_xsitype As String, ByVal vital_value As String, ByVal vital_unit As String)
        Dim id As Integer
        Dim max As Integer = 0
        For i = 0 To vital_dt.Rows.Count - 1
            If CInt(vital_dt.Rows(i)("vital_id")) > max Then
                max = CInt(vital_dt.Rows(i)("vital_id"))
            End If
        Next
        id = max + 1
        Dim dr As DataRow = vital_dt.NewRow
        dr("vital_id") = id.ToString
        dr("vital_code") = vital_code
        dr("vital_text") = vital_text
        dr("vital_codesystem") = vital_codesystem
        dr("vital_codesystemname") = vital_codesysname
        dr("vital_date") = vital_date
        dr("vital_xsitype") = vital_xsitype
        dr("vital_value") = vital_value
        dr("vital_unit") = vital_unit
        vital_dt.Rows.Add(dr)
    End Sub

    Public Sub EditVitalEntry(ByVal id As String, ByVal vital_code As String, ByVal vital_text As String, ByVal vital_codesystem As String, ByVal vital_codesysname As String, ByVal vital_date As String, ByVal vital_xsitype As String, ByVal vital_value As String, ByVal vital_unit As String)
        Dim dr As DataRow = vital_dt.Rows.Find(id)
        dr("vital_id") = id.ToString
        dr("vital_code") = vital_code
        dr("vital_text") = vital_text
        dr("vital_codesystem") = vital_codesystem
        dr("vital_codesystemname") = vital_codesysname
        dr("vital_date") = vital_date
        dr("vital_xsitype") = vital_xsitype
        dr("vital_value") = vital_value
        dr("vital_unit") = vital_unit
    End Sub

    Public Sub NewProbEntry(ByVal prob_type_code As String, ByVal prob_type_text As String, ByVal prob_codesystem As String, ByVal prob_codesysname As String, ByVal prob_date_low As String, ByVal prob_date_high As String, ByVal prob_xsitype As String, ByVal prob_value_code As String, ByVal prob_text As String, ByVal prob_status As String)
        Dim id As Integer
        Dim max As Integer = 0
        For i = 0 To prob_dt.Rows.Count - 1
            If CInt(prob_dt.Rows(i)("prob_id")) > max Then
                max = CInt(prob_dt.Rows(i)("prob_id"))
            End If
        Next
        id = max + 1
        Dim dr As DataRow = prob_dt.NewRow
        dr("prob_id") = id.ToString
        dr("prob_type_code") = prob_type_code
        dr("prob_type_text") = prob_type_text
        dr("prob_codesystem") = prob_codesystem
        dr("prob_codesystemname") = prob_codesysname
        dr("prob_date_low") = prob_date_low
        dr("prob_date_high") = prob_date_high
        dr("prob_xsitype") = prob_xsitype
        dr("prob_value_code") = prob_value_code
        dr("prob_text") = prob_text
        dr("prob_status") = prob_status
        prob_dt.Rows.Add(dr)
    End Sub

    Public Sub EditProbEntry(ByVal id As String, ByVal prob_type_code As String, ByVal prob_type_text As String, ByVal prob_codesystem As String, ByVal prob_codesysname As String, ByVal prob_date_low As String, ByVal prob_date_high As String, ByVal prob_xsitype As String, ByVal prob_value_code As String, ByVal prob_text As String, ByVal prob_status As String)
        Dim dr As DataRow = prob_dt.Rows.Find(id)
        dr("prob_id") = id.ToString
        dr("prob_type_code") = prob_type_code
        dr("prob_type_text") = prob_type_text
        dr("prob_codesystem") = prob_codesystem
        dr("prob_codesystemname") = prob_codesysname
        dr("prob_date_low") = prob_date_low
        dr("prob_date_high") = prob_date_high
        dr("prob_xsitype") = prob_xsitype
        dr("prob_value_code") = prob_value_code
        dr("prob_text") = prob_text
        dr("prob_status") = prob_status
    End Sub

    Public Sub NewProcEntry(ByVal proc_code As String, ByVal proc_text As String, ByVal proc_codesystem As String, ByVal proc_codesysname As String, ByVal proc_date_low As String, ByVal proc_date_high As String)
        Dim id As Integer
        Dim max As Integer = 0
        For i = 0 To proc_dt.Rows.Count - 1
            If CInt(proc_dt.Rows(i)("proc_id")) > max Then
                max = CInt(proc_dt.Rows(i)("proc_id"))
            End If
        Next
        id = max + 1
        Dim dr As DataRow = proc_dt.NewRow
        dr("proc_id") = id.ToString
        dr("proc_code") = proc_code
        dr("proc_text") = proc_text
        dr("proc_codesystem") = proc_codesystem
        dr("proc_codesystemname") = proc_codesysname
        dr("proc_date_low") = proc_date_low
        dr("proc_date_high") = proc_date_high
        proc_dt.Rows.Add(dr)
    End Sub

    Public Sub EditProcEntry(ByVal id As String, ByVal proc_code As String, ByVal proc_text As String, ByVal proc_codesystem As String, ByVal proc_codesysname As String, ByVal proc_date_low As String, ByVal proc_date_high As String)
        Dim dr As DataRow = proc_dt.Rows.Find(id)
        dr("proc_id") = id.ToString
        dr("proc_code") = proc_code
        dr("proc_text") = proc_text
        dr("proc_codesystem") = proc_codesystem
        dr("proc_codesystemname") = proc_codesysname
        dr("proc_date_low") = proc_date_low
        dr("proc_date_high") = proc_date_high
    End Sub

    Public Sub NewMedEntry(ByVal med_code As String, ByVal med_text As String, ByVal med_codesystem As String, ByVal med_codesysname As String, ByVal med_date_low As String, ByVal med_date_high As String, ByVal med_dose As String, ByVal med_unit As String)
        Dim id As Integer
        Dim max As Integer = 0
        For i = 0 To med_dt.Rows.Count - 1
            If CInt(med_dt.Rows(i)("med_id")) > max Then
                max = CInt(med_dt.Rows(i)("med_id"))
            End If
        Next
        id = max + 1
        Dim dr As DataRow = med_dt.NewRow
        dr("med_id") = id.ToString
        dr("med_code") = med_code
        dr("med_text") = med_text
        dr("med_codesystem") = med_codesystem
        dr("med_codesystemname") = med_codesysname
        dr("med_date_low") = med_date_low
        dr("med_date_high") = med_date_high
        dr("med_dose") = med_dose
        dr("med_unit") = med_unit
        med_dt.Rows.Add(dr)
    End Sub

    Public Sub EditMedEntry(ByVal id As String, ByVal med_code As String, ByVal med_text As String, ByVal med_codesystem As String, ByVal med_codesysname As String, ByVal med_date_low As String, ByVal med_date_high As String, ByVal med_dose As String, ByVal med_unit As String)
        Dim dr As DataRow = med_dt.Rows.Find(id)
        dr("med_id") = id.ToString
        dr("med_code") = med_code
        dr("med_text") = med_text
        dr("med_codesystem") = med_codesystem
        dr("med_codesystemname") = med_codesysname
        dr("med_date_low") = med_date_low
        dr("med_date_high") = med_date_high
        dr("med_dose") = med_dose
        dr("med_unit") = med_unit
    End Sub

    Public Sub GetTemplates()

        Dim sr As StreamReader = Nothing
        Try
            Dim config_path As String = System.Configuration.ConfigurationSettings.AppSettings("config").ToString()
            Dim templates_path As String = config_path + "\templates"
            sr = New StreamReader(templates_path + "\general.xml")
            general = sr.ReadToEnd
            sr = New StreamReader(templates_path + "\contents.xml")
            contents = sr.ReadToEnd
            sr = New StreamReader(templates_path + "\labentry.xml")
            labentry = sr.ReadToEnd
            sr = New StreamReader(templates_path + "\procentry.xml")
            procentry = sr.ReadToEnd
            sr = New StreamReader(templates_path + "\probentry.xml")
            probentry = sr.ReadToEnd
            sr = New StreamReader(templates_path + "\vitalentry.xml")
            vitalentry = sr.ReadToEnd
            sr = New StreamReader(templates_path + "\medentry.xml")
            medentry = sr.ReadToEnd
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        Finally
            If Not IsNothing(sr) Then
                sr.Close()
            End If
        End Try
    End Sub

    Public Function GetLabEntries(ByVal dt As DataTable)
        Try
            Dim contents_tmp As String = ""
            Dim items As String = ""
            Dim entries As String = ""
            For i As Integer = 0 To dt.Rows.Count - 1
                Dim dr As DataRow = dt.Rows(i)
                If i = 0 Then
                    contents_tmp = contents
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_TITLE", "LAB RESULTS")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEMNAME", "LOINC")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEM", "2.16.840.1.113883.6.1")
                End If

                items = items + "<item>" + dr("lab_text").ToString + "</item>" + vbCrLf
                entries += labentry + vbCrLf
                entries = entries.Replace("TMP_LAB_CODE", dr("lab_code").ToString)
                entries = entries.Replace("TMP_LAB_TEXT", dr("lab_text").ToString)
                entries = entries.Replace("TMP_LAB_CODING_NAME", dr("lab_codesystemname").ToString)
                entries = entries.Replace("TMP_LAB_CODINGSYSTEM", dr("lab_codesystem").ToString)
                entries = entries.Replace("TMP_LAB_DATE", dr("lab_date").ToString)
                entries = entries.Replace("TMP_XSITYPE", dr("lab_xsitype").ToString)
                If dr("lab_xsitype").ToString = "PQ" Then
                    entries = entries.Replace("TMP_LAB_VALUE_SN", "")
                    entries = entries.Replace("TMP_LAB_VALUE", dr("lab_value").ToString)
                End If
                entries = entries.Replace("TMP_LAB_UNIT", dr("lab_unit").ToString)
            Next
            contents_tmp = contents_tmp.Replace("TMP_CONTENTS_ITEMS", items)
            contents_tmp = contents_tmp.Replace("TMP_ENTRIES", entries)
            Return contents_tmp
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        End Try
    End Function

    Public Function GetVitalEntries(ByVal dt As DataTable)
        Try
            Dim contents_tmp As String = ""
            Dim items As String = ""
            Dim entries As String = ""
            For i As Integer = 0 To dt.Rows.Count - 1
                Dim dr As DataRow = dt.Rows(i)
                If i = 0 Then
                    contents_tmp = contents
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_TITLE", "VITAL SIGNS")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEMNAME", "LOINC")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEM", "2.16.840.1.113883.6.1")
                End If

                items = items + "<item>" + dr("vital_text").ToString + "</item>" + vbCrLf
                entries += vitalentry + vbCrLf
                entries = entries.Replace("TMP_VITAL_TEXT", dr("vital_text").ToString)
                entries = entries.Replace("TMP_VITAL_CODESYSNAME", dr("vital_codesystemname").ToString)
                entries = entries.Replace("TMP_VITAL_CODESYSTEM", dr("vital_codesystem").ToString)
                entries = entries.Replace("TMP_VITAL_CODE", dr("vital_code").ToString)
                entries = entries.Replace("TMP_VITAL_DATE", dr("vital_date").ToString)
                entries = entries.Replace("TMP_VITAL_XSITYPE", dr("vital_xsitype").ToString)
                entries = entries.Replace("TMP_VITAL_VALUE", dr("vital_value").ToString)
                entries = entries.Replace("TMP_VITAL_UNIT", dr("vital_unit").ToString)
            Next
            contents_tmp = contents_tmp.Replace("TMP_CONTENTS_ITEMS", items)
            contents_tmp = contents_tmp.Replace("TMP_ENTRIES", entries)
            Return contents_tmp
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        End Try
    End Function

    Public Function GetMedEntries(ByVal dt As DataTable)
        Try
            Dim contents_tmp As String = ""
            Dim items As String = ""
            Dim entries As String = ""
            For i As Integer = 0 To dt.Rows.Count - 1
                Dim dr As DataRow = dt.Rows(i)
                If i = 0 Then
                    contents_tmp = contents
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_TITLE", "MEDICATIONS")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEMNAME", "LOINC")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEM", "2.16.840.1.113883.6.1")
                End If

                items = items + "<item>" + dr("med_text").ToString + "</item>" + vbCrLf
                entries += medentry + vbCrLf
                entries = entries.Replace("TMP_MED_PRODUCTNAME", dr("med_text").ToString)
                entries = entries.Replace("TMP_MED_PRODUCTCODE_SYSNAME", dr("med_codesystemname").ToString)
                entries = entries.Replace("TMP_MED_PRODUCTCODESYSTEM", dr("med_codesystem").ToString)
                entries = entries.Replace("TMP_MED_PRODUCTCODE", dr("med_code").ToString)
                entries = entries.Replace("TMP_MED_DATE_LOW", dr("med_date_low").ToString)
                entries = entries.Replace("TMP_MED_DATE_HIGH", dr("med_date_high").ToString)
                entries = entries.Replace("TMP_MED_DOSE", dr("med_dose").ToString)
                entries = entries.Replace("TMP_MED_UNIT", dr("med_unit").ToString)
            Next
            contents_tmp = contents_tmp.Replace("TMP_CONTENTS_ITEMS", items)
            contents_tmp = contents_tmp.Replace("TMP_ENTRIES", entries)
            Return contents_tmp
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        End Try

    End Function

    Public Function GetProbEntries(ByVal dt As DataTable)
        Try
            Dim contents_tmp As String = ""
            Dim items As String = ""
            Dim entries As String = ""
            For i As Integer = 0 To dt.Rows.Count - 1
                Dim dr As DataRow = dt.Rows(i)
                If i = 0 Then
                    contents_tmp = contents
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_TITLE", "PROBLEM LIST")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEMNAME", "LOINC")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEM", "2.16.840.1.113883.6.1")
                End If

                items = items + "<item>" + dr("prob_text").ToString + "</item>" + vbCrLf
                entries += probentry + vbCrLf
                entries = entries.Replace("TMP_PROB_VALUE_CODE", dr("prob_value_code").ToString)
                entries = entries.Replace("TMP_PROB_VALUE_DISPLAYNAME", dr("prob_text").ToString)
                entries = entries.Replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", dr("prob_codesystemname").ToString)
                entries = entries.Replace("TMP_PROB_VALUE_CODINGSYSTEM", dr("prob_codesystem").ToString)
                entries = entries.Replace("TMP_PROB_DATE_LOW", dr("prob_date_low").ToString)
                entries = entries.Replace("TMP_PROB_DATE_HIGH", dr("prob_date_high").ToString)
                entries = entries.Replace("TMP_PROB_XSITYPE", dr("prob_xsitype").ToString)
                entries = entries.Replace("TMP_PROB_TYPECODE", dr("prob_type_code").ToString)
                entries = entries.Replace("TMP_PROB_TYPEDESCR", dr("prob_type_text").ToString)
                entries = entries.Replace("TMP_PROB_STATUS", dr("prob_status").ToString)
            Next
            contents_tmp = contents_tmp.Replace("TMP_CONTENTS_ITEMS", items)
            contents_tmp = contents_tmp.Replace("TMP_ENTRIES", entries)
            Return contents_tmp
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        End Try

    End Function

    Public Function GetProcEntries(ByVal dt As DataTable)
        Try
            Dim contents_tmp As String = ""
            Dim items As String = ""
            Dim entries As String = ""
            For i As Integer = 0 To dt.Rows.Count - 1
                Dim dr As DataRow = dt.Rows(i)
                If i = 0 Then
                    contents_tmp = contents
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_TITLE", "PROCEDURES")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEMNAME", "LOINC")
                    contents_tmp = contents_tmp.Replace("TMP_CONTENTS_CODESYSTEM", "2.16.840.1.113883.6.1")
                End If

                items = items + "<item>" + dr("proc_text").ToString + "</item>" + vbCrLf
                entries += procentry + vbCrLf
                entries = entries.Replace("TMP_PROC_CODE", dr("proc_code").ToString)
                entries = entries.Replace("TMP_PROC_TEXT", dr("proc_text").ToString)
                entries = entries.Replace("TMP_PROC_CODING_NAME", dr("proc_codesystemname").ToString)
                entries = entries.Replace("TMP_PROC_CODING_SYSTEM", dr("proc_codesystem").ToString)
                entries = entries.Replace("TMP_PROC_LOW", dr("proc_date_low").ToString)
                entries = entries.Replace("TMP_PROC_HIGH", dr("proc_date_high").ToString)
            Next
            contents_tmp = contents_tmp.Replace("TMP_CONTENTS_ITEMS", items)
            contents_tmp = contents_tmp.Replace("TMP_ENTRIES", entries)
            Return contents_tmp
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        End Try

    End Function

    



End Module
