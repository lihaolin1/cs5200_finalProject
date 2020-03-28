package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.xml.internal.ws.api.addressing.AddressingVersion;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmploymentRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String officeHour;
    private String type;

    @OneToMany(mappedBy = "employmentRecord")
    private List<CoursePriviledge> coursePriviledge;

    @ManyToOne
    @JsonIgnore
    private PersonProfile personProfile;

    @OneToMany(mappedBy = "employmentRecord")
    private List<SectionPriviledge> sectionPriviledges;

    @ManyToOne
    @JsonIgnore
    private Section section;

    @OneToMany(mappedBy = "employmentRecord")
    private List<EnrollPriviledge> enrollPriviledges;

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

    public List<SectionPriviledge> getSectionPriviledges() {
        return sectionPriviledges;
    }

    public void setSectionPriviledges(List<SectionPriviledge> sectionPriviledges) {
        this.sectionPriviledges = sectionPriviledges;
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
