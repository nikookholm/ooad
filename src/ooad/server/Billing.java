package ooad.server;

import ooad.database.ReservationDTO;

public class Billing {
	
	static boolean isCheckedIn;
	static double amount;
	
	static void checkIn(){
		isCheckedIn = true;
	}
	
	static double checkOut(ReservationDTO res){
		amount = 0;
		
		
		return amount;
	}
	
	static void receipt(ReservationDTO res){
		
	}
}
