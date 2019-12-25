package com.psych.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employees")
public class Employee extends Auditable{
	@Getter @Setter
	@NotBlank
	private String name;
	
	@Getter @Setter
	@NotBlank
	@Email
	private String email;

}
