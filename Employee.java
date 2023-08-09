package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


//write comments and check naming conventions
@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "tech_emp")
	private Boolean isTechEmp;
	
	@Column(name = "emp_rating")
	private Integer empRating;
	
	public Employee(long id, String firstName, String lastName, String emailId, Boolean isTechEmp, Integer empRating) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.isTechEmp = isTechEmp;
		this.empRating = empRating;
	}

	public Employee() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Boolean getIsTechEmp() {
		return isTechEmp;
	}

	public void setIsTechEmp(Boolean isTechEmp) {
		this.isTechEmp = isTechEmp;
	}

	public Integer getEmpRating() {
		return empRating;
	}

	public void setEmpRating(Integer empRating) {
		this.empRating = empRating;
	}
	
}