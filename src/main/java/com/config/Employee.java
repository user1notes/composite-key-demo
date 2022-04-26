package com.config;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	@EmbeddedId
	private EmployeeIdentity employeeidentity;
	private String name;
	private String email;
	
	@Column(name = "phone_number", unique = true)
	private String phoneNumber;
	
	public Employee() {
		
	}

	public Employee(EmployeeIdentity employeeidentity, String name, String email, String phoneNumber) {
		this.employeeidentity = employeeidentity;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public EmployeeIdentity getEmployeeidentity() {
		return employeeidentity;
	}

	public void setEmployeeidentity(EmployeeIdentity employeeidentity) {
		this.employeeidentity = employeeidentity;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
