package org.college;

public class Student extends Hostel {
	public void studentName() {
		System.out.println("Student Name : Anaya");
		
}
	public void studentDept() {
		System.out.println(("Student Dept : Computer Science"));
	}
	public void studentId() {
		System.out.println(" Student Id: 23433");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		//s.collegeRank();
		s.deptName();
		s.hostelName();
		s.studentDept();
		s.studentId();
		s.studentName();
	}
	
	
	
	
	
	
}
