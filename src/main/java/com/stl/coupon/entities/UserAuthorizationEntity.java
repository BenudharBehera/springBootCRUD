package com.stl.coupon.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_authorization", schema = "coupon")
public class UserAuthorizationEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@JoinColumn(name = "authorization_id")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)	
	private AuthorizationEntity userAuthorizationEntity;
	
	@JoinColumn(name = "browserinfo_id")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private BrowserEntity browserEntity;
	
	@Column(name = "token")
	private String token;
	
	@Column(name = "nodog_splash")
	private String nodogSplash;
	
	@Column(name = "router_mac")
	private String routerMAC;
	
	@Column(name = "client_mac")
	private String clientMAC;
	
	@Column(name = "redirection_url")
	private String redirectionURL;
	
	@Column(name = "careem")
	private String careem;
	
	@Column(name = "session_id")
	private String sessionId;
	
	@Column(name = "gps_latitude")
	private String gpsLatitude;
	
	@Column(name = "gps_longitude")
	private String gpsLongitude;
	
	@Column(name = "js_getTime")
	private String jsGetTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AuthorizationEntity getUserAuthorizationEntity() {
		return userAuthorizationEntity;
	}

	public void setUserAuthorizationEntity(AuthorizationEntity userAuthorizationEntity) {
		this.userAuthorizationEntity = userAuthorizationEntity;
	}

	public BrowserEntity getBrowserEntity() {
		return browserEntity;
	}

	public void setBrowserEntity(BrowserEntity browserEntity) {
		this.browserEntity = browserEntity;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNodogSplash() {
		return nodogSplash;
	}

	public void setNodogSplash(String nodogSplash) {
		this.nodogSplash = nodogSplash;
	}

	public String getRouterMAC() {
		return routerMAC;
	}

	public void setRouterMAC(String routerMAC) {
		this.routerMAC = routerMAC;
	}

	public String getClientMAC() {
		return clientMAC;
	}

	public void setClientMAC(String clientMAC) {
		this.clientMAC = clientMAC;
	}

	public String getRedirectionURL() {
		return redirectionURL;
	}

	public void setRedirectionURL(String redirectionURL) {
		this.redirectionURL = redirectionURL;
	}

	public String getCareem() {
		return careem;
	}

	public void setCareem(String careem) {
		this.careem = careem;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getGpsLatitude() {
		return gpsLatitude;
	}

	public void setGpsLatitude(String gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	public String getGpsLongitude() {
		return gpsLongitude;
	}

	public void setGpsLongitude(String gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	public String getJsGetTime() {
		return jsGetTime;
	}

	public void setJsGetTime(String jsGetTime) {
		this.jsGetTime = jsGetTime;
	}
	
	

}
