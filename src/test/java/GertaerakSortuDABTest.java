import static org.junit.Assert.*; 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import dataAccess.DataAccess;
import domain.Event;
import test.dataAccess.TestDataAccess;

public class GertaerakSortuDABTest {
	private static TestDataAccess testda = new TestDataAccess();
	private static DataAccess da = new DataAccess();
	private Event ev;

	@Test
	public void test1() {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = null;
		try {
			fecha = date.parse("29/04/2002");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			fail("Introduce una buena fecha");
		}
		ev = new Event("ath-mrd", fecha, null, null);
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
	public void test2() {
		try {
			SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
			Date fecha = null;
			try {
				fecha = date.parse("29/04/2002");
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				fail("Introduce una buena fecha");
			}
			ev = new Event("ath-mrd", fecha, null, null);
			testda.open();
			testda.addSport("sport12");
			testda.close();
			testda.open();
			testda.addEventWithQuestion(ev.getDescription(), ev.getEventDate(), null, 0);
			testda.close();
			da.gertaerakSortu("holixxxx", fecha, "sport12");
			testda.open();
			testda.removeSport("sport12");
			testda.close();
		} catch(ArrayIndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	@Test
	public void test3() {
		Date fecha = null;
		ev = new Event("ath-mrd", fecha, null, null);
		testda.open();
		testda.addEventWithQuestion(ev.getDescription(), ev.getEventDate(), null, 0);
		testda.close();
		assertFalse(da.gertaerakSortu("holi-xxxx", fecha, "sport12"));
	}
	@Test
	public void test4() {
		assertFalse(da.gertaerakSortu(null,null,""));
	}
}
