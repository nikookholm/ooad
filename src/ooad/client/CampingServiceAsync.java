package ooad.client;

import ooad.database.ReservationDTO;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CampingServiceAsync {
	
//	void greetServer(String input, AsyncCallback<String> callback)
//			throws IllegalArgumentException;
	void opretReservation(ReservationDTO res, AsyncCallback<Void> callback);
}
