package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SimpleEssayAssignment {
    @Id
    private String simpleEssayAssignment;

    @ManyToOne
    @JsonIgnore
    private Evaluation evaluation;

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public String getSimpleEssayAssignment() {
        return simpleEssayAssignment;
    }

    public void setSimpleEssayAssignment(String simpleEssayAssignment) {
        this.simpleEssayAssignment = simpleEssayAssignment;
    }

    public SimpleEssayAssignment() {
    }
}
