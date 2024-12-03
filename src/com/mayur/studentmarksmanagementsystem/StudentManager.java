package com.mayur.studentmarksmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	private List<Student> studentList = new ArrayList<>();

	public void addStudent(String name, ArrayList<Integer> marks) {
		Student s = new Student();
		s.setName(name);
		s.setMarks(marks);
		studentList.add(s);
		System.out.println("Student Added :" + s);
	}

	public void calculateAverageMarks() {

	}

	public void displayStudents() {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
