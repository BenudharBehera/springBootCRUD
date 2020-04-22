package com.stl.coupon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details", schema = "coupon")
public class UserEntity {
	
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="date_of_birth")
	private String dob;
	
	@Column(name = "file_name")
	private String fileName;
	
	@Column(name = "file_path")
	private String filePath;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return String.format("UserEntity [id=%s, userName=%s, name=%s, dob=%s, fileName=%s, filePath=%s]", id, userName,
				name, dob, fileName, filePath);
	}
	
	
	

}
