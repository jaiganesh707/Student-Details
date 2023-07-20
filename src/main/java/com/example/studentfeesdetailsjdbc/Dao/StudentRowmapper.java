package com.example.studentfeesdetailsjdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.studentfeesdetailsjdbc.Model.StudentDto;

public class StudentRowmapper implements RowMapper<StudentDto>{

	@Override
	public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		StudentDto studentDto=new StudentDto();
		studentDto.setStudentRegno(rs.getString("StudentRegno"));
		studentDto.setStudentName(rs.getString("StudentName"));
		studentDto.setStudentClass(rs.getString("StudentClass"));
		studentDto.setStudentFees(rs.getDouble("StudentFees"));
		studentDto.setMobileNumber(rs.getLong("MobileNumber"));
		return studentDto;
	}


}
