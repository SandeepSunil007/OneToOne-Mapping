package com.tyss.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.onetoone.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}