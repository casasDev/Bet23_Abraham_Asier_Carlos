package test.dataAccess;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

import domain.Event;
import domain.Question;
import domain.Quote;
import exceptions.EventNotFinished;

public class EmaitzakIpiniDABTest {
	
	@Test
    public void testValidInput() throws EventNotFinished {
		dataAccess.DataAccess dataAccess = new dataAccess.DataAccess();

        Quote quote = new Quote();
        Question question = new Question();
        Event event = new Event();

        event.setEventDate(new Date(System.currentTimeMillis() - 100000));
        question.setEvent(event);
        quote.setQuestion(question);

        dataAccess.EmaitzakIpini(quote);

        assertNotNull("El resultado no debería ser nulo", question.getResult());
    }

    @Test(expected = EventNotFinished.class)
    public void testInvalidInput() throws EventNotFinished {
    	dataAccess.DataAccess dataAccess = new dataAccess.DataAccess();
		
		Quote quote = new Quote();
        Question question = new Question();
        Event event = new Event();
        
        event.setEventDate(new Date(System.currentTimeMillis() + 100000));
        question.setEvent(event);
        quote.setQuestion(question);
        
        dataAccess.EmaitzakIpini(quote);
    }
}
