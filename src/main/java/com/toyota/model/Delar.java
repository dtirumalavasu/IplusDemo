package com.toyota.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Delar {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int delarId;
	private String delarName;
	private String delarPassword;
	private String delarPho;
	private String delarLocation;
	private String delarState;
	private String delarCity;
	private Long delarPincode;

	public int getDelarId() {
		return delarId;
	}

	public void setDelarId(int delarId) {
		this.delarId = delarId;
	}
	public String getDelarPassword() {
		return delarPassword;
	}

	public void setDelarPassword(String delarPassword) {
		this.delarPassword = delarPassword;
	}
	
	public String getDelarName() {
		return delarName;
	}

	public void setDelarName(String delarName) {
		this.delarName = delarName;
	}

	public String getDelarPho() {
		return delarPho;
	}

	public void setDelarPho(String delarPho) {
		this.delarPho = delarPho;
	}

	public String getDelarLocation() {
		return delarLocation;
	}

	public void setDelarLocation(String delarLocation) {
		this.delarLocation = delarLocation;
	}

	public String getDelarState() {
		return delarState;
	}

	public void setDelarState(String delarState) {
		this.delarState = delarState;
	}

	public String getDelarCity() {
		return delarCity;
	}

	public void setDelarCity(String delarCity) {
		this.delarCity = delarCity;
	}

	public Long getDelarPincode() {
		return delarPincode;
	}

	public void setDelarPincode(Long delarPincode) {
		this.delarPincode = delarPincode;
	}
	@Override
	public String toString() {
		return "Delar [delarId=" + delarId + ", delarName=" + delarName + ", delarPassword=" + delarPassword
				+ ", delarPho=" + delarPho + ", delarLocation=" + delarLocation + ", delarState=" + delarState
				+ ", delarCity=" + delarCity + ", delarPincode=" + delarPincode + "]";
	}

	

}
