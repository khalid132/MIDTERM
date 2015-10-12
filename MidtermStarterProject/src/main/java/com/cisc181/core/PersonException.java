package com.cisc181.core;

public class PersonException extends Exception{
	Person person; 
	public PersonException(){
		this.person = new Person() {}; 
	}
}
