package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	//http://localhost:8090/room/create?room=1&name=Loki&name2=something
	@RequestMapping(value = "/getOne", method = RequestMethod.GET)
	public Room createMeeting(
		@RequestParam(value="room" , required = true) long room,
		@RequestParam(value="name" , required = true) String name
		,
		@RequestParam(value="name2" , required = true) String name2
			) {
		Room room1 = roomRepository.findById(room);
		room1.setRoomDescription(name);
		room1.setRoomDescription(name2);
		return room1;
	}
	
}


