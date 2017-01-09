package com.jonson.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello{

	protected HelloImpl() throws RemoteException {

	}

	@Override
	public String helloWorld() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello World!!!";
	}

	@Override
	public String sayHelloToSomeBody(String someBodyName)
			throws RemoteException {
		// TODO Auto-generated method stub
		return "你好，" + someBodyName + "!";
	}

}
