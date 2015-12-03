package ooad.client;

import java.util.ArrayList;
import java.util.Date;

import ooad.database.DALException;
import ooad.database.ReservationDTO;
import ooad.views.OpretReservationView;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface CampingServiceAsync {
	
	void createReservation(ReservationDTO res, AsyncCallback<Void> callback) throws DALException;
	void getReservationByDate(Date startDate, Date endDate, AsyncCallback<ArrayList<ReservationDTO>> callback);
    
}
