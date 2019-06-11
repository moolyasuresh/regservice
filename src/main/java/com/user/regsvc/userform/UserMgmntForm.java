package com.user.regsvc.userform;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tuser_mgmnt")
public class UserMgmntForm {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mgmnt_id;
	
	private int userId;
	
	private int commnctn;
	
	private int leadership;
	
	private String createdBy;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCommnctn() {
		return commnctn;
	}

	public void setCommnctn(int commnctn) {
		this.commnctn = commnctn;
	}

	public int getLeadership() {
		return leadership;
	}

	public void setLeadership(int leadership) {
		this.leadership = leadership;
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

	private Timestamp create_Dt;
	


	
	

}
