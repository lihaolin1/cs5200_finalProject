package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FillInTheBlank {
    @Id
    private String fillInTheBlank;

    @ManyToOne
    @JsonIgnore
    private Exam exam;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public String getFillInTheBlank() {
        return fillInTheBlank;
    }

    public void setFillInTheBlank(String fillInTheBlank) {
        this.fillInTheBlank = fillInTheBlank;
    }

    public FillInTheBlank() {
    }
}
