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
	"url",
	"service"
})
@Data
public class Twitter {

	@JsonProperty("url")
	private String url;
	@JsonProperty("service")
	private String service;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}