/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.

 */
package org.omg.CORBA;


/**
* The Helper for <tt>Visibility</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/VisibilityHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* 03 June 1999 11:33:44 o'clock GMT+00:00
*/


// orbos 98-01-18: Objects By Value -- begin
abstract public class VisibilityHelper
{
  private static String  _id = "IDL:omg.org/CORBA/Visibility:1.0";

  public static void insert (org.omg.CORBA.Any a, short that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static short extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.CORBA.VisibilityHelper.id (), "Visibility", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static short read (org.omg.CORBA.portable.InputStream istream)
  {
    short value = (short)0;
    value = istream.read_short ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, short value)
  {
    ostream.write_short (value);
  }

}
