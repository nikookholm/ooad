package ooad.database;


public class ReservationImpl implements ReservationDAO {

	@Override
	public void createReservation(ReservationDTO reservation)
			throws DALException {
		Connector.doUpdate("INSERT INTO reservation (reservation_id, customer_id, spot_id, product_id, dog, adult, child startdate, enddate, status, power ) VALUES" + 
				"(" + reservation.getReservationID() + ", " + reservation.getCustomerID() + ", " + reservation.getSpotID() + ", " 
				+ reservation.getProductID() + ", " + reservation.getAmountAdult()+ "," + reservation.getAmountChild() + "," 
				+ reservation.getDog() + ", " + reservation.getStartDate() + "," + reservation.getEndDate() + "," 
				+ reservation.getStatus() + "," + reservation.getPower() + ")" 
				);
			
	}

	@Override
	public void deleteReservation(ReservationDTO reservation)
			throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReservation(ReservationDTO reservation)
			throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatus(int status) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ReservationDTO getReservation(int reservationID, int customerID)
			throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReservationDTO calcPower(int reservationID) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

}
