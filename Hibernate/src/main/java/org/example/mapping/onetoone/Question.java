package org.example.mapping.onetoone;

import org.example.mapping.onetoone.Answer;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    @Column(name="question_Id")
    private int questionId;
    private String question;
    @OneToOne
    @JoinColumn(name = "a_id")
    private Answer answer;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question() {
    }

    public Question(int questionId, String question, Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }
    @Override
    public String toString() {
        return this.questionId + " : "+ this.question;
    }
}
