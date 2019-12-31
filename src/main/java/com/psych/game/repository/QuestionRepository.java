package com.psych.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psych.game.model.Question;


public interface QuestionRepository extends JpaRepository<Question, Long>{

}
