package ooad.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationImpl implements ReservationDAO {

	public static void createReservation(ReservationDTO reservation)
			throws DALException {
		Connector.doQuery("INSERT INTO reservation (reservation_id, customer_id, spot_id, product_id, dog, adult, child, startdate, enddate, status, power, paid) VALUES" + 
				"(" + reservation.getReservationID() + ", " + reservation.getCustomerID() + ", " + reservation.getSpotID() + ", " 
				+ reservation.getProductID() + ", " + reservation.getAmountAdult()+ "," + reservation.getAmountChild() + "," 
				+ reservation.getDog() + ", " + reservation.getStartDate() + "," + reservation.getEndDate() + "," 
				+ reservation.getStatus() + "," + reservation.getPower() + "," +reservation.getPaid() + ")" 
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
		
		ResultSet rs = Connector.doQuery("SELECT * FROM reservation  WHERE reservation_id =" + reservationID);
	    try 
	    {
	    	if (!rs.first()) throw new DALException("Reservationen med ID: " + reservationID + " findes ikke");
	    	return new ReservationDTO (rs.getInt("reservation_id"), rs.getInt("customer_id"), rs.getInt("spot_id"), 
	    			rs.getInt("product_id"), rs.getBoolean("dog"), rs.getInt("adult"), rs.getInt("child"), 
	    			rs.getString("startdate"), rs.getString("enddate"), rs.getInt("status"), rs.getInt("power"), rs.getBoolean("paid"));
	    }
	    
	    catch (SQLException e) {throw new DALException(e); }	
	}
	

	@Override
	public ArrayList<ReservationDTO> getReservations(int reservationID)
			throws DALException {
		
		ArrayList<ReservationDTO> list = new ArrayList<ReservationDTO>();
		ResultSet rs = Connector.doQuery("SELECT * FROM reservation WHERE reservation_id= " + reservationID);
		
		try
		{
			while (rs.next()) 
			{
				list.add(new ReservationDTO(rs.getInt("reservation_id"), rs.getInt("customer_id"), rs.getInt("spot_id"), 
						rs.getInt("product_id"), rs.getBoolean("dog"), rs.getInt("adult"), rs.getInt("child"), 
						rs.getString("startdate"), rs.getString("enddate"), rs.getInt("status"), rs.getInt("power"), rs.getBoolean("paid")));
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
