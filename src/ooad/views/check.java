package ooad.views;

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
	
}
