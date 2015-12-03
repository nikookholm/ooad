package ooad.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;



public class ReservationImpl {
	
	private static void Connect()
	{
		try {
			new Connector();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void createReservation(ReservationDTO reservation) throws DALException {
		
		Connect();
		
		 Connector.doQuery("INSERT INTO reservations(customerID, spotID, startDate, endDate, adults, children, status, hasDog) VALUES" + 
				"(" + reservation.getCustomerID() + ", " + reservation.getSpotID() + ", " 
				+ reservation.getStartDate() + ", " + reservation.getEndDate() + ", " 
				+ reservation.getAmountAdult()+ ", " + reservation.getAmountChild() + ", " + reservation.getStatus() + ", "
				+ reservation.getDog() + ")" );	
	}
	
	
	public static ArrayList<ReservationDTO> getReservationsByDates(Date startDateTime, Date endDateTime) throws DALException {

		Connect();
		
		ResultSet rs = Connector.doQuery("SELECT * FROM reservations WHERE startDate>='" + startDateTime+ "' AND endDate<='" + endDateTime + "'");	
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



	public static void setStatus(int status) throws DALException {
		// TODO Auto-generated method stub
		
	}

	public static ReservationDTO getReservation(int reservationID)
			throws DALException {

		Connect();
		
		ResultSet rs = Connector.doQuery("SELECT * FROM reservations WHERE reservationID='" + reservationID + "'");
	    try 
	    {
	    	if (!rs.first()) throw new DALException("Reservationen med ID: " + reservationID + " findes ikke");
	    	return new ReservationDTO (rs.getInt("customerID"), rs.getInt("spotID"), rs.getDate("startDate"), rs.getDate("endDate"),
					rs.getInt("adults"), rs.getInt("children"), rs.getString("status"), rs.getBoolean("hasDog"));
	    }
	    
	    catch (SQLException e) {throw new DALException(e); }
	}


}
