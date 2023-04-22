package com.jspiders.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springboot.pojo.Student;
import com.jspiders.springboot.response.StudentResponse;
import com.jspiders.springboot.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private  StudentService service; 
	
	@PostMapping("/add")
	public  ResponseEntity<StudentResponse> addStudent(@RequestBody Student student){
			Student addStudent = service.addStudent(student);
			if(addStudent!=null) {
				return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student Added Successfully", addStudent, null),HttpStatus.ACCEPTED);
			}
			return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student Not Added Successfully", null, null),HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/searchAll")
	public ResponseEntity<List<Student>> showStudent(){
		List<Student> allStudent = service.getAllStudent();
		if(allStudent!=null) {
	 		return new  ResponseEntity<List<Student>>(allStudent,HttpStatus.ACCEPTED);
		}
		return new  ResponseEntity<List<Student>>(HttpStatus.BAD_REQUEST);	
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestParam int id){
			service.delStudent(id);
		return "Deleted Successfully";
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<StudentResponse> updateData(@RequestBody Student student,@RequestParam int id){
		Student updateData = service.updateData(student,id);	
		if(updateData!= null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student Updated Successfully", updateData, null),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<StudentResponse>(new StudentResponse("OK", "Student Not Updated Successfully", updateData, null),HttpStatus.BAD_REQUEST);
	}
}
