package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/InvalidName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u162/10278/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, December 19, 2017 9:16:24 PM PST
*/

public final class InvalidName extends org.omg.CORBA.UserException
{

  public InvalidName ()
  {
    super(InvalidNameHelper.id());
  } // ctor


  public InvalidName (String $reason)
  {
    super(InvalidNameHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidName
