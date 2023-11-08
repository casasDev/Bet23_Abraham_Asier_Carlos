package businessLogic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import configuration.ConfigXML;
import dataAccess.DataAccess;
import domain.Event;

public class Main {

	public static void main(String[] args) {
		
		int eL = 1;
		BLFacade blFacade = new BLFactory().getBusinessLogicFactory(eL);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		DataAccess dbManager;
		ConfigXML c=ConfigXML.getInstance();
		
		if (c.getDataBaseOpenMode().equals("initialize")) {
		    dbManager=new DataAccess(c.getDataBaseOpenMode().equals("initialize"));
		    dbManager.initializeDB();
		    } 
		else dbManager=new DataAccess();
		dbManager.close();
		
		try {
			
			try {
				date = sdf.parse("17/12/2023");
				
			} catch (java.text.ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			ExtendedIterator<Event> eie = blFacade.getEventsIterator(date);
			dbManager.open(false);
			ArrayList<Event>  events=dbManager.getEvents(date);
			dbManager.close();
			Event e;
			System.out.println("_____________________");
			System.out.println("RECORRIDO HACIA ATRÁS");
			eie.goLast(); // Hacia atrás
			
			while (eie.hasPrevious()) {
				e = eie.previous();
				System.out.println(e.toString());
			}
			
			System.out.println("_____________________");
			System.out.println("RECORRIDO HACIA ADELANTE");
			eie.goFirst(); // Hacia adelante
			
			while (eie.hasNext()) {
				e = eie.next();
				System.out.println(e.toString());
			}
			
			System.out.println("_____________________");
			System.out.println("IR AL ultimo");
			eie.goLast(); // Posicion de la lista es la ultima
<<<<<<< HEAD
			e = events.get(events.size());
=======
			e = events.get(events.size()-1);
>>>>>>> branch 'master' of https://github.com/casasDev/Bet23_Abraham_Asier_Carlos.git
			System.out.println(e.toString());
			
			
			System.out.println("_____________________");
			System.out.println("IR AL PRIMERO");
			eie.goFirst(); // Posicion de la lista es la primera
			e = events.get(0);
			System.out.println(e.toString());

		}
		catch(ParseException e1) {
			System.out.println("¿Que pasa guapo? ¿Tienes problemas con la fecha?" + date);
		}
		
		
	}
}
