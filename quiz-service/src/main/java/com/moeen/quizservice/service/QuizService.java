package com.moeen.quizservice.service;

import com.moeen.quizservice.entity.Quiz;
import com.moeen.quizservice.model.QuestionWrapper;
import com.moeen.quizservice.model.Response;
import com.moeen.quizservice.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

//        List<Integer> questions = quizInterface.getQuestionsForQuiz(category, numQ).getBody();
//        Quiz quiz = new Quiz();
//        quiz.setTitle(title);
//        quiz.setQuestionIds(questions);
//        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
//        Quiz quiz = quizDao.findById(id).get();
//        List<Integer> questionIds = quiz.getQuestionIds();
//        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionIds);
//        return questions;
        List<QuestionWrapper> questionWrappers = new ArrayList<>();
        return new ResponseEntity<>(questionWrappers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
//        ResponseEntity<Integer> score = quizInterface.getScore(responses);
//        return score;
        return new ResponseEntity<>(1, HttpStatus.OK);
    }
}
