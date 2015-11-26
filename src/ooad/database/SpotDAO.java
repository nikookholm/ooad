package ooad.database;

import java.util.ArrayList;

public interface SpotDAO {

	SpotDTO getSpot(int SpotID) throws DALException;
	ArrayList<SpotDTO> getSpots() throws DALException;
	
}
