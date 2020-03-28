package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EssayQuestion {
    @Id
    private String eassayQuestion;

    @ManyToOne
    @JsonIgnore
    private Exam exam;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public String getEassayQuestion() {
        return eassayQuestion;
    }

    public void setEassayQuestion(String eassayQuestion) {
        this.eassayQuestion = eassayQuestion;
    }

    public EssayQuestion() {
    }
}
