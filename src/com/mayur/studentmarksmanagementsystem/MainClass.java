package com.mayur.studentmarksmanagementsystem;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();

		// Adding students
		ArrayList<Integer> marks1 = new ArrayList<>();
		marks1.add(85);
		marks1.add(90);
		marks1.add(78);
		sm.addStudent("John", marks1);

		ArrayList<Integer> marks2 = new ArrayList<>();
		marks2.add(88);
		marks2.add(76);
		marks2.add(92);
		sm.addStudent("Alice", marks2);

		ArrayList<Integer> marks3 = new ArrayList<>();
		marks3.add(70);
		marks3.add(80);
		sm.addStudent("Bob", marks3);

		// Display all students
		sm.displayStudents();

		// Calculate and display average marks for each student
		sm.calculateAverageMarks();
	}
}
