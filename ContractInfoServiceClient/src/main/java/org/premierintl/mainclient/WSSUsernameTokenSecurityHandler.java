package org.premierintl.mainclient;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class WSSUsernameTokenSecurityHandler implements SOAPHandler<SOAPMessageContext> {
    public WSSUsernameTokenSecurityHandler() {
    }
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
          System.out.println("\nOutbound message:");
        } else {
        	System.out.println("\nInbound message:");
        }
        
        try {
       context.getMessage().writeTo(System.out);
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return true;
    }
    public Set<QName> getHeaders() {
        return new TreeSet();
    }
    public boolean handleFault(SOAPMessageContext context) {
    	SOAPMessage message= context.getMessage();
		try {
			message.writeTo(System.out);
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
    }
    public void close(MessageContext context) {
        
    }
}