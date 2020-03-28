package edu.northeastern.cs5200.Tables;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    private String semester;
    private Date calendar;

    @OneToMany(mappedBy = "course")
    private List<Department> departments;

    @OneToMany(mappedBy = "course")
    private List<CoursePriviledge> coursePriviledges;

    @OneToMany(mappedBy = "course")
    private List<RegistraRecord> registraRecords;

    @OneToMany(mappedBy = "course")
    private List<LearningModule> learningModules;

    @OneToMany(mappedBy = "course")
    private List<Semester> semesters;

    public List<Semester> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<Semester> semesters) {
        this.semesters = semesters;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<CoursePriviledge> getCoursePriviledges() {
        return coursePriviledges;
    }

    public void setCoursePriviledges(List<CoursePriviledge> coursePriviledges) {
        this.coursePriviledges = coursePriviledges;
    }

    public List<RegistraRecord> getRegistraRecords() {
        return registraRecords;
    }

    public void setRegistraRecords(List<RegistraRecord> registraRecords) {
        this.registraRecords = registraRecords;
    }

    public List<LearningModule> getLearningModules() {
        return learningModules;
    }

    public void setLearningModules(List<LearningModule> learningModules) {
        this.learningModules = learningModules;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//
//    public String getSemester() {
//        return semester;
//    }
//
//    public void setSemester(String semester) {
//        this.semester = semester;
//    }

    public Date getCalendar() {
        return calendar;
    }

    public void setCalendar(Date calendar) {
        this.calendar = calendar;
    }

    public Course() {
    }
}
