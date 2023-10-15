package test.dataAccess;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

import dataAccess.DataAccess;
import domain.Event;
import domain.Question;
import domain.Quote;
import exceptions.EventNotFinished;

public class EmaitzakIpiniDAWTest {
	
	@Test
	public void testEventFinished() throws EventNotFinished {
		DataAccess dataAccess = new DataAccess();
	    dataAccess.initializeDB();
	    
	    Quote quote = new Quote();
	    quote.setForecast("someForecastValue");

	    Event event = new Event();
	    event.setEventDate(new Date(System.currentTimeMillis() - 100000));

	    Question question = new Question();
	    question.setEvent(event);

	    quote.setQuestion(question);
        
        dataAccess.EmaitzakIpini(quote);

		
        
        assertNotNull(quote.getQuestion().getResult());
	}

	@Test(expected = EventNotFinished.class)
	public void testEventNotFinished() throws EventNotFinished {
		DataAccess dataAccess = new DataAccess();
	    dataAccess.initializeDB();
	    
	    Quote quote = new Quote();
	    quote.setForecast("someForecastValue");

	    Event event = new Event();
	    event.setEventDate(new Date(System.currentTimeMillis() + 100000));

	    Question question = new Question();
	    question.setEvent(event);

	    quote.setQuestion(question);
        
        dataAccess.EmaitzakIpini(quote);
	}
}
