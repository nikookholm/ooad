package ooad.database;

import java.util.ArrayList;

public interface ReservationDAO {
	static void createReservation(ReservationDTO reservation) throws DALException{};
	static void deleteReservation(ReservationDTO reservation) throws DALException{};
	static void updateReservation(ReservationDTO reservation) throws DALException{};
	static void setStatus(int status) throws DALException {};
	ReservationDTO getReservation(int reservationID) throws DALException;
	ArrayList<ReservationDTO> getReservations(int reservationID) throws DALException;
	ReservationDTO calcPower(int reservationID) throws DALException;
}
