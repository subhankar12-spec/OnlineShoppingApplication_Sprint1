package com.cg.onlineshopping.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Builder
@Table(name="USERS")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UserId")
	private int userID;
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String userPassword;
	@Column(name="Role")
	private String role;
	@Column(name="Email")
	private String email;
	@OneToOne(targetEntity=Customer.class,cascade= CascadeType.ALL)
	@JoinColumn(name="Cp_fk", referencedColumnName="CustID")
	@JsonBackReference
	private Customer cust;
	
	public User() {
		
	}

	public User(int userID, String username, String userPassword, String role, String email, Customer cust) {
		super();
		this.userID = userID;
		this.username = username;
		this.userPassword = userPassword;
		this.role = role;
		this.email = email;
		this.cust = cust;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	

}	