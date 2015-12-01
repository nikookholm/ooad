package ooad.server;

import java.util.ArrayList;

import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.database.ReservationImpl;

public class ReservationsController {

	public void createReservation(ReservationDTO res) throws DALException {
		ReservationImpl.createReservation(res);
	}
	
//	public ReservationDTO findReservation(int resID) throws DALException{
//		return ReservationDAO.getReservation(resID);
//	}
//	public ArrayList<ReservationDTO> findReservations(String email)throws DALException{
//		return ReservationImpl.getReservations(email);
//	}

//	public void deleteReservation(ReservationDTO res) throws DALException{
//		ReservationDAO.deleteReservation(res);
//	}
}
