package edu.fbansept.demo.model;

import jakarta.persistence.*;

@Entity
public class ReponsePossible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected String text;

    protected Boolean repIsTrue;

    @ManyToOne
    private Question question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getRepIsTrue() {
        return repIsTrue;
    }

    public void setRepIsTrue(Boolean repIsTrue) {
        this.repIsTrue = repIsTrue;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
