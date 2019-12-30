package com.psych.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class Employee extends Auditable{
	@Getter @Setter
	@NotBlank
	private String name;
	
	@Getter @Setter
	@NotBlank
	@Email
	private String email;

	@Getter @Setter
	@NotBlank
	private String address;
	
	@Getter @Setter
	@NotBlank
	private String phoneNumber;

}
