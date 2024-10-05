package com.demo.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tName;
	private String tDept;

	// Constructors
	public Teacher() {
	}

	public Teacher(String tName, String tDept) {
		this.tName = tName;
		this.tDept = tDept;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettDept() {
		return tDept;
	}

	public void settDept(String tDept) {
		this.tDept = tDept;
	}
}
