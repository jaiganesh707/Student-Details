package com.example.studentfeesdetailsjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.example.studentfeesdetailsjdbc.Controller.Student;
import com.example.studentfeesdetailsjdbc.Model.StudentDto;

@SpringBootApplication
public class StudentfeesdetailsjdbcApplication implements CommandLineRunner{

	@Autowired
	private Student student;
	
	@Autowired
	private Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentfeesdetailsjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		insertStudent();
		
	}
	
	public void insertStudent()throws Exception{
		StudentDto studentDto=new StudentDto();
		try {
		studentDto.setStudentRegno("20MCA001");
		studentDto.setStudentName("JAI");
		studentDto.setStudentClass("MCA");
		studentDto.setStudentFees(29000.20);
		studentDto.setMobileNumber(7094261797l);
		System.out.println("Successfully Inserted");
		} catch (Exception e) {
			// TODO: handle exception
			if(e.getMessage()!=null) {
				System.out.println(e.getMessage());
			}		
		}
	}

}
