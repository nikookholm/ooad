package ooad.database;

public interface ReservationDAO {
	void createReservation(ReservationDTO reservation) throws DALException;
	void opdaterReservation(ReservationDTO reservation) throws DALException;
	void setStatus(int status) throws DALException;
	ReservationDTO getReservation(int reservationID, int kundeID) throws DALException;
	ReservationDTO regnStrømforbrug(int reservationID) throws DALException	;

}
