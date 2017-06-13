package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/meeting")
public class MeetingController {
	
	private final MeetingRepository meetingRepository;
	AttendeesRepository attendeeRepository ;
	RoomRepository roomRepository ;

	@Autowired
	MeetingController(MeetingRepository meetingRepository,
			AttendeesRepository attendeeRepository ,
	RoomRepository roomRepository ) {
		this.meetingRepository = meetingRepository;
		this.attendeeRepository = attendeeRepository;
		this.roomRepository = roomRepository;
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Meeting> listMeeting() {
		return meetingRepository.findAll();
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createMeeting(
		@RequestParam(value="room" , required = true) long room,
		@RequestParam(value="attendee" , required = true) long attendee,
		@RequestParam(value="timeSlot", required = true) String timeSlot
			) {
		List<Attendees> list = new ArrayList<>();
		list.add(attendeeRepository.findById(attendee));
		
		meetingRepository.save(new Meeting(list,roomRepository.findById(room),  timeSlot));

	}
	
	@RequestMapping(value = "/delete/{meetingId}", method = RequestMethod.DELETE)
	public void deleteMeeting(@PathVariable long meetingId) throws DataFormatException{
		meetingRepository.delete(meetingRepository.findById(meetingId));
		
	}
	
	@RequestMapping(value = "/update/{meetingId}", method = RequestMethod.PUT)
	public void updateMeeting(@PathVariable long meetingId, @RequestBody Meeting meeting) {
		meetingRepository.save(meeting); 
	}
	
	@RequestMapping(value ="/update2/{id}", method = RequestMethod.PUT  )
	 public @ResponseBody
	 void update2Meeting( @PathVariable("id") int id, @RequestBody Meeting meeting) {
	  meetingRepository.save(meeting);
	 }
}