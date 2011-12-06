/*
* ////////////////////////////////////////////////////////////////////////////////
* //
* //  Kap IT  -  Copyright 2009 Kap IT  -  All Rights Reserved.  
* //   
* //  TERMS OF USE  
* //  Developers who wish to access source code must agree to the License that accompanies the code
* //  (see file “License.txt” contained in the archive, or http://lab.kapit.fr/display/Store/Licenses)
* //  If you use the source code, you accept to be bound by the License.  If you do not accept the License, do not use the source code.  
* //  Licensees may use the source code to assist with the development of related software. Licensees may not modify or redistribute the source code.  
* //
* ////////////////////////////////////////////////////////////////////////////////
*/

package fr.kapit.demo.data
{
/**
* A very simple object used to illustrate proxy 
*/
public class MyLink
{
    [Bindable]
    public var start:String;

    [Bindable]
    public var end:String;
    
    [Bindable]
    public var spriteid:String;

    [Bindable]
    public var did:String;

    [Bindable]
    public var name:String;

    [Bindable]
    public var uid:String;

    public function MyLink()
    {
    }

}
}