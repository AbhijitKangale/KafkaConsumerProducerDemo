package com.sapient.kafka.model;

public class Department {

	private String id;
	private String message;
	private String departmentName;

	public Department() {
		super();
	}
	
	public Department(String id, String message, String departmentName) {
		super();
		this.id = id;
		this.message = message;
		this.departmentName = departmentName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
