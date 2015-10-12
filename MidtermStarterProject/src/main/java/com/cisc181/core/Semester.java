package com.cisc181.core;

import java.util.UUID;

import sun.util.calendar.BaseCalendar.Date;

public class Semester {
	public UUID SemesterID;
	public Date StartDate; 
	public Date EndDate; 
	
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	
	

}
