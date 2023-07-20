package com.example.studentfeesdetailsjdbc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentfeesdetailsjdbc.Dao.StudentRepository;
import com.example.studentfeesdetailsjdbc.Model.StudentDto;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;

	@Override
	public void insertStudent(StudentDto dto) throws Exception {
		// TODO Auto-generated method stub
		if(dto.getStudentRegno()==null) {
			throw new Exception("UserInterfaceNotInserted");
		}
		else if (repository.getStudent(dto.getStudentRegno())!=null) {
			throw new Exception("UserInterfaceAlreadyInserted");
		}
		repository.insertStudent(dto);
	
	}

	@Override
	public StudentDto getStudent(String studentRegno) throws Exception {
		// TODO Auto-generated method stub
		if(repository.getStudent(studentRegno)==null) {
			throw new Exception("NotInsertedValue");
			
		}
		repository.getStudent(studentRegno);
		return null;
	}

	@Override
	public void updateStudent(StudentDto dto) throws Exception {
		// TODO Auto-generated method stub	
		repository.updateStudent(dto);
	}

	@Override
	public void deletedStudent(String studentRegno) throws Exception {
		// TODO Auto-generated method stub

		repository.deletedStudent(studentRegno);
		
	}
	

}
