package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	 @Id
	 @Column(name = "name")
	 private String name;
	 
	 @ManyToOne
	 @JoinColumn(name = "teacher_id")
	private Teacher teacher;
	
	@ManyToMany
	@JoinTable(name = "inscriptions", joinColumns = @JoinColumn(name = "name"),
	inverseJoinColumns = @JoinColumn(name = "student"))
	private List<Student> students = new ArrayList<>();

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
