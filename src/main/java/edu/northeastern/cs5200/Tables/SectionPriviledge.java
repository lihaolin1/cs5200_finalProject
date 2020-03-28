package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class SectionPriviledge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String priviledgeName;

    @ManyToOne
    @JsonIgnore
    private EmploymentRecord employmentRecord;

    @ManyToOne
    @JsonIgnore
    private Section section;

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public EmploymentRecord getEmploymentRecord() {
        return employmentRecord;
    }

    public void setEmploymentRecord(EmploymentRecord employmentRecord) {
        this.employmentRecord = employmentRecord;
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

    public SectionPriviledge() {
    }
}
