package com.user.regsvc.userform;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tuser")
public class BasicUserProfile {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	private String firstName;
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;
	
	private String passportNumber;
	
	private String immigrationStatus;
	
	private String createdBy;

	private Timestamp create_Dt;



	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreate_Dt() {
		return create_Dt;
	}

	public void setCreate_Dt(Timestamp create_Dt) {
		this.create_Dt = create_Dt;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getImmigrationStatus() {
		return immigrationStatus;
	}

	public void setImmigrationStatus(String immigrationStatus) {
		this.immigrationStatus = immigrationStatus;
	}

}
