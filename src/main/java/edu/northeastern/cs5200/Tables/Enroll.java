package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String finalGrade;
    private String letterGrade;
    private String studentFeedback;
    private String detailedGrade;

    @ManyToOne
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JsonIgnore
    private Section section;

    @OneToMany(mappedBy = "enroll")
    private List<EnrollPriviledge> enrollPriviledges;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public List<EnrollPriviledge> getEnrollPriviledges() {
        return enrollPriviledges;
    }

    public void setEnrollPriviledges(List<EnrollPriviledge> enrollPriviledges) {
        this.enrollPriviledges = enrollPriviledges;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getStudentFeedback() {
        return studentFeedback;
    }

    public void setStudentFeedback(String studentFeedback) {
        this.studentFeedback = studentFeedback;
    }

    public String getDetailedGrade() {
        return detailedGrade;
    }

    public void setDetailedGrade(String detailedGrade) {
        this.detailedGrade = detailedGrade;
    }

    public Enroll() {
    }
}
