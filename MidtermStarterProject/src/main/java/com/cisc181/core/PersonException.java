package com.cisc181.core;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonException extends Exception{
	Person person; 
	public PersonException(){
		this.person = new Person() {};
	}
	public boolean AgeEvaluation() {
	Calendar today = Calendar.getInstance();
	Calendar birthDate = Calendar.getInstance();
	birthDate.setTime(this.person.getDOB());
	if ((birthDate.get(Calendar.YEAR)- today.get(Calendar.YEAR)) >= 100) {
		return false;
	}
	return true;
}
	public boolean EvaluatePhone(){
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		 
		Pattern pattern = Pattern.compile(regex);{
		    Matcher matcher = pattern.matcher( this.person.getPhone()); 
		    if(matcher.matches())
		    {
		       return true; 
		    
		}
	}
		return false;
	}
}