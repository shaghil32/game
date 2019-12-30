package com.psych.game.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="questions")
public class Question extends Auditable {

	@Getter @Setter @NotBlank
	private String questionText;
	
	@Getter @Setter @NotBlank
	private String correctAnswer;
	
	@Getter @Setter @NotNull
	private GameMode gameMode;
	
	@Getter @Setter	@OneToMany(mappedBy="question")
	private List<EllenAnswer> ellenAnswers;
	
}
