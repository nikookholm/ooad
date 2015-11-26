package ooad.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationImpl implements ReservationDAO {

	public static void createReservation(ReservationDTO reservation)
			throws DALException {
		Connector.doQuery("INSERT INTO reservations(reservationID, customerID, spotID, startdate, enddate, adult, child, dog, status, power, paid) VALUES" + 
				"(" + reservation.getReservationID() + ", " + reservation.getCustomerID() + ", " + reservation.getSpotID() + ", " 
				+ reservation.getStartDate() + "," + reservation.getEndDate() + "," 
				+ reservation.getAmountAdult()+ "," + reservation.getAmountChild() + "," + reservation.getDog() + ", " 
				+ reservation.getStatus() + "," + reservation.getPower() + ")" 
				);
			
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

	@Override
	public ReservationDTO getReservation(int reservationID)
			throws DALException {
		
		ResultSet rs = Connector.doQuery("SELECT * FROM reservations  WHERE reservationID =" + reservationID);
	    try 
	    {
	    	if (!rs.first()) throw new DALException("Reservationen med ID: " + reservationID + " findes ikke");
	    	return new ReservationDTO (rs.getInt("reservationID"), rs.getInt("customerID"), rs.getInt("spotID"), rs.getString("startdate"), 
					rs.getString("enddate"), rs.getInt("adults"), rs.getInt("children"), rs.getBoolean("dog"), rs.getInt("status"), rs.getInt("power"));
	    }
	    
	    catch (SQLException e) {throw new DALException(e); }	
	}
	

	@Override
	public ArrayList<ReservationDTO> getReservations(int reservationID)
			throws DALException {
		
		ArrayList<ReservationDTO> list = new ArrayList<ReservationDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM reservations WHERE reservationID= " + reservationID);
		
		try
		{
			while (rs.next()) 
			{
				list.add(new ReservationDTO(rs.getInt("reservationID"), rs.getInt("customerID"), rs.getInt("spotID"), rs.getString("startdate"), 
						rs.getString("enddate"), rs.getInt("adults"), rs.getInt("children"), rs.getBoolean("dog"), rs.getInt("status"), rs.getInt("power")));
			}
		}
		
		catch (SQLException e) { throw new DALException(e); }
		return list;
	}

	@Override
	public ReservationDTO calcPower(int reservationID)
			throws ooad.database.DALException {
		// TODO Auto-generated method stub
		return null;
	}

}
