package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {
	Meeting findById(long id);

}


