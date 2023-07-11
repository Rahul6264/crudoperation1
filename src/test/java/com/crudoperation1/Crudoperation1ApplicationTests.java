package com.crudoperation1;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crudoperation1.entity.student;
import com.crudoperation1.repository.StudentRepository;


@SpringBootTest
class Crudoperation1ApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveStudent() {
		student s = new student();
		s.setCourse("developer");
		s.setName("rahul");
		s.setFee(100);
		
		studentRepo.save(s);
	}
	
	@Test
	void deleteStudent() {
		studentRepo.deleteById(2L);
	}
  
	@Test
	void findStudent() {
		Optional<student> findById = studentRepo.findById(3L);
		student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
		
	}
	@Test
	void UpdateStudent() {
		
		student s = new student();
		s.setId(3L);
		s.setCourse("developer");
		s.setName("sem");
		s.setFee(10000);
		
		studentRepo.save(s);
	}
}
