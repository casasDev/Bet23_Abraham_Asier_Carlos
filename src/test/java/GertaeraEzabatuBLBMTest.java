import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import dataAccess.DataAccess;
import domain.Event;
import domain.Question;
import exceptions.EventFinished;
import exceptions.QuestionAlreadyExist;

public class GertaeraEzabatuBLBMTest {
	 DataAccess dataAccess=Mockito.mock(DataAccess.class);
     Event mockedEvent=Mockito.mock(Event.class);
     @InjectMocks
	 BLFacade sut=new BLFacadeImplementation(dataAccess);
     
     @Test
     public void test1() {
			try {
				//define paramaters
				String queryText="proba galdera";
				Float betMinimum=new Float(2);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/11/2023");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure Mock
				Mockito.doReturn(oneDate).when(mockedEvent).getEventDate();
				Mockito.doReturn(2).when(mockedEvent).getEventNumber();
				ArrayList<Question> arrayPre =new ArrayList<Question>();
				Question q = (dataAccess).createQuestion(mockedEvent,queryText,betMinimum);
				q.setResult("2 a 0");
				arrayPre.add(q);
				Mockito.doReturn(arrayPre).when(mockedEvent).getQuestions();
				
				//invoke System Under Test (sut) 
				boolean result=sut.gertaeraEzabatu(mockedEvent);
				
				//assertFalse(result);
				assertTrue(result);
				//verify the results
				ArgumentCaptor<Event> eventCaptor = ArgumentCaptor.forClass(Event.class);
				Mockito.verify(dataAccess,Mockito.times(1)).gertaeraEzabatu(eventCaptor.capture());
				assertEquals(eventCaptor.getValue(),mockedEvent);
				

			   } 
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				assertTrue(true);
				} catch (QuestionAlreadyExist e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
			   }
     
     @Test
     public void test2() {
			try {
				//define paramaters
				String queryText="proba galdera";
				Float betMinimum=new Float(2);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/11/2023");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure Mock
				Mockito.doReturn(oneDate).when(mockedEvent).getEventDate();
				Mockito.doReturn(2).when(mockedEvent).getEventNumber();
				ArrayList<Question> arrayPre =new ArrayList<Question>();
				Question q = (dataAccess).createQuestion(mockedEvent,queryText,betMinimum);
				q.setResult("2 a 0");
				arrayPre.add(q);
				Mockito.doReturn(arrayPre).when(mockedEvent).getQuestions();
				
				//invoke System Under Test (sut) 
				boolean result=sut.gertaeraEzabatu(null);
				
				//assertFalse(result);
				assertFalse(result);
				//verify the results
				ArgumentCaptor<Event> eventCaptor = ArgumentCaptor.forClass(Event.class);
				Mockito.verify(dataAccess,Mockito.times(1)).gertaeraEzabatu(eventCaptor.capture());
				assertEquals(eventCaptor.getValue(),mockedEvent);
				

			   } 
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				assertTrue(true);
				} catch (QuestionAlreadyExist e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
			   }
     
