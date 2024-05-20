package com.microservice.studentservice.service;



import java.util.List;

import com.microservice.studentservice.entity.Student;
import com.microservice.studentservice.request.StudentRequest;


public interface StudentService {

	long addStudent(StudentRequest studentRequest);


    
    List<Student> getStudentList();
    
    Student updateStudent(StudentRequest studentRequest,long productId);

  

    public void deleteStudentById(long studentId);
}