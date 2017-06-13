package Topic6.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Start {
	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);

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
