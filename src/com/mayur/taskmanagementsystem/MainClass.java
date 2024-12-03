package com.mayur.taskmanagementsystem;

public class MainClass {
	public static void main(String[] args) {

		TaskManager taskManager = new TaskManager();

		Task t1 = new Task();
		t1.setTitle("Assignment no 1");
		t1.setDescription("Class homework");
		t1.setStatus("Pending");

		Task t2 = new Task();
		t2.setTitle("Assignment no 2");
		t2.setDescription("school homework");
		t2.setStatus("In progress");

		taskManager.addTask(t1);
		taskManager.addTask(t2);
		System.out.println("\nAll Tasks:");
		taskManager.viewTasks();

		taskManager.updateStatus("Assignment no 1", "Completed");
		System.out.println("\nTasks after status update:");
		taskManager.viewTasks();

	}
}