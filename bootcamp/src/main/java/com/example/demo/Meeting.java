package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Meeting {
	
	@Id
    @GeneratedValue
    private int id;
	
	@OneToMany
    private List<Attendees> attendees;
	@OneToOne
	private Room room;
	private String timeSlot;
	
public Meeting() {
	}
	
	public Meeting(List<Attendees> attendees, Room room, String timeSlot) {
		
		this.attendees = attendees;
		this.room = room;
		this.timeSlot = timeSlot;
	}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public List<Attendees> getAttendees() {
		return attendees;
	}
	public void setAttendees(List<Attendees> attendees) {
		this.attendees = attendees;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	@Override
	public String toString() {
		return "Meeting [id=" + id + ", attendees=" + attendees + ", room=" + room + ", timeSlot=" + timeSlot + "]";
	}
	
	
	
	


}
