package com.codewithme.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithme.quizapp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
    
}
