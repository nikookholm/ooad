package ooad.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

import code.database.IngredientDTO;
import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.database.ReservationImpl;
import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

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
	
	@Test
	public void testCreateReservation() throws DALException{
		ArrayList<ReservationDTO> reservationDTO = null;
		
		try{
			res = ReservationImpl.createReservation(1,1, new Date(04/12/2015), new Date(11/12/2015), 2, 2,"aktiv", true);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(res != null);
	}
}