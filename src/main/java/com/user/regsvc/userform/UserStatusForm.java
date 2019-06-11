package com.user.regsvc.userform;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table (name="tuser_status")
public class UserStatusForm {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer status_id;
	
	public Integer getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	private int userId;
	
	private String status;
	
	private String createdBy;
	
	private Timestamp create_Dt;



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	
	
}
