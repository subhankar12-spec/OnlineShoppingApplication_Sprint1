package com.capg.OnlineShop.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="CUSTOMER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CustID")
	private int customerId;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="MobileNo")
	private String mobileNumber;
	@Column(name="Status")
	private String status; // active or deactivated
	@OneToMany(targetEntity=Address.class,cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Cp_fk")//, referencedColumnName="CustID")
	private List<Address> address;
	@OneToOne(targetEntity=User.class,cascade= CascadeType.ALL)
	@JoinColumn(name="Cust_fk")//, referencedColumnName="UserID")
	private User user;
	
	
//	@Override
//	public String toString() {
//		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
//				+ ", mobileNumber=" + mobileNumber + ", status=" + status + ", address=" + address + "]";
//	}
	
	
//	
	
	
	

}
