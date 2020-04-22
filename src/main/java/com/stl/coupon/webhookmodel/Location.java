package com.stl.coupon.webhookmodel;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"city",
	"region",
	"regionCode",
	"country",
	"countryCode",
	"formatted"
})
@Data
public class Location {

	@JsonProperty("city")
	private String city;
	@JsonProperty("region")
	private String region;
	@JsonProperty("regionCode")
	private String regionCode;
	@JsonProperty("country")
	private String country;
	@JsonProperty("countryCode")
	private String countryCode;
	@JsonProperty("formatted")
	private String formatted;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}