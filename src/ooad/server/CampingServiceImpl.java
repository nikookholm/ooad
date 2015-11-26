package ooad.server;

import java.util.ArrayList;

import ooad.client.CampingService;
import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.shared.FieldVerifier;

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
	public ReservationDTO findReservation(int resID) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ReservationDTO> findReservations(String email)
			throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ReservationDTO> findReservations() throws DALException {
		return rc.findReservations();
	}

	@Override
	public void deleteReservation(ReservationDTO res) throws DALException {
		rc.deleteReservation(res);
		
	}


}
