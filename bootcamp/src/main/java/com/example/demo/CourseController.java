package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

	private final CourseRepository courseRepository;

	@Autowired
	CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;

	}

	@RequestMapping(value = "/get",method = RequestMethod.GET, produces = "application/json")
	Iterable<Course> getCourses() {
		Iterable<Course> a = courseRepository.findAll();
		return courseRepository.findAll();
}
	
	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public void createCourse(@RequestBody Course course) {
		courseRepository.save(course);
	}

	@RequestMapping(value = "getstudent/{id}", method = RequestMethod.GET)
	public List<Student> getStudents(@PathVariable String id) {
		Course course = courseRepository.findOne(id);

		if (course != null) {
			return course.getStudents();
		} else {
			return null;
		}
}
	
	
}


