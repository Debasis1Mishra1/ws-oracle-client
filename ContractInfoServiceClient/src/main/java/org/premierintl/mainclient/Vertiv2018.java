package org.premierintl.mainclient;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class Vertiv2018 implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
