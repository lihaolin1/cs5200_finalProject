package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class LearningModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rubric;

    @ManyToOne
    @JsonIgnore
    private Course course;

//    @OneToMany(mappedBy = "learningModule")
//    private List<Evaluation> evaluations;
//
//    @OneToMany(mappedBy = "learningModule")
//    private List<Exam> exams;
//
//    @OneToMany(mappedBy = "learningModule")
//    private List<Widget> widgets;

//    public List<Exam> getExams() {
//        return exams;
//    }
//
//    public void setExams(List<Exam> exams) {
//        this.exams = exams;
//    }
//
//    public List<Widget> getWidgets() {
//        return widgets;
//    }
//
//    public void setWidgets(List<Widget> widgets) {
//        this.widgets = widgets;
//    }
//
//    public List<Evaluation> getEvaluations() {
//        return evaluations;
//    }
//
//    public void setEvaluations(List<Evaluation> evaluations) {
//        this.evaluations = evaluations;
//    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRubric() {
        return rubric;
    }

    public void setRubric(String rubric) {
        this.rubric = rubric;
    }

    public LearningModule() {
    }
}
