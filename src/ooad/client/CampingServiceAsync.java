package ooad.client;

import java.util.ArrayList;

import ooad.database.DALException;
import ooad.database.ReservationDTO;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CampingServiceAsync {
	
	void createReservation(ReservationDTO res, AsyncCallback<Void> callback) throws DALException;
	void findReservation(int resID, AsyncCallback<ReservationDTO> callback) throws DALException;
	void findReservations(String email, AsyncCallback<ArrayList<ReservationDTO>> callback) throws DALException;
	
	void deleteReservation(ReservationDTO res, AsyncCallback<Void> callback) throws DALException;
}
