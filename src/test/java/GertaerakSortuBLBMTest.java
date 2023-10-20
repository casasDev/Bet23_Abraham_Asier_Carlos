import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import dataAccess.DataAccess;
import exceptions.EventFinished;

public class GertaerakSortuBLBMTest {
	//En este caso este métdo no tiene nada que simular, ya que lo que comprueba es un dato de los parámetros y no uno de la BD.
	DataAccess da = Mockito.mock(DataAccess.class);
	BLFacade bl = new BLFacadeImplementation(da);
	@Test
	public void test1() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			try {
				bl.gertaerakSortu(null,sdf.parse("14/10/2023"),null);
				fail("No deberia haber seguido");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("La fecha tiene que tener el formato dd/MM/yyyy");
			}
		} catch (EventFinished e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
	}
	@Test
	public void test2() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
				bl.gertaerakSortu(null,new Date(),null);
				assertTrue(true);
		} catch (EventFinished e) {
			// TODO Auto-generated catch block
			fail("La fecha debería ser anterior o igual la actual");
		}
	}
	
}
