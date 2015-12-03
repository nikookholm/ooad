package ooad.client;

import java.util.ArrayList;
import java.util.Date;

import ooad.database.DALException;
import ooad.database.ReservationDTO;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface CampingService extends RemoteService {


	void createReservation(ReservationDTO res) throws DALException;
	ReservationDTO findReservation(int resID) throws DALException;
	ArrayList<ReservationDTO> findReservations(String email) throws DALException;
    ArrayList<ReservationDTO> findReservations(Date start, Date end);
	void deleteReservation(ReservationDTO res) throws DALException;
}
