package ooad.views;

import java_cup.reduce_action;

public class check {
	
	public static boolean isValidName(String name) {
		if ((!check.isLettersOnly(name)) && (name == null)) {
			return false;
		}
		return name.length() > 1 && name.length() <= 20;
	}
	
	//Generelt check til at afgøre om String-inputs kun er bogstaver.
		public static boolean isLettersOnly(String str){
			char[] chars = str.toCharArray();
			for(char c : chars){
				if(!Character.isLetter(c)){
					return false;
				}
			}
			return true;
		}
		
		// råvare navn skal være mellem 2-20 karakterer
		public static boolean kundeName(String kundeNavn){
			if((!check.isLettersOnly(kundeNavn)) && kundeNavn.equals(null)){
				return false;
			}
			else{
				return kundeNavn.length() >= 2;
			}
		}
		
		
//		emailBox skal have @ og .com/dk/af/.....
		public static boolean emailsSnabelAandDot( String emailCkeck){
			
			if(emailCkeck == null) return false;
            
            String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(?:[a-zA-Z]{2,6})$";
            
            boolean valid = false;
            
            if(emailCkeck.getClass().toString().equals(String.class.toString())) {
                    valid = ((String)emailCkeck).matches(emailPattern);
            } else {
                    valid = ((String)emailCkeck).toString().matches(emailPattern);
            }

            return valid;

		}
	
}
