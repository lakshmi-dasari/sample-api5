package com.samplefive.samplefive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="samplefive")
public class modelclass {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	
	@Id @Column(name="id",nullable=false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="firstname",nullable=false)
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Column(name="lastname",nullable=false)
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Column(name="email",nullable=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public modelclass(long id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public modelclass() {
		
	}
	@Override
	public String toString() {
		return "modelclass [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ "]";
	}
	
	
}
