package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/AdapterAlreadyExists.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-i586/jdk8u131/8869/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, March 15, 2017 1:31:20 AM PDT
*/

public final class AdapterAlreadyExists extends org.omg.CORBA.UserException
{

  public AdapterAlreadyExists ()
  {
    super(AdapterAlreadyExistsHelper.id());
  } // ctor


  public AdapterAlreadyExists (String $reason)
  {
    super(AdapterAlreadyExistsHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterAlreadyExists
