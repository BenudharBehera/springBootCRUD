package com.stl.coupon.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "actres")
public class ActresEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String role;
	
	@ManyToMany(mappedBy = "actress", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private ActorEntity actors;
}
