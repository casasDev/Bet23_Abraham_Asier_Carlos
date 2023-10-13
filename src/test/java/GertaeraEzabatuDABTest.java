import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import dataAccess.DataAccess;
import domain.Event;
import domain.Question;
import exceptions.QuestionAlreadyExist;
import test.dataAccess.TestDataAccess;

public class GertaeraEzabatuDABTest {
	
		//sut:system under test
		 static DataAccess sut=new DataAccess();
		 
		 //additional operations needed to execute the test 
		 static TestDataAccess testDA=new TestDataAccess();

		 private Event ev;
		
		
		@Test
		public void test1() {
			try {
				
				//define paramaters
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
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,oneDate,"query2", betMinimum);
				testDA.close();			
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev);
					
				assertTrue(true);
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail  
				fail();
				} finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		@Test
		public void test2() {
			try {
				
				//define paramaters
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
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,oneDate,"query2", betMinimum);
				testDA.close();	
				
			
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(null);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("Parametro es nulo, es decir no hay parametro");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		@Test
		public void test3() {
			try {
				
				//define paramaters
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
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,oneDate,"query2", betMinimum);
				testDA.close();	
				
				Event ev1 = new Event();
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev1);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		public void test4() {
			try {
				
				//define paramaters
				String eventText="event1";
				String queryText="";
				Float betMinimum=new Float(2);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/10/2022");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, betMinimum);
				testDA.close();	
				
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		public void test5() {
			try {
				
				//define paramaters
				String eventText="event1";
				String queryText="";
				Float betMinimum=new Float(2);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/10/2022");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,oneDate,null, betMinimum);
				testDA.close();	
				
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		public void test6() {
			try {
				
				//define paramaters
				String eventText="event1";
				String queryText="yepa";
				Float betMinimum=new Float(2);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/10/2022");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,null,queryText, betMinimum);
				testDA.close();	
				
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		public void test7() {
			try {
				
				//define paramaters
				String eventText="event1";
				String queryText="yepa";
				Float betMinimum=new Float(2);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/10/2022");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(null,oneDate,queryText, betMinimum);
				ev.setEventNumber(null);
				testDA.close();	
				
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		public void test8() {
			try {
				
				//define paramaters
				String eventText="event1";
				String queryText="yepa";
				Float betMinimum=new Float(2);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/10/2022");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, 0);
				
				testDA.close();	
				
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		public void test9() {
			try {
				
				//define paramaters
				String eventText="event1";
				String queryText="yepa";
				Float betMinimum=new Float(2);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/10/2022");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure the state of the system (create object in the dabatase)
				testDA.open();
				ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, betMinimum);
				ev.setSport(null);
				testDA.close();	
				
				
				//invoke System Under Test (sut)  
				sut.gertaeraEzabatu(ev);
					
				fail();
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
}
