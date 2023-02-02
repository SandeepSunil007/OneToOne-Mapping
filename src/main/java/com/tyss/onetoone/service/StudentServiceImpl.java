package com.tyss.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.onetoone.entity.Student;
import com.tyss.onetoone.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private static final String DATA_STORED_INTO_DATA_BASE_SUCESSFULLY = "Data Stored into DataBase sucessfully...";

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentObject(Student student) {

		// By-Directional mapping

//		Bag bag=new Bag();
//		BeanUtils.copyProperties(student.getBag(), bag);
//		bag.setStudent(student);
//		student.setBag(bag);
//		studentRepository.save(student);

		// Uni-Directional mapping

		Student stu = Student.builder().stuName(student.getStuName()).stuAddress(student.getStuAddress())
				.bag(student.getBag()).build();

		return studentRepository.save(stu);
	}

}