     @Test
     public void test3() {
			try {
				//define paramaters
				String queryText="proba galdera";
				Float betMinimum=new Float(2);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/11/2023");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure Mock
				Mockito.doReturn(oneDate).when(mockedEvent).getEventDate();
				Mockito.doReturn(2).when(mockedEvent).getEventNumber();
				ArrayList<Question> arrayPre =new ArrayList<Question>();
				//Question q = (dataAccess).createQuestion(mockedEvent,queryText,betMinimum);
				//q.setResult("2 a 0");
				//arrayPre.add(q);
				Mockito.doReturn(arrayPre).when(mockedEvent).getQuestions();
				
				//invoke System Under Test (sut) 
				boolean result=sut.gertaeraEzabatu(mockedEvent);
				
				//assertFalse(result);
				assertFalse(result);
				//verify the results
				ArgumentCaptor<Event> eventCaptor = ArgumentCaptor.forClass(Event.class);
				Mockito.verify(dataAccess,Mockito.times(1)).gertaeraEzabatu(eventCaptor.capture());
				assertEquals(eventCaptor.getValue(),mockedEvent);
				

			   } 
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				assertTrue(true);
				}
			
			
			   }
     
     @Test
     public void test4() {
			try {
				//define paramaters
				String queryText="proba galdera";
				Float betMinimum=new Float(2);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/11/2023");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure Mock
				Mockito.doReturn(oneDate).when(mockedEvent).getEventDate();
				Mockito.doReturn(2).when(mockedEvent).getEventNumber();
				ArrayList<Question> arrayPre =new ArrayList<Question>();
				//Question q = (dataAccess).createQuestion(mockedEvent,queryText,betMinimum);
				//q.setResult("2 a 0");
				//arrayPre.add(q);
				Mockito.doReturn(null).when(mockedEvent).getQuestions();
				
				//invoke System Under Test (sut) 
				boolean result=sut.gertaeraEzabatu(mockedEvent);
				
				//assertFalse(result);
				assertFalse(result);
				//verify the results
				ArgumentCaptor<Event> eventCaptor = ArgumentCaptor.forClass(Event.class);
				Mockito.verify(dataAccess,Mockito.times(1)).gertaeraEzabatu(eventCaptor.capture());
				assertEquals(eventCaptor.getValue(),mockedEvent);
				

			   } 
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				assertTrue(true);
				}
			
			
			   }
     
     @Test
     public void test5() {
			try {
				//define paramaters
				String queryText="proba galdera";
				Float betMinimum=new Float(2);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/11/2023");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure Mock
				Mockito.doReturn(oneDate).when(mockedEvent).getEventDate();
				Mockito.doReturn(null).when(mockedEvent).getEventNumber();
				ArrayList<Question> arrayPre =new ArrayList<Question>();
				Question q = (dataAccess).createQuestion(mockedEvent,queryText,betMinimum);
				q.setResult("2 a 0");
				arrayPre.add(q);
				Mockito.doReturn(arrayPre).when(mockedEvent).getQuestions();
				
				//invoke System Under Test (sut) 
				boolean result=sut.gertaeraEzabatu(mockedEvent);
				
				//assertFalse(result);
				assertFalse(result);
				//verify the results
				ArgumentCaptor<Event> eventCaptor = ArgumentCaptor.forClass(Event.class);
				Mockito.verify(dataAccess,Mockito.times(1)).gertaeraEzabatu(eventCaptor.capture());
				assertEquals(eventCaptor.getValue(),mockedEvent);
				

			   } 
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				assertTrue(true);
				} catch (QuestionAlreadyExist e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			   }
     
     @Test
     public void test6() {
			try {
				//define paramaters
				String queryText="proba galdera";
				Float betMinimum=new Float(2);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/11/2023");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure Mock
				Mockito.doReturn(null).when(mockedEvent).getEventDate();
				Mockito.doReturn(1).when(mockedEvent).getEventNumber();
				ArrayList<Question> arrayPre =new ArrayList<Question>();
				Question q = (dataAccess).createQuestion(mockedEvent,queryText,betMinimum);
				q.setResult("2 a 0");
				arrayPre.add(q);
				Mockito.doReturn(arrayPre).when(mockedEvent).getQuestions();
				
				//invoke System Under Test (sut) 
				boolean result=sut.gertaeraEzabatu(mockedEvent);
				
				//assertFalse(result);
				assertFalse(result);
				//verify the results
				ArgumentCaptor<Event> eventCaptor = ArgumentCaptor.forClass(Event.class);
				Mockito.verify(dataAccess,Mockito.times(1)).gertaeraEzabatu(eventCaptor.capture());
				assertEquals(eventCaptor.getValue(),mockedEvent);
				

			   } 
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				assertTrue(true);
				} catch (QuestionAlreadyExist e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			   }
     
     @Test
     public void test7() {
			try {
				//define paramaters
				String queryText="proba galdera";
				Float betMinimum=new Float(2);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date oneDate=null;;
				try {
					oneDate = sdf.parse("05/11/2023");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				//configure Mock
				Mockito.doReturn(oneDate).when(mockedEvent).getEventDate();
				Mockito.doReturn(1).when(mockedEvent).getEventNumber();

				ArrayList<Question> arrayPre =new ArrayList<Question>();
				Question q = (dataAccess).createQuestion(mockedEvent,queryText,betMinimum);
				q.setResult("2 a 0");
				arrayPre.add(q);
				Mockito.doReturn(arrayPre).when(mockedEvent).getQuestions();
				
				//invoke System Under Test (sut) 
				boolean result=sut.gertaeraEzabatu(mockedEvent);
				
				//assertFalse(result);
				assertFalse(result);
				//verify the results
				ArgumentCaptor<Event> eventCaptor = ArgumentCaptor.forClass(Event.class);
				Mockito.verify(dataAccess,Mockito.times(1)).gertaeraEzabatu(eventCaptor.capture());
				assertEquals(eventCaptor.getValue(),mockedEvent);
				

			   } 
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				assertTrue(true);
				} catch (QuestionAlreadyExist e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			   }
}
