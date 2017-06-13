package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AttendeesRepository extends JpaRepository<Attendees, Long> {
	Attendees findById(long attendee);
}


