package com.codewithme.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithme.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
    
}
