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
	"degree",
	"end"
})
@Data
public class Education {

	@JsonProperty("name")
	private String name;
	@JsonProperty("degree")
	private String degree;
	@JsonProperty("end")
	private End end;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}