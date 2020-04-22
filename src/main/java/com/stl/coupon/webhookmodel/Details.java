package com.stl.coupon.webhookmodel;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"name",
	"age",
	"gender",
	"demographics",
	"emails",
	"phones",
	"profiles",
	"locations",
	"employment",
	"photos",
	"education",
	"urls",
	"interests"
})
@Data
public class Details {

	@JsonProperty("name")
	private Name name;
	@JsonProperty("age")
	private Age age;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("demographics")
	private Demographics demographics;
	@JsonProperty("emails")
	private List<Object> emails;
	@JsonProperty("phones")
	private List<Object> phones;
	@JsonProperty("profiles")
	private Profiles profiles;
	@JsonProperty("locations")
	private List<Location> locations;
	@JsonProperty("employment")
	private List<Employment> employment;
	@JsonProperty("photos")
	private List<Photo> photos;
	@JsonProperty("education")
	private List<Education> education;
	@JsonProperty("urls")
	private List<Url> urls;
	@JsonProperty("interests")
	private List<Object> interests;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}