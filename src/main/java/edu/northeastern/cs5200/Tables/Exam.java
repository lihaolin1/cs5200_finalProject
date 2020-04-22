package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Exam extends LearningModule{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
	private String exam_name;

	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "exam")
    private List<EssayQuestion> essayQuestions = new ArrayList<>();

	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "exam")
    private List<FillInTheBlank> fillInTheBlanks = new ArrayList<>();

//    @ManyToOne
//    @JsonIgnore
//    private LearningModule learningModule;
	@Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "exam")
    private List<MultipleChoiceQuestion> multipleChoiceQuestions = new ArrayList<>();

    public List<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
        return multipleChoiceQuestions;
    }

    public void setMultipleChoiceQuestions(List<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.multipleChoiceQuestions = multipleChoiceQuestions;
    }

//    public LearningModule getLearningModule() {
//        return learningModule;
//    }
//
//    public void setLearningModule(LearningModule learningModule) {
//        this.learningModule = learningModule;
//    }

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

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

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

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
}
