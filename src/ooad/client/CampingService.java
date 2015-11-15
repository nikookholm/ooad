package ooad.client;

import ooad.database.DALException;
import ooad.database.ReservationDTO;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface CampingService extends RemoteService {
//	String greetServer(String name) throws IllegalArgumentException;
	void opretReservation(ReservationDTO res) throws DALException;
}
