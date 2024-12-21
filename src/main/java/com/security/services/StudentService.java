package com.security.services;

import java.util.List;

import com.security.entities.Student;
public interface StudentService {
	
	public Student createStudent(Student student);
	
	public String getStudentByID(Integer Id);
	
	public List<Student> getAll();
	

}
