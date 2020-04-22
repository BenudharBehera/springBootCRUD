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
	"gender",
	"age"
})
@Data
public class Demographics {

	@JsonProperty("gender")
	private String gender;
	@JsonProperty("age")
	private Age_ age;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}