package com.microservice.studentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    public long getId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurName() {
		return surName;
	}

	public void setSurName(String firstName) {
		this.surName = firstName;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	
	public long getGuardianNo() {
		return guardianNo;
	}

	public void setGuardianNo(long guardianNo) {
		this.guardianNo = guardianNo;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "SUR_NAME")
    private String surName;

    @Column(name = "YEAR")
    private long year;
    
    @Column(name = "D_O_B")
    private String dob;
    
    @Column(name = "SCHOOL_NAME")
    private String schoolName;
    
    @Column(name = "GUARDIAN_NAME")
    private String guardianName;
    
    @Column(name = "GUARDIAN_NO")
    private long guardianNo;
    
    @Column(name = "ADDRESS")
    private String address;
}
