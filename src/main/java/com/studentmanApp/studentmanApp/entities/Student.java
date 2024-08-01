package com.studentmanApp.studentmanApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Long id;
	private String name;
	private String email;
	private String branch;
	
	public Student() {
		
	}
	
	
	
	public Student(String name, String email, String branch) {
		super();
		this.name = name;
		this.email = email;
		this.branch = branch;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", branch=" + branch + "]";
	}
	
	

}
