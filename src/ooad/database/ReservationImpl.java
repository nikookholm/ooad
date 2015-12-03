package ooad.database;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ReservationImpl {

	public static void createReservation(ReservationDTO reservation) throws DALException {
		 Connector.doQuery("INSERT INTO reservations(customerID, spotID, startDate, endDate, adults, children, status, hasDog) VALUES" + 
				"(" + reservation.getCustomerID() + ", " + reservation.getSpotID() + ", " 
				+ reservation.getStartDate() + ", " + reservation.getEndDate() + ", " 
				+ reservation.getAmountAdult()+ ", " + reservation.getAmountChild() + ", " + reservation.getStatus() + ", "
				+ reservation.getDog() + ")" );	
	}
	
	
	public static ArrayList<ReservationDTO> getReservationByDates(Date startDateTime, Date endDateTime) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM reservations WHERE startDate>=" + startDateTime+ " AND endDate<=" + endDateTime);	
		ArrayList<ReservationDTO> list = new ArrayList<ReservationDTO>();
		
		try {
			while(rs.next()){

				list.add(new ReservationDTO(rs.getInt("customerID"), rs.getInt("spotID"), rs.getDate("startDate"), rs.getDate("endDate"),
							rs.getInt("adults"), rs.getInt("children"), rs.getString("status"), rs.getBoolean("hasDog")));
}
		} catch (Exception e) {
			throw new DALException(e+"Kunne ikke finde data");
		}
		
		return list;
		}


	public static void deleteReservation(ReservationDTO reservation)
			throws DALException {
		// TODO Auto-generated method stub
		
	}

	public static void updateReservation(ReservationDTO reservation)
			throws DALException {
		// TODO Auto-generated method stub
		
	}

	public static void setStatus(int status) throws DALException {
		// TODO Auto-generated method stub
		
	}

	public ReservationDTO getReservation(int reservationID)
			throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM reservations  WHERE reservationID =" + reservationID);
	    try 
	    {
	    	if (!rs.first()) throw new DALException("Reservationen med ID: " + reservationID + " findes ikke");
	    	return new ReservationDTO (rs.getInt("customerID"), rs.getInt("spotID"), rs.getDate("startDate"), rs.getDate("endDate"),
					rs.getInt("adults"), rs.getInt("children"), rs.getString("status"), rs.getBoolean("hasDog"));
	    }
	    
	    catch (SQLException e) {throw new DALException(e); }	
	}


}
