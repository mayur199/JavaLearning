package com.mayur.TaskManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	private List<Task> taskLists = new ArrayList<>();

	void addTask(Task task) {
		taskLists.add(task);
		System.out.println("Task added: " + task.getTitle());

	}

	public void viewTasks() {
		taskLists.forEach(task -> {
			System.out.println("Title: " + task.getTitle() + ", Description: " + task.getDescription() + ", Status: "
					+ task.getStatus());
		});

	}

	public void updateStatus(String title, String status) {
		taskLists.forEach(task -> {
			if (title.equals(task.getTitle())) {
				task.setStatus(status);
				System.out.println("\nUpdated task status:  " + title + " updated to : " + status);

			}
		});

	}
}
