package com.microservice.studentservice.controller;

import com.microservice.studentservice.entity.Student;

import com.microservice.studentservice.request.StudentRequest;

import com.microservice.studentservice.service.StudentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/student")
@RequiredArgsConstructor
@Transactional
@Log4j2
public class StudentController {

	
    private final StudentService studentService = null;
    
    @PostMapping
    public ResponseEntity<Long> addStudent(@RequestBody StudentRequest studentRequest) {

        

        long studentId = studentService.addStudent(studentRequest);
        return new ResponseEntity<>(studentId, HttpStatus.CREATED);
    }
    

    
    @GetMapping("/allstudents")
 
    public List<Student> fetchStudentList()
    {
        return studentService.getStudentList();
    }

    

    @PutMapping("/update/{id}")
    public Student
    updateStudent(@RequestBody StudentRequest studentRequest,
                     @PathVariable("id") long studentId)
    {
        return studentService.updateStudent(
        		studentRequest, studentId);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") long studentId) {
        studentService.deleteStudentById(studentId);
    }
}
