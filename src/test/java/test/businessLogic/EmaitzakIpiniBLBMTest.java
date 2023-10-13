package test.businessLogic;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import dataAccess.DataAccess;
import domain.Quote;
import exceptions.EventNotFinished;

import static org.mockito.Mockito.*;

public class EmaitzakIpiniBLBMTest {
	private DataAccess dataAccess;
    private Quote quote;

    @Before
    public void setUp() {
    	dataAccess = new DataAccess();
        quote = mock(Quote.class);
    }
    
    @Test
    public void testEventFinished() throws EventNotFinished {
        when(quote.getQuestion().getEvent().getEventDate()).thenReturn(new Date(System.currentTimeMillis() - 100000));
        dataAccess.EmaitzakIpini(quote);
        assertNotNull(quote.getQuestion().getResult());
    }
    
    @Test(expected = EventNotFinished.class)
    public void testEventNotFinished() throws EventNotFinished {
        when(quote.getQuestion().getEvent().getEventDate()).thenReturn(new Date(System.currentTimeMillis() + 100000));
        dataAccess.EmaitzakIpini(quote);
    }

}
