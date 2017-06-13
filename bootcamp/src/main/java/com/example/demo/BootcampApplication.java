package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RequestMapping("/prueba")
public class BootcampApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner attendee(AttendeesRepository attendeeRepository) {
		return (arg) -> {
			attendeeRepository.save(new Attendees("Carolina", "Cristalli"));
			attendeeRepository.save(new Attendees("Milagros", "Galassi"));
		};
	}

	@Bean
	public CommandLineRunner room(RoomRepository roomRepository) {
		return (arg) -> {
			roomRepository.save(new Room("Milán"));
			roomRepository.save(new Room("Thor"));
		};

}
	
	
}
