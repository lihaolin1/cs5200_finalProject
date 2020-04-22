package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Evaluation extends LearningModule{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;

//    @ManyToOne
//    @JsonIgnore
//    private LearningModule learningModule;
	private String evaluation_name;
	
	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "evaluation")
    private List<SimpleEssayAssignment> simpleEssayAssignment = new ArrayList<>();

	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "evaluation")
    private List<SubmissionAssignment> submissionAssignments = new ArrayList<>();

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

//    public LearningModule getLearningModule() {
//        return learningModule;
//    }
//
//    public void setLearningModule(LearningModule learningModule) {
//        this.learningModule = learningModule;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

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

	public String getEvaluation_name() {
		return evaluation_name;
	}

	public void setEvaluation_name(String evaluation_name) {
		this.evaluation_name = evaluation_name;
	}
}
