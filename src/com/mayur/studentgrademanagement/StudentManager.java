package com.mayur.studentgrademanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	private List<Student> studentList = new ArrayList<>();

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(Student student) {
		studentList.add(student);
        System.out.println(student.getName());

	}

	public void viewStudents() {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	@Override
	public String toString() {
		return "StudentManager [StudentList=" + studentList + "]";
	}

}
