package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name: XXX");
	}

	public void studentDept() {
		System.out.println("Student Department is: ECE");

	}

	public void studentId() {
		System.out.println("Student ID is: 005");

	}
	
	public static void main(String[] args) {
		Student studentDetails = new Student();
		studentDetails.collegeCode();
		studentDetails.collegeName();
		studentDetails.collegeRank();
		studentDetails.deptName();
		studentDetails.studentId();
		studentDetails.studentName();
		studentDetails.studentDept();
		

	}
}
