package ooad.database;

public interface ReservationDAO {
	void createReservation(ReservationDTO reservation) throws DALException;
	void deleteReservation(ReservationDTO reservation) throws DALException;
	void updateReservation(ReservationDTO reservation) throws DALException;
	void setStatus(int status) throws DALException;
	ReservationDTO getReservation(int reservationID, int customerID) throws DALException;
	ReservationDTO calcPower(int reservationID) throws DALException	;

}
