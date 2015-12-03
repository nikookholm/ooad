package ooad.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import ooad.database.Connector;
import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.database.ReservationImpl;

public class TestCreateReservation {
		
	@Before
	public void Connect()
	{
		try {
			new Connector();
		} catch (Exception e) {	}
	}
	
	@Test
	public void testCreateReservation() throws DALException {
		
		
	 int startSize = ReservationImpl.getReservationsByDates(new Date(5/10/2016),new Date(10/10/2016)).size();

		
		ReservationImpl.createReservation(new ReservationDTO(8, 20, new Date(5/10/2016),new Date(10/10/2016), 2, 1, "Aktiv", false));
		
		int slutSize = ReservationImpl.getReservationsByDates(new Date(5/10/2016), new Date(10/10/2016)).size();
		
		assertNotEquals(startSize, slutSize);

		}
		
	}