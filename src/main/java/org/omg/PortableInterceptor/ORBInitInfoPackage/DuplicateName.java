package org.omg.PortableInterceptor.ORBInitInfoPackage;


/**
* org/omg/PortableInterceptor/ORBInitInfoPackage/DuplicateName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u162/10278/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, December 19, 2017 9:16:24 PM PST
*/

public final class DuplicateName extends org.omg.CORBA.UserException
{

  /** 
         * The name for which there was already an interceptor registered.
         */
  public String name = null;

  public DuplicateName ()
  {
    super(DuplicateNameHelper.id());
  } // ctor

  public DuplicateName (String _name)
  {
    super(DuplicateNameHelper.id());
    name = _name;
  } // ctor


  public DuplicateName (String $reason, String _name)
  {
    super(DuplicateNameHelper.id() + "  " + $reason);
    name = _name;
  } // ctor

} // class DuplicateName
