package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    private String essayQuestion;
//    private String multipleChoiceQuestion;
//    private String fillInTheBlank;

    @OneToMany(mappedBy = "exam")
    private List<EssayQuestion> essayQuestions;

    @OneToMany(mappedBy = "exam")
    private List<FillInTheBlank> fillInTheBlanks;

    @ManyToOne
    @JsonIgnore
    private LearningModule learningModule;

    @OneToMany(mappedBy = "exam")
    private List<MultipleChoiceQuestion> multipleChoiceQuestions;

    public List<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
        return multipleChoiceQuestions;
    }

    public void setMultipleChoiceQuestions(List<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.multipleChoiceQuestions = multipleChoiceQuestions;
    }

    public LearningModule getLearningModule() {
        return learningModule;
    }

    public void setLearningModule(LearningModule learningModule) {
        this.learningModule = learningModule;
    }

    public List<FillInTheBlank> getFillInTheBlanks() {
        return fillInTheBlanks;
    }

    public void setFillInTheBlanks(List<FillInTheBlank> fillInTheBlanks) {
        this.fillInTheBlanks = fillInTheBlanks;
    }

    public List<EssayQuestion> getEssayQuestions() {
        return essayQuestions;
    }

    public void setEssayQuestions(List<EssayQuestion> essayQuestions) {
        this.essayQuestions = essayQuestions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getEssayQuestion() {
//        return essayQuestion;
//    }
//
//    public void setEssayQuestion(String essayQuestion) {
//        this.essayQuestion = essayQuestion;
//    }
//
//    public String getMultipleChoiceQuestion() {
//        return multipleChoiceQuestion;
//    }
//
//    public void setMultipleChoiceQuestion(String multipleChoiceQuestion) {
//        this.multipleChoiceQuestion = multipleChoiceQuestion;
//    }
//
//    public String getFillInTheBlank() {
//        return fillInTheBlank;
//    }
//
//    public void setFillInTheBlank(String fillInTheBlank) {
//        this.fillInTheBlank = fillInTheBlank;
//    }

    public Exam() {
    }
}
