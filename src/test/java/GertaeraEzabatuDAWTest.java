import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import configuration.ConfigXML;

import dataAccess.DataAccess;
import domain.Event;
import domain.Question;
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
			oneDate = sdf.parse("05/10/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,oneDate,null, betMinimum);
		testDA.close();
		
		
			sut.gertaeraEzabatu(ev);
			
			fail();
			
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
			oneDate = sdf.parse("05/10/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,new Date(),queryText, betMinimum);
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
			oneDate = sdf.parse("05/10/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,new Date(),queryText, 0);
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
			oneDate = sdf.parse("05/10/2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testDA.open();
		ev = testDA.addEventWithQuestion(eventText,new Date(),queryText, betMinimum);
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

}
