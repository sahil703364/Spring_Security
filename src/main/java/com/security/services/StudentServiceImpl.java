package com.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.entities.Student;
import com.security.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repository;

	@Override
	public Student createStudent(Student student) {
		Student save = repository.save(student);
		return save;
	}

	@Override
	public String getStudentByID(Integer Id) {
		
		Optional<Student> byId = repository.findById(Id);
		
		return "Data is present";
	}

	@Override
	public List<Student> getAll() {
		
		return repository.findAll();
	}

	

}
