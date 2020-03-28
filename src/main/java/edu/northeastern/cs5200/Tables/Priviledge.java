package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Priviledge {
    @Id
    private String priviledgeName;

//    @ManyToOne
//    @JsonIgnore
//    private EnrollPriviledge enrollPriviledge;
//
//    @ManyToOne
//    @JsonIgnore
//    private SectionPriviledge sectionPriviledge;
//
//    @ManyToOne
//    @JsonIgnore
//    private CoursePriviledge coursePriviledge;
//
//    public CoursePriviledge getCoursePriviledge() {
//        return coursePriviledge;
//    }
//
//    public void setCoursePriviledge(CoursePriviledge coursePriviledge) {
//        this.coursePriviledge = coursePriviledge;
//    }
//
//    public SectionPriviledge getSectionPriviledge() {
//        return sectionPriviledge;
//    }
//
//    public void setSectionPriviledge(SectionPriviledge sectionPriviledge) {
//        this.sectionPriviledge = sectionPriviledge;
//    }
//
//    public EnrollPriviledge getEnrollPriviledge() {
//        return enrollPriviledge;
//    }
//
//    public void setEnrollPriviledge(EnrollPriviledge enrollPriviledge) {
//        this.enrollPriviledge = enrollPriviledge;
//    }

    public String getPriviledgeName() {
        return priviledgeName;
    }

    public void setPriviledgeName(String priviledgeName) {
        this.priviledgeName = priviledgeName;
    }

    public Priviledge() {
    }
}
