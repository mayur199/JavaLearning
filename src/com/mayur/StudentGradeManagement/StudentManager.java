package com.mayur.StudentGradeManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	private List<Student> StudentList = new ArrayList<>();

	public List<Student> getStudentList() {
		return StudentList;
	}

	public void setStudentList(List<Student> studentList) {
		StudentList = studentList;
	}

	public void addStudent(Student student) {
		StudentList.add(student);
        System.out.println(student.getName());

	}

	public void viewStudents() {
		for (Student student : StudentList) {
			System.out.println(student);
		}
	}

	@Override
	public String toString() {
		return "StudentManager [StudentList=" + StudentList + "]";
	}

}
