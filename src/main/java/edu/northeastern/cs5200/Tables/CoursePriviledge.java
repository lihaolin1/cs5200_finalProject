package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class CoursePriviledge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String priviledgeName;

    @ManyToOne
    @JsonIgnore
    private Course course;

    @ManyToOne
    @JsonIgnore
    private EmploymentRecord employmentRecord;

    public EmploymentRecord getEmploymentRecord() {
        return employmentRecord;
    }

    public void setEmploymentRecord(EmploymentRecord employmentRecord) {
        this.employmentRecord = employmentRecord;
    }

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

    public String getPriviledgeName() {
        return priviledgeName;
    }

    public void setPriviledgeName(String priviledgeName) {
        this.priviledgeName = priviledgeName;
    }

    public CoursePriviledge() {
    }
}
