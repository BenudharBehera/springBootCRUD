package com.stl.coupon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.stl.coupon.dto.WhatsAppModal;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

@Service("SMSSender")
public class SMSSenderImpl implements SMSSender {

	@Value("${message.account.sid}")
	private String sid;
	
	@Value("${auth.token}")
	private String token;
	
	@Value("${trail.number}")
	private String number;
	
	@Override
	public void sendSms(WhatsAppModal whatsAppModal) {
		Twilio.init(sid, token);
		MessageCreator creator = Message.creator(
				new PhoneNumber("whatsapp:"+"+91"+whatsAppModal.getMobileNo()),
				new PhoneNumber("whatsapp:"+number),
				whatsAppModal.getMsgBody()
		);
		creator.create();
	}
}
