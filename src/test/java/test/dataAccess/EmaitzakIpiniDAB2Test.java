package test.dataAccess;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

import dataAccess.DataAccess;
import dataAccess.DataAccessEmaitzakIpini;
import domain.Event;
import domain.Question;
import domain.Quote;
import exceptions.EventNotFinished;

public class EmaitzakIpiniDAB2Test {
	
	@Test
    public void testValidInput() throws EventNotFinished {
		DataAccessEmaitzakIpini dataAccess = new DataAccessEmaitzakIpini();
	    dataAccess.initializeDB();
	    
	    Quote quote = new Quote();
	    quote.setForecast("someForecastValue");

	    Event event = new Event();
	    event.setEventDate(new Date(System.currentTimeMillis() - 100000));

	    Question question = new Question();
	    question.setEvent(event);

	    quote.setQuestion(question);
	    
	    dataAccess.EmaitzakIpini(quote);

	    //assertNotNull("El resultado no debería ser nulo", question.getResult());
	}

    @Test(expected = EventNotFinished.class)
    public void testInvalidInput() throws EventNotFinished {
    	DataAccessEmaitzakIpini dataAccess = new DataAccessEmaitzakIpini();
	    dataAccess.initializeDB();
	    
	    Quote quote = new Quote();
	    quote.setForecast("someForecastValue");

	    Event event = new Event();
	    event.setEventDate(new Date(System.currentTimeMillis() + 100000));

	    Question question = new Question();
	    question.setEvent(event);

	    quote.setQuestion(question);
        
        //dataAccess.EmaitzakIpini(quote);
    }
}
