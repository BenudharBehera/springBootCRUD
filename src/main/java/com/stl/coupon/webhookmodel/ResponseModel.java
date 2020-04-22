package com.stl.coupon.webhookmodel;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"fullName",
	"ageRange",
	"gender",
	"location",
	"title",
	"organization",
	"twitter",
	"linkedin",
	"facebook",
	"bio",
	"avatar",
	"website",
	"details",
	"isSandboxProfile",
	"updated"
})
@Data
public class ResponseModel {

	@JsonProperty("fullName")
	private String fullName;
	@JsonProperty("ageRange")
	private String ageRange;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("location")
	private String location;
	@JsonProperty("title")
	private String title;
	@JsonProperty("organization")
	private String organization;
	@JsonProperty("twitter")
	private String twitter;
	@JsonProperty("linkedin")
	private Object linkedin;
	@JsonProperty("facebook")
	private Object facebook;
	@JsonProperty("bio")
	private Object bio;
	@JsonProperty("avatar")
	private String avatar;
	@JsonProperty("website")
	private String website;
	@JsonProperty("details")
	private Details details;
	@JsonProperty("isSandboxProfile")
	private Boolean isSandboxProfile;
	@JsonProperty("updated")
	private String updated;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();



}
