package com.psych.game.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="players")
public class Player extends Auditable{
	
	@NotBlank
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
