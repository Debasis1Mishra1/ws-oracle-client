package org.grubhub.mainclient;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class WSSUsernameTokenSecurityHandler implements SOAPHandler<SOAPMessageContext> {
    
    private String login = "Nick_Virgilio@premierintl.com";
    
    private String pwd = "Vertiv2018";
    public WSSUsernameTokenSecurityHandler() {
    }
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            try {
//                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
//                SOAPFactory factory = SOAPFactory.newInstance();
//                String prefix = "wsse";
//                String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
//                SOAPElement securityElem = factory.createElement("Security", prefix, uri);
//                securityElem.addAttribute(QName.valueOf("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
//                
//                SOAPElement tokenElem = factory.createElement("UsernameToken", prefix, uri);
//                tokenElem.removeNamespaceDeclaration(prefix);
//                tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-1");
//                //tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
//                SOAPElement userElem = factory.createElement("Username", prefix, uri);
//                userElem.addTextNode(login);
//                SOAPElement pwdElem = factory.createElement("Password", prefix, uri);
//                pwdElem.addTextNode(pwd);
//                
//                SOAPElement nonceElem = factory.createElement("Nonce", prefix, uri);
//                nonceElem.addAttribute(QName.valueOf("EncodingType"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
//                nonceElem.addTextNode("N4FZVwk6Xb02D7V7wP46iA==");
//                
//               // pwdElem.addAttribute(QName.valueOf("Type"), "");
//                tokenElem.addChildElement(userElem);
//                tokenElem.addChildElement(pwdElem);
//                securityElem.addChildElement(tokenElem);
//                securityElem.addChildElement(nonceElem);
//                
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//                Calendar c1 = Calendar.getInstance();
//                c1.add(Calendar.HOUR_OF_DAY, 6);
//                String creaDate = sdf.format(c1.getTime());
//                c1.add(Calendar.MINUTE,20);
//                String expDate = sdf.format(c1.getTime());
//                
//                System.out.println(creaDate);
//            	System.out.println(expDate);
//                
//                SOAPElement CreatedElem = factory.createElement("Created", prefix, uri);
//                CreatedElem.addTextNode(creaDate);
//                securityElem.addChildElement(CreatedElem);
//                
//                SOAPElement timestampElem = factory.createElement("Timestamp", "wsu", uri);
//                timestampElem.addAttribute(QName.valueOf("wsu:Id"), "TS-1");
//                
//                SOAPElement createdElem = factory.createElement("Created", "wsu", uri);
//                createdElem.addTextNode(creaDate);
//                SOAPElement expiresElem = factory.createElement("Expires", "wsu", uri);
//                expiresElem.addTextNode(expDate);
//                
//                timestampElem.addChildElement(createdElem);
//                timestampElem.addChildElement(expiresElem);
//                
//                securityElem.addChildElement(timestampElem);
//                
//                SOAPHeader header = envelope.getHeader();
//                if (header == null) {
//                	   header = envelope.addHeader();
//                	}
               // header.addChildElement(securityElem);

                
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("\nOutbound message:");
        } else {
        	System.out.println("\nInbound message:");
        }
        
        try {
        	System.out.println(context.getMessage().getSOAPPart().getXmlVersion());
        	System.out.println(context.getMessage().getSOAPBody().getTextContent());
        	System.out.println(context.getMessage().getSOAPHeader().getTextContent());
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
        //
    }
}