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
			Date startDateTime 	= new Date(04/12/2015);
			Date endDateTime	= new Date(11/12/2015);
		
			ArrayList<ReservationDTO> list = ReservationImpl.getReservationsByDates(startDateTime, endDateTime);
			int currentHighestID  = list.get(list.size()-1).getReservationID();
			
			int expected = ReservationImpl.getReservationsByDates(startDateTime, endDateTime).size()+1;
			ReservationImpl.createReservation(new ReservationDTO(currentHighestID+1, ));
			int actual =  ReservationImpl.getReservationsByDates(startDateTime, endDateTime).size();
			
			assertEquals(expected, actual);
		}
	}
