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
	"name",
	"current",
	"title"
})
@Data
public class Employment {

	@JsonProperty("name")
	private String name;
	@JsonProperty("current")
	private Boolean current;
	@JsonProperty("title")
	private String title;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();



}