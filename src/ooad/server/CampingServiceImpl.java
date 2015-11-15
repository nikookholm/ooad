package ooad.server;

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

	@Override
	public void opretReservation(ReservationDTO res) throws DALException {
		
		
	}

//	public String greetServer(String input) throws IllegalArgumentException {
		
}
