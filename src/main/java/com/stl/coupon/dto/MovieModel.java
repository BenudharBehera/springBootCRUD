package com.stl.coupon.dto;

import java.util.List;
import lombok.Data;

@Data
public class MovieModel {

	private List<ActorModel> actorList;
	private List<ActresModel> actresList;
}
