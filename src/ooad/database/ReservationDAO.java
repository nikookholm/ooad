package ooad.database;

import java.util.ArrayList;

public interface ReservationDAO {
	static void createReservation(ReservationDTO reservation) throws DALException{};
	static void deleteReservation(ReservationDTO reservation) throws DALException{};
	static void updateReservation(ReservationDTO reservation) throws DALException{};
	static void setStatus(int status) throws DALException {};
	static ReservationDTO getReservation(int reservationID) throws DALException {
		return new ReservationDTO();
	}
	static ArrayList<ReservationDTO> getReservations(String email) throws DALException {
		return new ArrayList<ReservationDTO>();
	}
	ReservationDTO calcPower(int reservationID) throws DALException;
}
