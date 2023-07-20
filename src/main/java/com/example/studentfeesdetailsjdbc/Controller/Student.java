package com.example.studentfeesdetailsjdbc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.studentfeesdetailsjdbc.Model.StudentDto;
import com.example.studentfeesdetailsjdbc.Service.StudentService;

@Controller
public class Student {
	
	@Autowired
	private StudentService studentService;
	
	public void insertStudent(StudentDto dto)throws Exception{
		studentService.insertStudent(dto);
	}
	public StudentDto getStudent(String studentRegno)throws Exception{
		
		
		return studentService.getStudent(studentRegno);
		
	}
	public void updateStudent(StudentDto dto)throws Exception{
		studentService.updateStudent(dto);
	}
	public void deletedStudent(String studentRegno)throws Exception{
		studentService.deletedStudent(studentRegno);
	}

}
