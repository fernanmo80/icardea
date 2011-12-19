Imports System.Net.Sockets
Imports System.Text
Imports System.Windows.Forms

Public Class MapID

    Private Sub OK_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles OK_Button.Click
        Me.DialogResult = System.Windows.Forms.DialogResult.OK
        Me.Close()
    End Sub

    Private Sub Cancel_Button_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Cancel_Button.Click
        Me.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.Close()
    End Sub


    Private Sub ParsePIXResponse(ByVal resp As String)
        Try
            Dim k As Integer = resp.IndexOf("PID|")
            If k >= 0 Then
                resp = resp.Substring(k)
                Dim segs As String() = resp.Split("|")
                Dim ehr_id As String()
                If segs.Length >= 4 And segs(3).Trim.Length > 0 Then
                    Dim tmpstr() As String = segs(3).Split("~")
                    ehr_id = tmpstr(0).Split("^")
                    pid = ehr_id(0)
                    pnsp = ehr_id(3)
                End If
                If segs.Length >= 6 And segs(5).Trim.Length > 0 Then
                    ehr_id = segs(5).Split("^")
                    plname = ehr_id(0)
                    pfname = ehr_id(1)
                End If
                If segs.Length >= 8 And segs(8).Trim.Length > 0 Then
                    psex = segs(8).Substring(0, 1)
                End If
                If segs.Length >= 9 And segs(7).Trim.Length > 0 Then
                    pdob = segs(7)
                End If

            End If
        Catch ex As Exception
            MessageBox.Show("Error parsing PIX response:" + ex.Message)
        End Try
    End Sub


    Private Sub mapButton_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles mapButton.Click
        pid = ""
        pnsp = ""
        pfname = ""
        plname = ""
        psex = "EMPTY"
        pdob = ""
        Dim clientSocket As New System.Net.Sockets.TcpClient()
        Dim serverStream As NetworkStream
        Try
            If hisidTextBox.Text.Trim.Length = 0 Or nspComboBox.SelectedIndex <= 0 Then
                Return
            End If
            'Dim msg As String = "MSH|^~\&|CDAEditor|EHR|PIX|EHR|" + DateTime.Now.ToString("yyyyMMddHHmmss") + "||QBP^Q23^QBP_Q21|CDAEditorMsg|P|2.5" + vbCr + _
            '                        "QPD|IHE PIX Query|CDAEditorQry|" + hisidTextBox.Text.Trim + "^^^" + hisnspTextBox.Text.Trim + "|" + vbCr + _
            '                        "RCP|I" + vbCr
            Dim msg As String = "MSH|^~\&|CDAEditor|EHR|PIX|EHR|" + DateTime.Now.ToString("yyyyMMddHHmmss") + "||QBP^Q22^QBP_Q21|CDAEditorMsg|P|2.5" + vbCr + _
                                "QPD|Q22^Find Candidates^HL7|CDAEditorQry|@PID.3.1^" + hisidTextBox.Text.Trim + "~@PID.3.4.1^" + nspComboBox.Text + vbCr + _
                                "RCP|I" + vbCr
            msg = Chr(11) + msg + Chr(28) + Chr(13)
            clientSocket.Connect(System.Configuration.ConfigurationSettings.AppSettings("PIX_ip").ToString(), CInt(System.Configuration.ConfigurationSettings.AppSettings("PIX_port")))
            serverStream = clientSocket.GetStream()
            Dim outStream As Byte() = _
            System.Text.Encoding.ASCII.GetBytes(msg)
            serverStream.Write(outStream, 0, outStream.Length)
            serverStream.Flush()

            Dim inStream(10024) As Byte
            serverStream.Read(inStream, 0, CInt(clientSocket.ReceiveBufferSize))
            Dim returndata As String = _
            System.Text.Encoding.ASCII.GetString(inStream)
            'MessageBox.Show("Data from Server : " + returndata)
            ParsePIXResponse(returndata)
            If returndata.Contains("ERR") = True Then
                MessageBox.Show("PIX error")
                Return
            ElseIf pid.Trim.Length = 0 Or pnsp.Trim.Length = 0 Then
                MessageBox.Show("Patient does not exist")
                Return
            End If
        Catch ex As Exception
            MessageBox.Show("ERROR OCCURED: " + ex.Message)
        Finally
            pidTextBox.Text = pid
            pnspTextBox.Text = pnsp
            If Not IsNothing(clientSocket) Then
                clientSocket.Close()
            End If
        End Try
    End Sub

    Private Sub MapID_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        pid = ""
        pnsp = ""
        pfname = ""
        plname = ""
        psex = "EMPTY"
        pdob = DateTime.Now.ToString
    End Sub
End Class
