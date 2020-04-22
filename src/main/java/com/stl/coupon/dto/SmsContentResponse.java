package com.stl.coupon.dto;

import java.util.List;

public class SmsContentResponse extends AbstractResponse{
	
	List<SMSContectModel> smsContectModels;

	public List<SMSContectModel> getSmsContectModels() {
		return smsContectModels;
	}

	public void setSmsContectModels(List<SMSContectModel> smsContectModels) {
		this.smsContectModels = smsContectModels;
	}
	
	
	

}
