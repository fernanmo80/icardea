Imports System.Collections
Imports System.Net
Imports System.Net.Security
Imports System.Net.Sockets
Imports System.Security.Authentication
Imports System.Text
Imports System.Security.Cryptography.X509Certificates
Imports System.IO

Module SslTcpClient
    Private certificateErrors As New Hashtable()

    ' The following method is invoked by the RemoteCertificateValidationDelegate.
    Public Function ValidateServerCertificate(ByVal sender As Object, ByVal certificate As X509Certificate, ByVal chain As X509Chain, ByVal sslPolicyErrors__1 As SslPolicyErrors) As Boolean
        If sslPolicyErrors__1 = SslPolicyErrors.None Then
            Return True
        End If

        'MessageBox.Show("Certificate error: " + sslPolicyErrors__1)

        ' Do not allow this client to communicate with unauthenticated servers.
        Return False
    End Function
    Public Function RunClient(ByVal machineName As String, ByVal serverName As String, ByVal port As Integer, ByVal hl7msg As String) As String
        ' Create a TCP/IP client socket.
        ' machineName is the host running the server application.
        Dim client As TcpClient = Nothing
        Try
            client = New TcpClient(machineName, port)
            'Console.WriteLine("Client connected.")
            ' Create an SSL stream that will close the client's stream.
            Dim sslStream As New SslStream(client.GetStream(), False, New RemoteCertificateValidationCallback(AddressOf ValidateServerCertificate), Nothing)
            ' The server name must match the name on the server certificate.
            Try
                sslStream.AuthenticateAsClient(serverName)
            Catch e As AuthenticationException
                MessageBox.Show(e.Message)
                If e.InnerException IsNot Nothing Then
                    MessageBox.Show(e.InnerException.Message)
                End If
                'Console.WriteLine("Authentication failed - closing the connection.")
                Return ""
            End Try
            ' Encode a test message into a byte array.
            ' Signal the end of the message using the "<EOF>".
            Dim messsage As Byte() = Encoding.UTF8.GetBytes(hl7msg)
            ' Send hello message to the server. 
            sslStream.Write(messsage)
            sslStream.Flush()
            ' Read message from the server.
            Dim serverMessage As String = ReadMessage(sslStream)
            'Console.WriteLine("Server says: {0}", serverMessage)
            Return serverMessage
        Catch ex As Exception
            MessageBox.Show(ex.Message)
            Return ""
        Finally
            If Not IsNothing(client) Then
                ' Close the client connection.
                client.Close()
                'Console.WriteLine("Client closed.")
            End If
        End Try
    End Function
    Private Function ReadMessage(ByVal sslStream As SslStream) As String
        ' Read the  message sent by the server.
        ' The end of the message is signaled using the
        ' "<EOF>" marker.
        Dim buffer As Byte() = New Byte(2047) {}
        Dim messageData As New StringBuilder()
        Dim bytes As Integer = -1
        Do
            bytes = sslStream.Read(buffer, 0, buffer.Length)

            ' Use Decoder class to convert from bytes to UTF8
            ' in case a character spans two buffers.
            Dim decoder As Decoder = Encoding.UTF8.GetDecoder()
            Dim chars As Char() = New Char(decoder.GetCharCount(buffer, 0, bytes) - 1) {}
            decoder.GetChars(buffer, 0, bytes, chars, 0)
            messageData.Append(chars)
            ' Check for EOF.
            If messageData.ToString().IndexOf(Chr(28) + Chr(13)) <> -1 Then
                Exit Do
            End If
        Loop While bytes <> 0

        Return messageData.ToString()
    End Function


End Module
