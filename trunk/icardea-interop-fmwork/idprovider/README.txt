iCARDEA OpenID Provider
======

So this is an OpenID Provider for iCARDEA that supports the authentication of the
users using the Windows 'Domain Controller'. 

Install
-----

We assume a Windows machine is used for the installation of this server since some
windows specific APIs are used for authenticating users. Also the code is written in
[Python](http://www.python.org/) and therefore it should be the first to be
installed. 

Now in addition to Python the following python modules should be installed (either
using [easy_install](http://pypi.python.org/pypi/setuptools), or
[pip](http://pypi.python.org/pypi/pip) or even by finding a [Windows precompiled
binary](http://www.lfd.uci.edu/~gohlke/pythonlibs/)):

 - [pywin32](http://pywin32.sourceforge.net/)
 - bottle
 - jinja2
 - bottle_sqlite
 - python-openid
 - beaker
 - [active_directory](http://timgolden.me.uk/python/ad_cookbook.html)

 You can run the server either as a standalone server or by employing the
 [mod_wsgi](http://code.google.com/p/modwsgi/) module of Apache, which is the
 preferred option. In the second case you need to do the following:

- Download the `mod_wsgi.so` lib (the windows binary) from
  <http://code.google.com/p/modwsgi/wiki/DownloadTheSoftware> and place it in the
  modules dir of your Apache installation (normally this should be something like
  `C:\Program Files\Apache Software Foundation\Apache2.2\modules`).

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
Stelios Sfakianakis, 17/10/2011

&copy; 2011 [ICS-FORTH](http://www.ics.forth.gr)
</small>
