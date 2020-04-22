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
	"given",
	"family",
	"full"
})
@Data
public class Name {

	@JsonProperty("given")
	private String given;
	@JsonProperty("family")
	private String family;
	@JsonProperty("full")
	private String full;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}