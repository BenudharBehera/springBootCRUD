package com.stl.coupon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorization",schema = "coupon")
public class AuthorizationEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "authorization_link")
	private String authorizationLink;
	
	@Column(name = "msisdn")
	private String msisdn;
	
	@Column(name = "redir")
	private String redir;
	
	@Column(name = "forcetimeout")
	private String forcetimeout;
	
	@Column(name = "maxtraffic")
	private String maxtraffic;
	
	@Column(name = "tok")
	private String tok;
	

	
	public String getAuthorizationLink() {
		return authorizationLink;
	}
	public void setAuthorizationLink(String authorizationLink) {
		this.authorizationLink = authorizationLink;
	}
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
		return String.format(
				"Authorization [authorizationLink=%s, msisdn=%s, redir=%s, forcetimeout=%s, maxtraffic=%s, tok=%s]",
				authorizationLink, msisdn, redir, forcetimeout, maxtraffic, tok);
	}
	
	
	

	
}
