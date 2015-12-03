package ooad.shared;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class FieldVerifier {

	public static boolean isNameValid(String name) {
		if ((!FieldVerifier.isLettersOnly(name)) && (name== null)) {
			return false;
		}
		return name.length() > 1;
	}

	public static boolean isIDValid(String ID) {	
		if(ID.length() == 0){
			return false;
		}
		for(char c : ID.toCharArray()){
			if(!Character.isDigit(c)){
				return false;
			}
		}
		return true;
	}

	public static boolean isStatusValid(String str)
	{
		int i;
		try{
			i = Integer.parseInt(str);
		}catch(NumberFormatException e){
			return false;
		}

		if(0<=i && i<=2){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isLettersOnly(String str){
		char[] chars = str.toCharArray();
		for(char c : chars){
			if(!Character.isLetter(c)){
				return false;
			}
		}
		return true;
	}

	public boolean isValidEmailAddress(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(email);
		return ((!email.isEmpty()) && (email!=null) && (!m.matches()));
	}


	public boolean isValidAmount(String amount){
		int i;

		if(amount == null) return false;

		try{
			i = Integer.parseInt(amount);
		}catch(NumberFormatException e){
			return false;
		}

		if(1<=i && i<=10){
			return true;
		}else{
			return false;
		}
	}
}