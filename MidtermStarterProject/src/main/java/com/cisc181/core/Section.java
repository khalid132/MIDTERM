package com.cisc181.core;

import java.util.UUID;

public class Section {
	public UUID CourceID; 
	public UUID SemesterID; 
	public UUID SectionID; 
	public int RoomID; 
	
	public UUID getCourceID() {
		return CourceID;
	}
	public void setCourceID(UUID courceID) {
		CourceID = courceID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	
}
