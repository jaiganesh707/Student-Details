package com.example.studentfeesdetailsjdbc.Service;

import com.example.studentfeesdetailsjdbc.Model.StudentDto;

public interface StudentService {
	
	public void insertStudent(StudentDto dto)throws Exception;
	public StudentDto getStudent(String studentRegno)throws Exception;
	public void updateStudent(StudentDto dto)throws Exception;
	public void deletedStudent(String studentRegno)throws Exception;



}
