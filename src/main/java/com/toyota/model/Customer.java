package com.toyota.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Customer {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	private String customerName;
	private String customerPassword;
	private String customerPhone;
	@Id
	private String customerEmail;
	private String customerState;
	private String customerCity;
	private String customerGender;
	private Long customerPincode;
	
	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public Long getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(Long customerPincode) {
		this.customerPincode = customerPincode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", customerPhone=" + customerPhone + ", customerEmail=" + customerEmail
				+ ", customerState=" + customerState + ", customerCity=" + customerCity + ", customerGender="
				+ customerGender + ", customerPincode=" + customerPincode + "]";
	}

}
