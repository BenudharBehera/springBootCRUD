package com.stl.coupon.dto;

import java.util.List;

public class SMSLogResponse extends AbstractResponse {
	
	private List<SMSLogModel> smsLogModels;

	public List<SMSLogModel> getSmsLogModels() {
		return smsLogModels;
	}

	public void setSmsLogModels(List<SMSLogModel> smsLogModels) {
		this.smsLogModels = smsLogModels;
	}
	
	

}
