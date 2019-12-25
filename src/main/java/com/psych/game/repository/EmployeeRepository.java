package com.psych.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psych.game.model.Player;

public interface EmployeeRepository extends JpaRepository<Player, Long>{

}
