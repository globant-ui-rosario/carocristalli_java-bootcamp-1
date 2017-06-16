package com.example.demo;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Iterable<Meeting> listMeeting() {
		return meetingRepository.findAll();
	}
	
	@RequestMapping(value = "/create", method =  RequestMethod.POST )
	public Meeting createMeeting(@RequestBody Meeting meeting){

			meetingRepository.save(meeting);
			
			return meeting;

	}
	
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void deleteMeeting(@RequestBody Meeting meeting) throws DataFormatException{
		meetingRepository.delete(meeting);
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void updateMeeting(@RequestBody Meeting meeting) throws DataFormatException{
		meetingRepository.save(meeting); 
	}
	
	
}