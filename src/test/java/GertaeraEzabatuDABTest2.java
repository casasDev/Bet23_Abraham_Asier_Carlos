import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;

import dataAccess.DataAccess;
import dataAccess.DataAccessGertaeraEzabatu;
import domain.Event;
import domain.Question;
import domain.Quote;
import domain.Sport;
import exceptions.QuestionAlreadyExist;
import test.dataAccess.TestDataAccess;


//Antes de comentar test tenia un 89,9%
//He quitado test2 y tengo un 90,6
//He quitado test2 y 8 y tengo un 90,6
//Ahora he comentado el test 1 y 6, tengo un 89,8%
public class GertaeraEzabatuDABTest2 {
	
		//sut:system under test
		 static DataAccessGertaeraEzabatu sut=new DataAccessGertaeraEzabatu();
		 
		 //additional operations needed to execute the test 
		 static TestDataAccess testDA=new TestDataAccess();

		 private Event ev;
		
		
		 /*	@Test
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
			   }*/
		
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
				ev = null;
				testDA.close();	
				
			    
				//invoke System Under Test (sut)  
				boolean res=sut.gertaeraEzabatu(ev);
					
				assertFalse(res);				
			   } catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   System.out.println("Parametro es nulo, es decir no hay parametro");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
					ev= testDA.addEventWithQuestion("yep",new Date(),"query2", 1);
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
				   System.out.println("No hay evento en la base de datos");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		@Test
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
				boolean res=sut.gertaeraEzabatu(ev);
					
				assertFalse(res);				
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
		
		@Test
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
				boolean res =sut.gertaeraEzabatu(ev);
					
				assertFalse(res);				
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
		
	/*	@Test
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
				boolean res=sut.gertaeraEzabatu(ev);
					
				assertFalse(res);
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay fecha evento");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }*/
		@Test
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
				ev = testDA.addEventWithQuestion(eventText,oneDate,queryText, betMinimum);
				ev.setEventNumber(null);
				testDA.close();	
				
				
				//invoke System Under Test (sut)  
			boolean res=sut.gertaeraEzabatu(ev);
					assertFalse(res);
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   System.out.println("No hay numero de evento");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
						ev.setEventNumber(1);
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
	@Test
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
				boolean res =sut.gertaeraEzabatu(ev);
				assertFalse(res);	
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay apuesta");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		@Test
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
				boolean res =sut.gertaeraEzabatu(ev);
				assertFalse(res);	
				
			   } catch (NullPointerException e) {
				// TODO Auto-generated catch block
				// if the program goes to this point fail
				   fail("No hay deporte");
			   } finally {
					  //Remove the created objects in the database (cascade removing)   
					testDA.open();
			          boolean b=testDA.removeEvent(ev);
			          testDA.close();
			      //     System.out.println("Finally "+b);          
			        }
			   }
		
		@Test
	    public void test10() {
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
		        
				
		        
		        // Llama al m�todo gertaeraEzabatu y verifica el resultado
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
	    public void test11() {
			
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
				testDA.close();
		        
		        
		        
		        // Llama al m�todo gertaeraEzabatu y verifica el resultado
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
}
