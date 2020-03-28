package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    private String simpleEssayAssignment;
//    private String submissionAssignment;

    @ManyToOne
    @JsonIgnore
    private LearningModule learningModule;

    @OneToMany(mappedBy = "evaluation")
    private List<SimpleEssayAssignment> simpleEssayAssignment;

    @OneToMany(mappedBy = "evaluation")
    private List<SubmissionAssignment> submissionAssignments;

    public List<SubmissionAssignment> getSubmissionAssignments() {
        return submissionAssignments;
    }

    public void setSubmissionAssignments(List<SubmissionAssignment> submissionAssignments) {
        this.submissionAssignments = submissionAssignments;
    }

    public List<SimpleEssayAssignment> getSimpleEssayAssignment() {
        return simpleEssayAssignment;
    }

    public void setSimpleEssayAssignment(List<SimpleEssayAssignment> simpleEssayAssignment) {
        this.simpleEssayAssignment = simpleEssayAssignment;
    }

    public LearningModule getLearningModule() {
        return learningModule;
    }

    public void setLearningModule(LearningModule learningModule) {
        this.learningModule = learningModule;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getSimpleEssayAssignment() {
//        return simpleEssayAssignment;
//    }
//
//    public void setSimpleEssayAssignment(String simpleEssayAssignment) {
//        this.simpleEssayAssignment = simpleEssayAssignment;
//    }
//
//    public String getSubmissionAssignment() {
//        return submissionAssignment;
//    }
//
//    public void setSubmissionAssignment(String submissionAssignment) {
//        this.submissionAssignment = submissionAssignment;
//    }

    public Evaluation() {
    }
}
