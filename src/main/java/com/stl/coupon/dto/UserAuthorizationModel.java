package com.stl.coupon.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserAuthorizationModel implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loc;
	private String tok;
	private String init;
	private String ap;
	private String id;
	private String url;
	private String ssid;
	private String sessionid;
	private String lat;
	private String lon;
	private String t;	
	
	private Authorization authorization;
	private BrowserInfo browserInfo;
	
		
}
