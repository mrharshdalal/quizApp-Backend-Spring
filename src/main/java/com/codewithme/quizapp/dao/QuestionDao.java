package com.codewithme.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithme.quizapp.model.Question;
import java.util.List;


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
    
    List<Question> findByCategory(String category);
}
