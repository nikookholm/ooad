package ooad.server;

import java.util.ArrayList;
import java.util.Date;






import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.database.ReservationImpl;


public class ReservationsController {

	public void createReservation(ReservationDTO res) throws DALException {
		ReservationImpl.createReservation(res);
	}

	

	
	public ArrayList<ReservationDTO> getReservationByDate(Date startDate, Date endDate) throws DALException{
		return ReservationImpl.getReservationsByDates(startDate, endDate);
	}

}
