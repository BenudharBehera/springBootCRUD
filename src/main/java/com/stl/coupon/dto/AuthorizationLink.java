package com.stl.coupon.dto;

public class AuthorizationLink extends AbstractResponseAuth{
	
	private String msisdn;
	private String redir;
	private String forcetimeout;
	private String maxtraffic;
	private String tok;
	
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getRedir() {
		return redir;
	}
	public void setRedir(String redir) {
		this.redir = redir;
	}
	public String getForcetimeout() {
		return forcetimeout;
	}
	public void setForcetimeout(String forcetimeout) {
		this.forcetimeout = forcetimeout;
	}
	public String getMaxtraffic() {
		return maxtraffic;
	}
	public void setMaxtraffic(String maxtraffic) {
		this.maxtraffic = maxtraffic;
	}
	public String getTok() {
		return tok;
	}
	public void setTok(String tok) {
		this.tok = tok;
	}
	
	@Override
	public String toString() {
		return String.format("AuthorizationLink [msisdn=%s, redir=%s, forcetimeout=%s, maxtraffic=%s, tok=%s]", msisdn,
				redir, forcetimeout, maxtraffic, tok);
	}
	
	
	
}
