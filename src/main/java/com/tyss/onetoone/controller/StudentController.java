package com.tyss.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.onetoone.entity.Student;
import com.tyss.onetoone.response.StudentReponse;
import com.tyss.onetoone.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public ResponseEntity<StudentReponse> saveStudent(@RequestBody Student stu) {
		System.out.println("Hi");
		Student saveStudentObject = studentService.saveStudentObject(stu);
		return ResponseEntity.ok(StudentReponse.builder().isError(Boolean.FALSE).data(saveStudentObject)
				.mesage("Data Stored into DataBase sucessfully...").build());
	}

}
