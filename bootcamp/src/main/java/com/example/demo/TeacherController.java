package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	private final TeacherRepository teacherRepository;

	@Autowired
	TeacherController(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;

	}

	@RequestMapping(value = "/get",method = RequestMethod.GET)
	Iterable<Teacher> getTeachers() {
		Iterable<Teacher> a = teacherRepository.findAll();
		return teacherRepository.findAll();
}
	
	
	 @RequestMapping(method = RequestMethod.POST, value = "/create")
	    public void createStudent(@RequestBody Teacher teacher){
		 teacherRepository.save(teacher);
	}
	 
		
	
	
}


