package com.example.studentfeesdetailsjdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.studentfeesdetailsjdbc.Model.StudentDto;
@Repository
public class StudentRepositoryImpl implements StudentRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertStudent(StudentDto dto) throws Exception {
		// TODO Auto-generated method stub
		String query="insert into studentfess(studentRegno,studentName,studentClass,mobileNumber,studentFees)values(?,?,?,?,?)";
		jdbcTemplate.update(query, dto.getStudentRegno(),dto.getStudentName(),dto.getStudentClass(),dto.getStudentFees(),dto.getMobileNumber());
		
	}

	@Override
	public StudentDto getStudent(String studentRegno) throws Exception {
		// TODO Auto-generated method stub
		String query="select * from studentfess where getStudentRegno=?";
		return jdbcTemplate.queryForObject(query, new Object[] {studentRegno},new StudentRowmapper());
	}

	@Override
	public void updateStudent(StudentDto dto) throws Exception {
		// TODO Auto-generated method stub
		String query="update studentfess set studentName=?,studentClass=?,mobileNumber=?,studentFees=? where studentRegno=?";
		jdbcTemplate.update(query, dto.getStudentName(),dto.getStudentClass(),dto.getStudentFees(),dto.getMobileNumber(),dto.getStudentRegno());
	}

	@Override
	public void deletedStudent(String studentRegno) throws Exception {
		// TODO Auto-generated method stub
		String query="delete from studentfess where studentRegno=?";
		jdbcTemplate.update(query, studentRegno);
		
		
	}

}
