package com.stl.coupon.config;

import com.stl.coupon.dto.WhatsAppModal;

public interface SMSSender {
	
	public void sendSms(WhatsAppModal whatsAppModal);

}
