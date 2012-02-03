iCARDEA OpenID Provider
======

So this is an OpenID Provider for iCARDEA that supports the authentication of the
users using the Windows 'Domain Controller'. 

Install
-----

We assume a Windows machine is used for the installation of this server
since some windows specific APIs are used for authenticating users. Also
the code is written in [Python](http://www.python.org/) and therefore it
should be the first to be installed.  Please keep in mind that we
support Python 2.x
([2.7.2](http://www.python.org/download/releases/2.7.2/) at the time of
this writting), i.e. __not the 3.x__ version thereof!!

Now in addition to Python the following python modules should be installed:

 - [pywin32](http://starship.python.net/crew/mhammond/win32/Downloads.html).
   You can find a setup for Python 2.7 in the
   [tools\_resources/python](http://icardea.googlecode.com/svn/trunk/tools_resources/python/)
   directory in the Google Code repository.

 - Various python libs: bottle, jinja2, bottle\_sqlite, python-openid,
   beaker. You can install them all together either using
   [easy\_install](http://pypi.python.org/pypi/setuptools), or
   [pip](http://pypi.python.org/pypi/pip) or even by finding a [Windows
   precompiled binary](http://www.lfd.uci.edu/~gohlke/pythonlibs/). For
   example, you can use `easy_install` by issuing (assuming you have used
   the default settings when installed Python 2.7): 
   
        c:\Python27\Scripts\easy_install bottle jinja2 bottle_sqlite python-openid beaker

 - [active\_directory](http://timgolden.me.uk/python/active_directory.html).
   You can find a zip file containing the code in the
   [tools\_resources/python](http://icardea.googlecode.com/svn/trunk/tools_resources/python/)
   directory in the Google Code repository. You will need to unzip it in
   a temporary file and then issue: `c:\Python27\python setup.py
   install` in this directory.

 The source code can be found in the [Google Code
 repository](http://code.google.com/p/icardea/) of iCARDEA . You need to
 have an svn client ([TortoiseSVN](http://tortoisesvn.tigris.org/) is a
 good one on Windows) and you need to checkout (read only) the
 `trunk/icardea-interop-fmwork/idprovider` path. You can check it out in
 the `c:\icardea\openid`  or similar directory.

 You can run the server either as a standalone server or by employing the
 [mod_wsgi](http://code.google.com/p/modwsgi/) module of Apache, which is the
 preferred option. In the second case you need to do the following:

- Download and install [Apache 2.2](http://httpd.apache.org/download.cgi#apache22). 
  The SSL version is preferred if you plan to secure the server (as you should!!).

- Download the `mod_wsgi.so` lib (the windows binary) from
  <http://code.google.com/p/modwsgi/downloads/detail?name=mod_wsgi-win32-ap22py27-3.3.so>
  and place it in the modules dir of your Apache installation (normally
  this should be something like `C:\Program Files\Apache Software
  Foundation\Apache2.2\modules`).

- Load the module in the Apache configuration file (i.e. httpd.conf):

        LoadModule wsgi_module modules/mod_wsgi.so
    
- In the Apache Configuration file write the following (assuming that you have unzip
  the code in the `c:\iCARDEA\openid`):

        Alias /idp/static C:/iCARDEA/openid/static
        <Directory C:/iCARDEA/openid>
            Order allow,deny
            Allow from all
        </Directory>
        WSGIScriptAlias /idp C:/iCARDEA/openid/icardea_openid.py

- Now visit <http://localhost/idp/> and you should be welcomed by the iCARDEA
  Openid Server!


<small>
Stelios Sfakianakis, 02/02/2012

&copy; 2012 [ICS-FORTH](http://www.ics.forth.gr)
</small>
