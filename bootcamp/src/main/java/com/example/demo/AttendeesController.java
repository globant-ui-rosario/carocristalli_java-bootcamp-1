package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendee")
public class AttendeesController {

	private final AttendeesRepository attendeesRepository;

	@Autowired
	AttendeesController(AttendeesRepository attendeeRepository) {
		this.attendeesRepository = attendeeRepository;

	}

	@RequestMapping(value = "/get",method = RequestMethod.GET)
	List<Attendees> attendeesList() {
		
		return attendeesRepository.findAll();
}
	@RequestMapping("/hola")
    String home() {
        return "Hello World!";
    }
}


