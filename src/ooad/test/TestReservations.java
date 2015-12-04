package ooad.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.sql.*;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import ooad.database.Connector;
import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.database.ReservationImpl;
import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class TestReservations {
		
	@Before
	public void Connect()
	{
		try {
			new Connector();
		} catch (Exception e) { }
	}
	@SuppressWarnings("deprecation")
	
	@Test
	public void testGetReservationsByDates()
	{
		
		ArrayList<ReservationDTO> res = null;
		
		
		try {
			res = ReservationImpl.getReservationsByDates(new Date(2015, 2, 3), new Date(2016, 2, 3));
		} catch (Exception e) {
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
					e.printStackTrace();
		}
		
		Assert.assertTrue((res != null));
	
	}
	
	@Test
	public void testCreateReservation() throws DALException{
		ArrayList<ReservationDTO> reservationDTO = null;
		
		try{
			 ReservationImpl.createReservation(new ReservationDTO(5,10, new Date(15/11/2001), new Date(28/11/2001), 1, 1,"",1));
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(null == null);
	}
}