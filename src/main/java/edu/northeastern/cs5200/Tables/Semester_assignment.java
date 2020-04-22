package edu.northeastern.cs5200.Tables;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Semester_assignment {
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 	
	    @ManyToOne
	    @JsonIgnore
	    private Course course;
	    
	    @ManyToOne
	    @JsonIgnore
	    private Semester semester;
	    
	    public Course getCourse() {
	        return course;
	    }

	    public void setCourse(Course course) {
	        this.course = course;
	    }
	    public Semester getSemester() {
	        return semester;
	    }

	    public void setSemester(Semester semester) {
	        this.semester = semester;
	    }
}
