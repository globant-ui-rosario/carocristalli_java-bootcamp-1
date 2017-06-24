package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final StudentRepository studentRepository;

	@Autowired
	StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;

	}

	@RequestMapping(value = "/get",method = RequestMethod.GET, produces = "application/json")
	Iterable<Student> getStudents() {
		
		return studentRepository.findAll();
}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/count")
	public long studentsQuantity() {

		return studentRepository.count();

}
	
	 @RequestMapping(method = RequestMethod.POST, value = "/create")
	    public void createStudent(@RequestBody Student student){
	        studentRepository.save(student);
	}
	 
	 @RequestMapping(value = "getcourses/{id}",method = RequestMethod.GET)
	    public List <Course> getStudentCourses(@PathVariable long id){
	        Student student = studentRepository.findOne(id);

	        if(student != null){
	            return student.getCourses();
	        } else {
	            return null;
	        }
	}

	
}


