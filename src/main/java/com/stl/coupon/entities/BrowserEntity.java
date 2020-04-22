package com.stl.coupon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "browser_ntity",schema = "coupon")
public class BrowserEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "browserInfo")
	private String browserInfo;
	
	@Column(name = "user_agent")
	private String userAgent;
	
	@Column(name = "app_name")
	private String appName;
	
	@Column(name = "appcode_name")
	private String appCodeName;
	
	@Column(name = "app_version")
	private String appVersion;
	
	@Column(name = "platform")
	private String platform;
	
	@Column(name = "cookie_enabled")
	private String cookieEnabled;
	
	@Column(name = "java_enabled")
	private String javaEnabled;
	
	@Column(name = "color_depth")
	private String colorDepth;
	
	@Column(name = "width")
	private String width;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "avail_width")
	private String availWidth;
	
	@Column(name = "avail_height")
	private String availHeight;
	
	@Column(name = "outer_width")
	private String outerWidth;
	
	@Column(name = "outer_height")
	private String outerHeight;
	
	@Column(name = "platforms")
	private String platforms;
	
	@Column(name = "cpu_class")
	private String cpuClass;
	
	@Column(name = "referrer")
	private String referrer;
	
	@Column(name = "localedate")
	private String localedate;
	
	@Column(name = "now")
	private String now;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "browser_language")
	private String browserLanguage;
	
	@Column(name = "system_language")
	private String systemLanguage;
	
	@Column(name = "user_language")
	private String userLanguage;
	
	
	public String getBrowserInfo() {
		return browserInfo;
	}
	public void setBrowserInfo(String browserInfo) {
		this.browserInfo = browserInfo;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppCodeName() {
		return appCodeName;
	}
	public void setAppCodeName(String appCodeName) {
		this.appCodeName = appCodeName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getCookieEnabled() {
		return cookieEnabled;
	}
	public void setCookieEnabled(String cookieEnabled) {
		this.cookieEnabled = cookieEnabled;
	}
	public String getJavaEnabled() {
		return javaEnabled;
	}
	public void setJavaEnabled(String javaEnabled) {
		this.javaEnabled = javaEnabled;
	}
	public String getColorDepth() {
		return colorDepth;
	}
	public void setColorDepth(String colorDepth) {
		this.colorDepth = colorDepth;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getAvailWidth() {
		return availWidth;
	}
	public void setAvailWidth(String availWidth) {
		this.availWidth = availWidth;
	}
	public String getAvailHeight() {
		return availHeight;
	}
	public void setAvailHeight(String availHeight) {
		this.availHeight = availHeight;
	}
	public String getOuterWidth() {
		return outerWidth;
	}
	public void setOuterWidth(String outerWidth) {
		this.outerWidth = outerWidth;
	}
	public String getOuterHeight() {
		return outerHeight;
	}
	public void setOuterHeight(String outerHeight) {
		this.outerHeight = outerHeight;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	public String getCpuClass() {
		return cpuClass;
	}
	public void setCpuClass(String cpuClass) {
		this.cpuClass = cpuClass;
	}
	public String getReferrer() {
		return referrer;
	}
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}
	public String getLocaledate() {
		return localedate;
	}
	public void setLocaledate(String localedate) {
		this.localedate = localedate;
	}
	public String getNow() {
		return now;
	}
	public void setNow(String now) {
		this.now = now;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getBrowserLanguage() {
		return browserLanguage;
	}
	public void setBrowserLanguage(String browserLanguage) {
		this.browserLanguage = browserLanguage;
	}
	public String getSystemLanguage() {
		return systemLanguage;
	}
	public void setSystemLanguage(String systemLanguage) {
		this.systemLanguage = systemLanguage;
	}
	public String getUserLanguage() {
		return userLanguage;
	}
	public void setUserLanguage(String userLanguage) {
		this.userLanguage = userLanguage;
	}
	
	
}
