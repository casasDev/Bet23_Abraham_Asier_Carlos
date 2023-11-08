package businessLogic;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import configuration.ConfigXML;
import dataAccess.DataAccess;

public class BLFactory {
	private final ConfigXML c = ConfigXML.getInstance(); 
	public BLFacade getBusinessLogicFactory(int isLocal) throws MalformedURLException {
		// TODO Auto-generated method stub
		if(isLocal==1) {
			return new BLFacadeImplementation(new DataAccess(c.getDataBaseOpenMode().equals("initialize")));
		}
		else if(isLocal==0) {
			String serviceName= "http://"+c.getBusinessLogicNode() +":"+ c.getBusinessLogicPort()+"/ws/"+c.getBusinessLogicName()+"?wsdl";
			 
			//URL url = new URL("http://localhost:9999/ws/ruralHouses?wsdl");
			URL url = new URL(serviceName);

	 
	        //1st argument refers to wsdl document above
			//2nd argument is service name, refer to wsdl document above
//	        QName qname = new QName("http://businessLogic/", "FacadeImplementationWSService");
	        QName qname = new QName("http://businessLogic/", "BLFacadeImplementationService");
	 
	        Service service = Service.create(url, qname);

	         return service.getPort(BLFacade.class);
		}
		else return null;
		
	}

}
