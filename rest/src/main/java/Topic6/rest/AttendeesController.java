package Topic6.rest;

import java.util.ArrayList;

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

	@RequestMapping(method = RequestMethod.GET)
	ArrayList<String> attendeesList() {
		ArrayList<String> list = new ArrayList<>();
		for (Attendees attendee : attendeesRepository.findAll()) {
			list.add(attendee.toString());

		}

		return list;
}
}


