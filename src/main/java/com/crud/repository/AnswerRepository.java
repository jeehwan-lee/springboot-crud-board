package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
