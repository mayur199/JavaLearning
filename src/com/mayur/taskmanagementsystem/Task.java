package com.mayur.taskmanagementsystem;

public class Task {
	private String title;
	private String description;
	private String status;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Task [title=" + title + ", description=" + description + ", status=" + status + "]";
	}
	

}
