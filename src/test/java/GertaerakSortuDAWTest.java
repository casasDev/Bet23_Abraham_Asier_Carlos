import static org.junit.Assert.assertEquals;   
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

import dataAccess.DataAccess;
import domain.Event;
import test.dataAccess.TestDataAccess;
 

public class GertaerakSortuDAWTest {
	private static DataAccess da = new DataAccess();
	private static TestDataAccess testda = new TestDataAccess();
	private Event ev;
	@Test
	public void test1() {
		testda.open();
		testda.addSport("sport1");
		testda.close();
		assertFalse(da.gertaerakSortu("", new Date(),"sport1345"));
		testda.open();
		testda.removeSport("sport1");
		testda.close();
	}
	@Test
	public void test2() {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = null;
		try {
			fecha = date.parse("29/04/2002");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("Introduce una buena fecha");
		} 
		ev = new Event("ath-mrd",fecha,null,null);
		testda.open();
		testda.addSport("sport12");
		testda.close();
		testda.open();
		testda.addEventWithQuestion(ev.getDescription(), ev.getEventDate(), null, 0);
		testda.close();
		assertTrue(da.gertaerakSortu("holi-xxxx", fecha, "sport12"));
		testda.open();
		testda.removeSport("sport12");
		testda.close();
	}
	@Test
	public void test3() {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = null;
		try {
			fecha = date.parse("29/04/2002");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("Introduce una buena fecha");
		} 
		ev = new Event("ath-mrd",fecha,null,null);
		testda.open();
		testda.addSport("sport12");
		testda.close();
		testda.open();
		testda.addEventWithQuestion(ev.getDescription(), ev.getEventDate(), null, 0);
		testda.close();
		assertFalse(da.gertaerakSortu("ath-mrd", fecha, "sport12"));
		testda.open();
		testda.removeSport("sport12");
		testda.close();
	}
}
