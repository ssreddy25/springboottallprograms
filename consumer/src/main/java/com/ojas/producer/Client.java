package com.ojas.producer;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Client {

	public static void main(String[] args) throws ServiceException, RemoteException {
		
		CalculateService cal=new CalculateServiceLocator();
		
		CalculateSoapBindingStub ca=(CalculateSoapBindingStub) cal.getCalculate();
		System.out.println(ca.calci(2, 4));
	}

}
