package edu.northeastern.cs5200.Tables;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
//    private String semester;
    private Date calendar;

    @ManyToOne
    private Department department;
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    @JsonIgnore
    private List<CoursePriviledge> coursePriviledges= new ArrayList<>();

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    @JsonIgnore
    private List<CourseRole> courseRole= new ArrayList<>();
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    @JsonIgnore
    private List<RegistraRecord> registraRecords= new ArrayList<>();
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    @JsonIgnore
    private List<LearningModule> learningModules= new ArrayList<>();
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    @JsonIgnore
    private List<Semester_assignment> semesters= new ArrayList<>();

    public List<Semester_assignment> getSemesters() {
        return semesters;
    }

    public void setSemesters(List<Semester_assignment> semesters) {
        this.semesters = semesters;
    }

    public Department getDepartments() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<CoursePriviledge> getCoursePriviledges() {
        return coursePriviledges;
    }
    
    public List<CourseRole> getCourseRole() {
        return courseRole;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
