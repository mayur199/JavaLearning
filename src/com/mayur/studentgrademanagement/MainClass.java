package com.mayur.studentgrademanagement;

public class MainClass {
	public static void main(String[] args) {
		
		StudentManager sm =new StudentManager();
		Student s1 = new Student();
		s1.setName("Ajay");
		s1.setGrade('A');
		Student s2 = new Student();
		s2.setName("Raj");
		s2.setGrade('B');
		Student s3 = new Student();
		s3.setName("sanjay");
		s3.setGrade('C');
		sm.addStudent(s1);
		sm.addStudent(s2);
		sm.addStudent(s3);
		sm.viewStudents();

	}

}
