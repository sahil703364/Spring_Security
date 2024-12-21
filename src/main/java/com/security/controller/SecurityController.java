package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entities.Student;
import com.security.services.StudentService;

@RestController
public class SecurityController {

	 @Autowired
	 private StudentService service;
	 
	 @PostMapping("/student")
	 public ResponseEntity<Student> CreateStudent(@RequestBody Student student){
		 
		 Student saveStudent = service.createStudent(student);
		 
		 return new ResponseEntity<>(saveStudent,HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/student/{id}")
	 public ResponseEntity<Student> getById(@PathVariable  Integer id){
		 String studentByID = service.getStudentByID(id);
		 
		 return new ResponseEntity(studentByID,HttpStatus.OK);
	 }
	 
	 @GetMapping("/all")
	 public List<Student> GetAll() {
		 List<Student> list = service.getAll();
		 
		 return (List<Student>) new ResponseEntity(list, HttpStatus.OK);
		 
	 }
}
