package com.microservice.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.studentservice.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
