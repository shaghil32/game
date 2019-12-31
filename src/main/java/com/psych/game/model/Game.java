package com.psych.game.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="games")
public class Game extends Auditable{
	
	@Getter @Setter @NotNull
	private int numRounds=0;
	
	@Getter @Setter @NotNull
	private int currentRounds=0;
	
	@Getter @Setter @ManyToMany
	private Map<Player,Stats> playerStats;
	
	@ManyToMany	
	private List<Player> players;
	
	@Getter @Setter @NotNull
	private GameMode gameMode;
	
	@Getter @Setter
	private GameStatus gameStatus=GameStatus.JOINING;
	
	@ManyToOne
	private Player leader;
	
	@OneToMany(mappedBy="game")
	@Getter @Setter
	private List<Round> rounds;
	
}
