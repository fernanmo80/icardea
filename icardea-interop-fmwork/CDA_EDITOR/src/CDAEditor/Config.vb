Imports System.Xml
Imports System.Configuration
Imports System.Reflection
Imports System.Collections.Generic



Public Module ConfigSettings


    Public Function ReadSetting(ByVal key As String) As String
        Return ConfigurationSettings.AppSettings(key)
    End Function

    Public Sub WriteSetting(ByVal key As String, ByVal value As String)
        ' load config document for current assembly
        Dim doc As XmlDocument = loadConfigDocument()

        ' retrieve appSettings node
        Dim node As XmlNode = doc.SelectSingleNode("//appSettings")

        If node Is Nothing Then
            Throw New InvalidOperationException("appSettings section not found in config file.")
        End If

        Try
            ' select the 'add' element that contains the key
            Dim elem As XmlElement = DirectCast(node.SelectSingleNode(String.Format("//add[@key='{0}']", key)), XmlElement)

            If elem IsNot Nothing Then
                ' add value for key
                elem.SetAttribute("value", value)
            Else
                ' key was not found so create the 'add' element 
                ' and set it's key/value attributes 
                elem = doc.CreateElement("add")
                elem.SetAttribute("key", key)
                elem.SetAttribute("value", value)
                node.AppendChild(elem)
            End If
            doc.Save(getConfigFilePath())
        Catch
            Throw
        End Try
    End Sub

    Public Sub RemoveSetting(ByVal key As String)
        ' load config document for current assembly
        Dim doc As XmlDocument = loadConfigDocument()

        ' retrieve appSettings node
        Dim node As XmlNode = doc.SelectSingleNode("//appSettings")

        Try
            If node Is Nothing Then
                Throw New InvalidOperationException("appSettings section not found in config file.")
            Else
                ' remove 'add' element with coresponding key
                node.RemoveChild(node.SelectSingleNode(String.Format("//add[@key='{0}']", key)))
                doc.Save(getConfigFilePath())
            End If
        Catch e As NullReferenceException
            Throw New Exception(String.Format("The key {0} does not exist.", key), e)
        End Try
    End Sub

    Private Function loadConfigDocument() As XmlDocument
        Dim doc As XmlDocument = Nothing
        Try
            doc = New XmlDocument()
            doc.Load(getConfigFilePath())
            Return doc
        Catch e As System.IO.FileNotFoundException
            Throw New Exception("No configuration file found.", e)
        End Try
    End Function

    Private Function getConfigFilePath() As String
        Return Assembly.GetExecutingAssembly().Location & ".config"
    End Function
End Module
