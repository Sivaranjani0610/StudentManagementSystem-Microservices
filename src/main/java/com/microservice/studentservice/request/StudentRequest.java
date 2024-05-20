package com.microservice.studentservice.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRequest {
   
	private String firstName;
	private String surName;
	private long year;
	private String dob;
	private String schoolName;
	private String guardianName;
	private long guardianNo;
	private String address;
	
	
	
}
