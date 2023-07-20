package com.example.studentfeesdetailsjdbc.Model;

public class StudentDto {
	
	private String studentRegno;
	private String studentName;
	private String studentClass;
	private Long mobileNumber;
	private Double studentFees;
	
	public String getStudentRegno() {
		return studentRegno;
	}
	public void setStudentRegno(String studentRegno) {
		this.studentRegno = studentRegno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Double getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(Double studentFees) {
		this.studentFees = studentFees;
	}


}
