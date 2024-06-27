package edu.fbansept.demo.controller;

import edu.fbansept.demo.dao.QuestionDao;
import edu.fbansept.demo.dao.ReponsePossibleDao;
import edu.fbansept.demo.model.Question;
import edu.fbansept.demo.model.ReponsePossible;
import edu.fbansept.demo.security.IsAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rep")
public class ReponsePossibleController {

    @Autowired
    ReponsePossibleDao reponsePossibleDao;

    @Autowired
    QuestionDao questionDao;

    @GetMapping
    public List<ReponsePossible> getReponsePossible() {
        return reponsePossibleDao.findAll();
    }

    @IsAdmin
    @PostMapping("/quest-post/{questionid}")
    public ResponseEntity<ReponsePossible> createReponsePossible(
            @PathVariable int questionid,
            @RequestBody ReponsePossible reponsePossible)
    {
        Optional<Question> question=questionDao.findById(questionid);
        if(question.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else
        {
            reponsePossible.setText(reponsePossible.getText());
            reponsePossible.setRepIsTrue(reponsePossible.getRepIsTrue());
            reponsePossible.setQuestion(question.get());
            reponsePossibleDao.save(reponsePossible);
        }
        return new ResponseEntity<>(reponsePossible,HttpStatus.CREATED);
    }

}
