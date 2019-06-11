package com.user.regsvc.userform;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tuser_techn")
public class UserTechForm {
	

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tech_id;
	public Integer getTech_id() {
		return tech_id;
	}

	public void setTech_id(Integer tech_id) {
		this.tech_id = tech_id;
	}

	private int userId ;


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	private int java ;
	
	private int ui;
	
	private int database_lvl;
	
	private String createdBy;
	
	private Timestamp create_Dt;

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getUi() {
		return ui;
	}

	public void setUi(int ui) {
		this.ui = ui;
	}

	public int getDatabase_lvl() {
		return database_lvl;
	}

	public void setDatabase_lvl(int database_lvl) {
		this.database_lvl = database_lvl;
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
