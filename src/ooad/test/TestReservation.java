package ooad.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ooad.database.*;

public class TestReservation {

	ReservationImpl rsI 	= new ReservationImpl();
	ReservationDTO rsDTO 	= new ReservationDTO(1, 1, 1, "01-01-2016", "04-01-2016", 2, 2, true, 0, 0);
	
	@Before
	public void connect()
	{
		try {
			new Connector();
		} catch (Exception e) {
		
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void createReservation() throws DALException{
		ReservationDTO actual = rsI.createReservation(rsDTO); 
		ReservationDTO expected =  rsI.getReservation(1);
		
		

		assertEquals(expected, actual);
	}
}
