package com.stl.coupon.dto;

public class WhatsAppModal {
	
	private String mobileNo;
	private String module;
	private String msgBody;
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	
	@Override
	public String toString() {
		return String.format("WhatsAppModal [mobileNo=%s, module=%s, msgBody=%s]", mobileNo, module, msgBody);
	}
	
	

}
