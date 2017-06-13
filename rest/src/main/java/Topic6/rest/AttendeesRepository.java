package Topic6.rest;

import org.springframework.data.repository.CrudRepository;


public interface AttendeesRepository extends CrudRepository<Attendees, Long> {
	Attendees findById(long id);
}


