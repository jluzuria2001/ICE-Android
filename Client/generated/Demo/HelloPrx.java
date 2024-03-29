// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `HelloPrx.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public interface HelloPrx extends Ice.ObjectPrx
{
    public void sayHello(int delay);

    public void sayHello(int delay, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sayHello(int delay);

    public Ice.AsyncResult begin_sayHello(int delay, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sayHello(int delay, Ice.Callback __cb);

    public Ice.AsyncResult begin_sayHello(int delay, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_sayHello(int delay, Callback_Hello_sayHello __cb);

    public Ice.AsyncResult begin_sayHello(int delay, java.util.Map<String, String> __ctx, Callback_Hello_sayHello __cb);

    public void end_sayHello(Ice.AsyncResult __result);
}
