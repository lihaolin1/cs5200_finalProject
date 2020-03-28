package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SubmissionAssignment {
    @Id
    private String submissionAssignment;

    @ManyToOne
    @JsonIgnore
    private Evaluation evaluation;

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public String getSubmissionAssignment() {
        return submissionAssignment;
    }

    public void setSubmissionAssignment(String submissionAssignment) {
        this.submissionAssignment = submissionAssignment;
    }

    public SubmissionAssignment() {
    }
}
