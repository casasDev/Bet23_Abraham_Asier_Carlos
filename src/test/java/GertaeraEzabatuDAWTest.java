import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jdo.Query;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.mockito.Mockito;

import com.sun.tools.javac.util.List;

import configuration.ConfigXML;

import dataAccess.DataAccess;
import domain.ApustuAnitza;
import domain.Event;
import domain.Question;
import domain.Quote;
import domain.Sport;
import exceptions.EventFinished;
import exceptions.QuestionAlreadyExist;
import test.businessLogic.TestFacadeImplementation;
import test.dataAccess.TestDataAccess;

public class GertaeraEzabatuDAWTest {
	
	
	//sut:system under test
	static DataAccess sut=new DataAccess();
		 
	static TestDataAccess testDA=new TestDataAccess();

	private Event ev;
	
	@Test
	public void test1(){
		
		try {
		String eventText="event1";
		String queryText="query1";
		Float betMinimum=new Float(2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date oneDate=null;;
		try {
			oneDate = sdf.parse("05/10/2025");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,oneDate,null, betMinimum);
		testDA.addSport("sport1");
		testDA.close();
		
		
			boolean res=sut.gertaeraEzabatu(ev);
			
assertFalse(res);			
		}catch(NullPointerException e) {
			
			assertTrue(false);
		}
		
		finally {
			  //Remove the created objects in the database (cascade removing)   
			testDA.open();
	         boolean b=testDA.removeEvent(ev);
	          testDA.close();
	         System.out.println("Finally "+b);          
	        }
		
	}
	
	@Test
	public void test2(){
		
		try {
		String eventText="event1";
		String queryText="query1";
		Float betMinimum=new Float(2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date oneDate=null;;
		try {
			oneDate = sdf.parse("05/10/2024");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, betMinimum);
		testDA.close();
		
		
		sut.gertaeraEzabatu(ev);
			
		assertTrue(true);
			
		}catch(NullPointerException e) {
			
			fail();
		}
		
		finally {
			  //Remove the created objects in the database (cascade removing)   
			testDA.open();
	         boolean b=testDA.removeEvent(ev);
	          testDA.close();
	         System.out.println("Finally "+b);          
	        }
		
	}
	
	@Test
	public void test3(){
		
		try {
		String eventText="event1";
		String queryText="query1";
		Float betMinimum=new Float(2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date oneDate=null;;
		try {
			oneDate = sdf.parse("05/10/2024");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, 0);
		testDA.close();
		
		
		sut.gertaeraEzabatu(ev);
			
		assertTrue(true);
			
		}catch(NullPointerException e) {
			
			fail();
		}
		
		finally {
			  //Remove the created objects in the database (cascade removing)   
			testDA.open();
	         boolean b=testDA.removeEvent(ev);
	          testDA.close();
	         System.out.println("Finally "+b);          
	        }
		
	}
	
	@Test
	public void test4(){
		
		try {
		String eventText="event1";
		String queryText="query1";
		Float betMinimum=new Float(2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date oneDate=null;;
		try {
			oneDate = sdf.parse("05/11/2023");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, betMinimum);
		testDA.close();
		
		
		sut.gertaeraEzabatu(ev);
			
		assertTrue(true);
			
		}catch(NullPointerException e) {
			
			fail();
		}
		
		finally {
			  //Remove the created objects in the database (cascade removing)   
			testDA.open();
	         boolean b=testDA.removeEvent(ev);
	          testDA.close();
	         System.out.println("Finally "+b);          
	        }
		
	}
	
	@Test
    public void test5() {
		
		try {
		String eventText="event1";
		String queryText="query1";
		Float betMinimum=new Float(2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date oneDate=null;;
		try {
			oneDate = sdf.parse("05/10/2025");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, betMinimum);
		Question question1 = new Question();
        question1.setResult(null);
        Question question2 = new Question();
        question2.setResult(null);
        ev.addQuestion(queryText,betMinimum);
        ev.addQuestion(queryText,betMinimum);
		testDA.close();
        
		
        
        // Llama al método gertaeraEzabatu y verifica el resultado
        boolean resultado = sut.gertaeraEzabatu(ev);
        assertFalse(resultado);
        
		}
			catch(NullPointerException e) {
		
		fail();
	}
		
		finally {
			  //Remove the created objects in the database (cascade removing)   
			testDA.open();
	         boolean b=testDA.removeEvent(ev);
	          testDA.close();
	         System.out.println("Finally "+b);          
	        }
    }
	
	@Test
    public void test6() {
        
		try {
		String eventText="event1";
		String queryText="query1";
		Float betMinimum=new Float(2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date oneDate=null;;
		try {
			oneDate = sdf.parse("05/10/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, betMinimum);
		Question question1 = new Question();
        question1.setResult("nbv");
        Question question2 = new Question();
        question2.setResult("123");
        ev.addQuestion(queryText,betMinimum);
        ev.addQuestion(queryText,betMinimum);
        Sport sport = new Sport();
        ev.setSport(sport);
        Class<EntityManager> entityManager = EntityManager.class;
        TypedQuery<Quote> query;
     // Simular la base de datos con cotizaciones y apuestas pero ni idea
        //Event eventF=(entityManager.find(Event.class, ev));
        //query  =entityManager.createQuery("yepa", (Quote.class));
        //query = (query.setParameter(1, ev.getEventNumber()));
        //List<Quote> listQUO = (List<Quote>) query.getResultList();
        //Quote qu = (entityManager.find(Quote.class, listQUO.get(0)));
       // ApustuAnitza apustuAnitza = qu.getApustuak().get(0).getApustuAnitza();
        //ApustuAnitza ap1 = entityManager.find(ApustuAnitza.class, apustuAnitza.getApustuAnitzaNumber());
		testDA.close();
        
        
        
        // Llama al método gertaeraEzabatu y verifica el resultado
        boolean resultado = sut.gertaeraEzabatu(ev);
        // Agrega aquí las afirmaciones necesarias
        assertFalse(resultado);
	}
	catch(NullPointerException e) {

fail();
}
        
        finally {
			  //Remove the created objects in the database (cascade removing)   
			testDA.open();
	         boolean b=testDA.removeEvent(ev);
	          testDA.close();
	         System.out.println("Finally "+b);          
	        }
    }

}
