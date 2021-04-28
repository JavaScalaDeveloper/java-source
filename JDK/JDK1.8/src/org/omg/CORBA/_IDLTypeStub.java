/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.

 */
package org.omg.CORBA;


/**
* The Stub for <tt>IDLType</tt>.  For more information on
* Stub files, see <a href="doc-files/generatedfiles.html#stub">
* "Generated Files: Stubs"</a>.<P>
* org/omg/CORBA/_IDLTypeStub.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl.
* 03 June 1999 11:33:44 o'clock GMT+00:00
*/

public class _IDLTypeStub extends org.omg.CORBA.portable.ObjectImpl implements org.omg.CORBA.IDLType
{
  /**
   * Constructs a default <code>_IDLTypeStub</code> object.
   * NOTE:  If the default constructor is used, the
   *        object is useless until the method <code>_set_delegate</code>
   *        has been called.
   */
  // NOTE: This constructor is not required according to the spec. Only JCK expects it now.
  public _IDLTypeStub ()
  {
    super ();
  }

  /**
   * Constructs an <code>_IDLTypeStub</code> object initialized
   * with the given <code>Delegate</code> object.
   *
   * @param delegate a Delegate object
   */
  // NOTE: This constructor is not required according to the spec. We keep it as a convenience method.
  public _IDLTypeStub (org.omg.CORBA.portable.Delegate delegate)
  {
    super ();
    _set_delegate (delegate);
  }

  public org.omg.CORBA.TypeCode type ()
  {
    org.omg.CORBA.portable.InputStream _in = null;
    try {
       org.omg.CORBA.portable.OutputStream _out = _request ("_get_type", true);
       _in = _invoke (_out);
       org.omg.CORBA.TypeCode __result = _in.read_TypeCode ();
       return __result;
    } catch (org.omg.CORBA.portable.ApplicationException _ex) {
       _in = _ex.getInputStream ();
       String _id = _ex.getId ();
       throw new org.omg.CORBA.MARSHAL (_id);
    } catch (org.omg.CORBA.portable.RemarshalException _rm) {
       return type ();
    } finally {
        _releaseReply (_in);
    }
  } // type


  // read interface
  public org.omg.CORBA.DefinitionKind def_kind ()
  {
    org.omg.CORBA.portable.InputStream _in = null;
    try {
       org.omg.CORBA.portable.OutputStream _out = _request ("_get_def_kind", true);
       _in = _invoke (_out);
       org.omg.CORBA.DefinitionKind __result = org.omg.CORBA.DefinitionKindHelper.read (_in);
       return __result;
    } catch (org.omg.CORBA.portable.ApplicationException _ex) {
       _in = _ex.getInputStream ();
       String _id = _ex.getId ();
       throw new org.omg.CORBA.MARSHAL (_id);
    } catch (org.omg.CORBA.portable.RemarshalException _rm) {
       return def_kind ();
    } finally {
        _releaseReply (_in);
    }
  } // def_kind


  // write interface
  public void destroy ()
  {
    org.omg.CORBA.portable.InputStream _in = null;
    try {
       org.omg.CORBA.portable.OutputStream _out = _request ("destroy", true);
       _in = _invoke (_out);
    } catch (org.omg.CORBA.portable.ApplicationException _ex) {
       _in = _ex.getInputStream ();
       String _id = _ex.getId ();
       throw new org.omg.CORBA.MARSHAL (_id);
    } catch (org.omg.CORBA.portable.RemarshalException _rm) {
       destroy ();
    } finally {
        _releaseReply (_in);
    }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CORBA/IDLType:1.0",
    "IDL:omg.org/CORBA/IRObject:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s)
  {
     try
     {
       String str = s.readUTF ();
       org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init ().string_to_object (str);
       org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
       _set_delegate (delegate);
     } catch (java.io.IOException e) {}
  }

  private void writeObject (java.io.ObjectOutputStream s)
  {
     try
     {
       String str = org.omg.CORBA.ORB.init ().object_to_string (this);
       s.writeUTF (str);
     } catch (java.io.IOException e) {}
  }
} // class _IDLTypeStub
