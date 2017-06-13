package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {

	private final RoomRepository roomRepository;

	@Autowired
	RoomController(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;

	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	Iterable<Room> roomList() {
		return roomRepository.findAll();
}
	
}


