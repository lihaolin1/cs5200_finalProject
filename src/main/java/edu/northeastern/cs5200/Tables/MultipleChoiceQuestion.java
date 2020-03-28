package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MultipleChoiceQuestion {
    @Id
    private String multipleChoiceQuestion;

    @ManyToOne
    @JsonIgnore
    private Exam exam;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public String getMultipleChoiceQuestion() {
        return multipleChoiceQuestion;
    }

    public void setMultipleChoiceQuestion(String multipleChoiceQuestion) {
        this.multipleChoiceQuestion = multipleChoiceQuestion;
    }

    public MultipleChoiceQuestion() {
    }
}
