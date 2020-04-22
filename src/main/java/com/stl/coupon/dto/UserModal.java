package com.stl.coupon.dto;

import org.springframework.web.multipart.MultipartFile;

public class UserModal {
	
	private String userName;
	private String name;
	private String dob;
	private MultipartFile excelFile;
	
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
	public MultipartFile getExcelFile() {
		return excelFile;
	}
	public void setExcelFile(MultipartFile excelFile) {
		this.excelFile = excelFile;
	}
	@Override
	public String toString() {
		return String.format("UserModal [userName=%s, name=%s, dob=%s, excelFile=%s]", userName, name, dob, excelFile);
	}
	
	

}
