package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.sun.xml.internal.ws.api.addressing.AddressingVersion;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
public class EmploymentRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String officeHour;
    private String type;
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "employmentRecord")
    private List<CoursePriviledge> coursePriviledge = new ArrayList<>();
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "employmentRecord")
    private List<CourseRole> courseRole = new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    private PersonProfile personProfile;
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "employmentRecord")
    private List<SectionPriviledge> sectionPriviledges = new ArrayList<>();
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "employmentRecord")
    private List<SectionRole> sectionRole = new ArrayList<>();

    @ManyToOne
    @JsonIgnore
    private Section section;

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "employmentRecord")
    private List<EnrollPriviledge> enrollPriviledges = new ArrayList<>();
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "employmentRecord")
    private List<EnrollRole> enrollRole = new ArrayList<>();

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
    public List<EnrollRole> getEnrollRole() {
        return enrollRole;
    }

    public void setEnrollRole(List<EnrollRole> enrollRole) {
        this.enrollRole = enrollRole;
    }

    public List<SectionPriviledge> getSectionPriviledges() {
        return sectionPriviledges;
    }

    public void setSectionPriviledges(List<SectionPriviledge> sectionPriviledges) {
        this.sectionPriviledges = sectionPriviledges;
    }
    public List<SectionRole> getSectionRole() {
        return sectionRole;
    }

    public void setSectionRole(List<SectionRole> sectionRole) {
        this.sectionRole = sectionRole;
    }

    public PersonProfile getPersonProfile() {
        return personProfile;
    }

    public void setPersonProfile(PersonProfile personProfile) {
        this.personProfile = personProfile;
    }

    public List<CoursePriviledge> getCoursePriviledge() {
        return coursePriviledge;
    }

    public void setCoursePriviledge(List<CoursePriviledge> coursePriviledge) {
        this.coursePriviledge = coursePriviledge;
    }
    public List<CourseRole> getCourseRole() {
        return courseRole;
    }

    public void setCourseRole(List<CourseRole> courseRole) {
        this.courseRole = courseRole;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EmploymentRecord() {
    }
}
