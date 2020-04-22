package com.stl.coupon.dto;

public class BrowserInfo {

	private String browserInfo;
	private String userAgent;
	private String appName;
	private String appCodeName;
	private String appVersion;
	private String platform;
	private String cookieEnabled;
	private String javaEnabled;
	private String colorDepth;
	private String width;
	private String height;
	private String availWidth;
	private String availHeight;
	private String outerWidth;
	private String outerHeight;
	private String platforms;
	private String cpuClass;
	private String referrer;
	private String localedate;
	private String now;
	private String language;
	private String browserLanguage;
	private String systemLanguage;
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
	@Override
	public String toString() {
		return String.format(
				"BrowserInfo [browserInfo=%s, userAgent=%s, appName=%s, appCodeName=%s, appVersion=%s, platform=%s, cookieEnabled=%s, javaEnabled=%s, colorDepth=%s, width=%s, height=%s, availWidth=%s, availHeight=%s, outerWidth=%s, outerHeight=%s, platforms=%s, cpuClass=%s, referrer=%s, localedate=%s, now=%s, language=%s, browserLanguage=%s, systemLanguage=%s, userLanguage=%s]",
				browserInfo, userAgent, appName, appCodeName, appVersion, platform, cookieEnabled, javaEnabled,
				colorDepth, width, height, availWidth, availHeight, outerWidth, outerHeight, platforms, cpuClass,
				referrer, localedate, now, language, browserLanguage, systemLanguage, userLanguage);
	}
	
	
	
}
