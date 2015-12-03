package ooad.server;

import java.util.ArrayList;
import java.util.Date;




import com.google.gwt.user.client.ui.Widget;

import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.database.ReservationImpl;
import ooad.views.OpretReservationView;

public class ReservationsController {

	public void createReservation(ReservationDTO res) throws DALException {
		ReservationImpl.createReservation(res);
	}

	
	public Widget showCreateReservationView(Date startDate, Date endDate){
		ArrayList<ReservationDTO> resList = null;
		
		try {
			 resList = ReservationImpl.getReservationsByDates(startDate , endDate);
			
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new OpretReservationView(resList);


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
