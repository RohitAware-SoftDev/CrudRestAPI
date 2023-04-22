package com.jspiders.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.pojo.Student;
import com.jspiders.springboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private  StudentRepository repository;

	public Student addStudent(Student student) {
		Student stu = repository.save(student);
		return stu;
	}

	public List<Student> getAllStudent() {
		List<Student> list =new  ArrayList();
		repository.findAll().forEach(list::add);
		return list;
	}

	public void delStudent(int id) {
		if(id != 0) {
			repository.deleteById(id);
		}
	}

	public Student updateData(Student student, int id) {
		Student data = repository.findById(id).orElse(null);
		data.setName(student.getName());
		data.setSurname(student.getSurname());
		data.setEmail(student.getEmail());
		data.setContact(student.getContact());
		data.setBlood_Gr(student.getBlood_Gr());
		Student save = repository.save(data);
		return save;
	}
}
