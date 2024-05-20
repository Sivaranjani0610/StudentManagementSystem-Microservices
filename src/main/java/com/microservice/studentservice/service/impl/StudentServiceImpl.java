package com.microservice.studentservice.service.impl;


import com.microservice.studentservice.entity.Student;
import com.microservice.studentservice.repository.StudentRepository;
import com.microservice.studentservice.request.StudentRequest;

import com.microservice.studentservice.service.StudentService;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


import static org.springframework.beans.BeanUtils.copyProperties;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository = null;
    
    @Override
    public long addStudent(StudentRequest studentRequest) {

        Student student
                = Student.builder()
                .firstName(studentRequest.getFirstName())
                .surName(studentRequest.getSurName())
                .year(studentRequest.getYear())
                .dob(studentRequest.getDob())
                .schoolName(studentRequest.getSchoolName())
                .guardianName(studentRequest.getGuardianName())
                .guardianNo(studentRequest.getGuardianNo())
                .address(studentRequest.getAddress())
                .build();

        student = studentRepository.save(student);
  
        return student.getStudentId();
    }

   
    

    @Override public List<Student> getStudentList()
    {
        return (List<Student>)
        		studentRepository.findAll();
    }
    
    
    @Override
    public Student updateStudent(StudentRequest studentRequest,long studentId) {
 
        Student stud
            = studentRepository.findById(studentId)
                  .get();
            stud.setFirstName(
            		studentRequest.getFirstName());
            
            stud.setSurName(
            		studentRequest.getSurName());
        
            stud.setYear(
            		studentRequest.getYear());
        
            stud.setDob(
            		studentRequest.getDob());
       
            stud.setSchoolName(
            		studentRequest.getSchoolName());
            
            stud.setGuardianName(
            		studentRequest.getGuardianName());
            
            stud.setGuardianNo(
            		studentRequest.getGuardianNo());
            
            stud.setAddress(
            		studentRequest.getAddress());
        
 
        return studentRepository.save(stud);
    }

    @Override
    public void deleteStudentById(long studentId) {

        
        studentRepository.deleteById(studentId);

    }
}