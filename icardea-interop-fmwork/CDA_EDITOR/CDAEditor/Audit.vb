Imports System.Net
Imports System.Net.Sockets

Module Audit

    Public patientid, submissionsetid As String
    Function AnotherConversion(ByVal s As String) As String
        Dim i As Integer
        Dim sb As New System.Text.StringBuilder(s.Length \ 2)
        For i = 0 To s.Length - 2 Step 2
            sb.Append(Chr(Convert.ToByte(s.Substring(i, 2), 16)))
        Next
        Return sb.ToString
    End Function

    Public Sub AuditMsgITI41()
        Dim clientSocket As New System.Net.Sockets.UdpClient()
        Dim serverStream As NetworkStream
        Dim event_datetime = DateTime.Now.ToString("yyyy-MM-dd'T'HH:mm:ss")
        Dim hostname, appname, procid As String
        Dim header, requestornetaccesspointid, receivernetaccesspointid, bom As String
        Dim xds As String = System.Configuration.ConfigurationSettings.AppSettings("xds").ToString()
        appname = "CDA_EDITOR"
        hostname = Dns.GetHostName()
        receivernetaccesspointid = System.Configuration.ConfigurationSettings.AppSettings("ATNA_ip").ToString()
        Dim host As IPHostEntry = Dns.GetHostEntry(Dns.GetHostName)
        If host.AddressList.Length > 0 Then
            requestornetaccesspointid = host.AddressList(0).ToString
        Else
            requestornetaccesspointid = "0.0.0.0"
        End If
        procid = "123"
        Dim encoding As New System.Text.UTF8Encoding()
        header = "<80>1 " + event_datetime + " " + hostname + " " + appname + " " + procid + " " + "IHE+RFC-3881" + " - "
        Dim b1 As Byte() = encoding.GetBytes(header)
        'Dim b As Byte()
        'b(0) = "\0xEF"
        'b(1) = "0xBB"
        'b(2) = "0xBF"
        'Dim c1 As Char = "&HEF"
        'Dim c2 As Char = "&HBB"
        'Dim c3 As Char = "&HBF"
        'bom = "EFBBBF"
        'bom = AnotherConversion(bom)
        Dim b2 As Byte()
        b2 = New Byte() {CByte(&HEF), CByte(&HBB), CByte(&HBF)}
        'bom = System.Text.Encoding.UTF32.GetString(b)
        'bom = Chr(239) + Chr(187) + Chr(191)
        'header = header + bom
        Try
            Dim msg As String = "<AuditMessage><EventIdentification EventOutcomeIndicator=""0"" EventDateTime=""" + event_datetime + """ EventActionCode=""C""><EventID codeSystemName=""DCM"" displayName=""Import"" code=""110107""/><EventTypeCode codeSystemName=""IHE Transactions"" displayName=""Provide &amp; Register Document Set-b"" code=""ITI-41""/></EventIdentification><ActiveParticipant NetworkAccessPointTypeCode=""2"" NetworkAccessPointID=""" + requestornetaccesspointid + """ UserIsRequestor=""true"" UserID=""http://www.w3.org/2005/08/addressing/anonymous""><RoleIDCode codeSystemName=""DCM"" displayName=""Source"" code=""110153""/></ActiveParticipant><ActiveParticipant NetworkAccessPointTypeCode=""2"" NetworkAccessPointID=""" + receivernetaccesspointid + """ UserIsRequestor=""false"" UserID=""" + xds + """><RoleIDCode codeSystemName=""DCM"" displayName=""Destination"" code=""110152""/></ActiveParticipant><AuditSourceIdentification AuditSourceID=""MISYS"" AuditEnterpriseSiteID=""MISYS""/><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=""1"" ParticipantObjectTypeCode=""1"" ParticipantObjectID=""" + patientid + """><ParticipantObjectIDTypeCode code=""2""/><ParticipantObjectName>PatientIdentifier</ParticipantObjectName></ParticipantObjectIdentification><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=""20"" ParticipantObjectTypeCode=""2"" ParticipantObjectID=""" + submissionsetid + """><ParticipantObjectIDTypeCode code=""urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd""/><ParticipantObjectName>SubmissionSet</ParticipantObjectName></ParticipantObjectIdentification></AuditMessage>"
            'msg = header + msg
            Dim b3 As Byte() = System.Text.Encoding.UTF8.GetBytes(msg)
            'msg = System.Text.Encoding.UTF8.GetString(b3)
            'msg = header + msg
            'MsgBox(msg)
            clientSocket.Connect(System.Configuration.ConfigurationSettings.AppSettings("ATNA_ip").ToString(), CInt(System.Configuration.ConfigurationSettings.AppSettings("ATNA_port")))
            'serverStream = clientSocket.GetStream()
            'Dim outStream As Byte() = _
            'System.Text.Encoding.ASCII.GetBytes(msg)
            Dim outStream(b1.Length + b2.Length + b3.Length - 1) As Byte
            Buffer.BlockCopy(b1, 0, outStream, 0, b1.Length)
            Buffer.BlockCopy(b2, 0, outStream, b1.Length, b2.Length)
            Buffer.BlockCopy(b3, 0, outStream, b1.Length + b2.Length, b3.Length)

            clientSocket.Send(outStream, outStream.Length)
            'serverStream.Write(outStream, 0, outStream.Length)
            'serverStream.Flush()

            'Dim inStream(10024) As Byte
            'serverStream.Read(inStream, 0, CInt(clientSocket.ReceiveBufferSize))
            'Dim returndata As String = _
            'System.Text.Encoding.ASCII.GetString(inStream)
            'MessageBox.Show("Data from Server : " + returndata)
            

            'Dim receiveBytes As [Byte]() = clientSocket.Receive(ep)
            'Dim returnData As String = System.Text.Encoding.ASCII.GetString(receiveBytes)
            'MessageBox.Show("Data from Server : " + returnData)

        Catch ex As Exception
            MessageBox.Show("AUDIT FAILED: " + ex.Message)
        Finally
            If Not IsNothing(clientSocket) Then
                clientSocket.Close()
            End If
        End Try
    End Sub
End Module
