package ooad.server;

import java.util.ArrayList;
import java.util.Date;

import ooad.client.CampingService;
import ooad.client.CampingServiceAsync;
import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.views.OpretReservationView;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class CampingServiceImpl extends RemoteServiceServlet implements
		CampingService {

	ReservationsController rc = new ReservationsController();
	@Override
	public void createReservation(ReservationDTO res) throws DALException {
		rc.createReservation(res);
	}
	@Override
	public ArrayList<ReservationDTO> getReservationByDate(Date startDate, Date endDate) throws DALException {
	return	rc.getReservationByDate(startDate, endDate);
		
	}
	
	
	


	


}
