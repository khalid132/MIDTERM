package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	//@Before 
	
	ArrayList<Staff> StaffList = new ArrayList<Staff>();
	public Staff Examble1;
	public Staff Examble2;
	public Staff Examble3;
	public Staff Examble4;
	public Staff Examble5;
	public Staff InvalidExamble1;
	public void SetUp(){
		Staff examble1 = new Staff("Mohammad", "Mamdoh", "baksh", new Date( 75, 1, 6), "Newark",
				"(405)-666-777", "plplpl@hotmil.com", "8 to 12", 2, 2500, new Date(110,5,1), eTitle.TA);
		Staff examble2 = new Staff("Sami", "Ahmad", "Alyami", new Date (65,9,10), "London",
				"(506)-444-2222", "sami@hotmail.com", "10 to 5", 1, 6000, new Date(105,4,30), eTitle.PROFESSOR);
		Staff examble3 = new Staff("Adel", "Mohamamd", "Aldibaji", new Date(81,6,20), "London",
				"(660)-555-4444", "adel@hotmil.com", "8 to 5", 3, 2000, new Date(107,5,18), eTitle.STAFF);
		Staff examble4 = new Staff("Mohammad", "Omer", "Basha", new Date(74,3,15), "Wales",
				"(772)-333-8888", "mosbash@hotmil.com", "M T F 8 to 3", 1, 7500, new Date(100,4,30), eTitle.PROFESSOR);
		Staff examble5 = new Staff("Khalid", "Saeed", "Alsarhan", new Date(80,2,1), "Birmingham",
				"(444)-555-7777", "ksa@hotmil.com", "Tu Th 10 to 5", 1, 8000, new Date(99,2,6), eTitle.PROFESSOR);
		Staff invalidExamble1 = new Staff("Mahood", "Abdurlraham", "Almzooe", new Date(0,8,9), "Bristol",
				"31233455677", "mhmood@hotmil.com", " 9 to 5", 3, 1200, new Date(103,6,3), eTitle.TA);
		Examble1 = examble1;
		Examble2 = examble2;
		Examble3 = examble3;
		Examble4 = examble4;
		Examble5 = examble5;
		InvalidExamble1 = invalidExamble1;
		
		ArrayList<Staff> Staffs = new ArrayList(Arrays.asList(Examble1, Examble2, Examble3, Examble4, Examble5));

		}

	@Test
	public void Staff_Test() {
		assertEquals((Examble1.getSalary() + Examble2.getSalary() + Examble3.getSalary() + Examble4.getSalary() + Examble5.getSalary()) / 5,5200);
	}
	@Test(expected = PersonException.class)
	public void testInvalidDOB() throws PersonException{
		Staff Example = new Staff(eTitle.PROFESSOR);
		Calendar InvaliedDOB = Calendar.getInstance();
		InvaliedDOB.set(Calendar.YEAR, 1900);
		InvaliedDOB.set(Calendar.MONTH, 0);
		InvaliedDOB.set(Calendar.DAY_OF_MONTH, 1);
		Date DOB = InvaliedDOB.getTime();  
		Example.setDOB(DOB);
		Example.getDOB();
	}
		
	@Test(expected = PersonException.class)
	public void testInvalidPhoneNumber() throws PersonException {
		String invalid_num = "123456";
		Staff Example = new Staff(eTitle.TA);
		Example.setPhone(invalid_num);
		Example.getPhone();
				
	}

}
