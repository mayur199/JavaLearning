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
		System.out.println("Student Added: " + s);
	}

	public void calculateAverageMarks() {
		System.out.println("Calculating average marks for each student:");
		for (Student student : studentList) {
			ArrayList<Integer> marks = student.getMarks();
			if (marks == null || marks.isEmpty()) {
				System.out.println("No marks available for student: " + student.getName());
				continue;
			}
			double total = 0;
			for (int mark : marks) {
				total += mark;
			}
			double average = total / marks.size();
			System.out.println("Student: " + student.getName() + ", Average Marks: " + average);
		}
	}

	public void displayStudents() {
		System.out.println("Displaying all students:");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
