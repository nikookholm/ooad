package ooad.test;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.junit.Assert;

import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.database.ReservationImpl;

public class TestReservations {
		
	@SuppressWarnings("deprecation")
	@Test
	public void testGetReservationsByDates()
	{
		
		Date startDate = new Date(2015, 2, 3);
		Date endDate   = new Date(2016, 2, 3);
		
		ArrayList<ReservationDTO> res = null;
		
		
		try {
			res = ReservationImpl.getReservationsByDates(startDate, endDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Assert.assertTrue((res != null));
	}
	
	@Test
	public void testGetReservation()
	{
		ReservationDTO res = null;
		
		try {
			res = ReservationImpl.getReservation(1);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue((res != null));
	
	}
}