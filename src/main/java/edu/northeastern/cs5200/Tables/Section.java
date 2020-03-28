package edu.northeastern.cs5200.Tables;

import javax.persistence.*;
import java.util.List;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer seatCapacity;
    private String faculty;

    @OneToMany(mappedBy = "section")
    List<EmploymentRecord> employmentRecords;

    @OneToMany(mappedBy = "section")
    List<Enroll> enrolls;

    @OneToMany(mappedBy = "section")
    List<RegistraRecord> registraRecords;

    @OneToMany(mappedBy = "section")
    List<SectionPriviledge> sectionPriviledges;

    public List<SectionPriviledge> getSectionPriviledges() {
        return sectionPriviledges;
    }

    public void setSectionPriviledges(List<SectionPriviledge> sectionPriviledges) {
        this.sectionPriviledges = sectionPriviledges;
    }

    public List<RegistraRecord> getRegistraRecords() {
        return registraRecords;
    }

    public void setRegistraRecords(List<RegistraRecord> registraRecords) {
        this.registraRecords = registraRecords;
    }

    public List<Enroll> getEnrolls() {
        return enrolls;
    }

    public void setEnrolls(List<Enroll> enrolls) {
        this.enrolls = enrolls;
    }

    public List<EmploymentRecord> getEmploymentRecords() {
        return employmentRecords;
    }

    public void setEmploymentRecords(List<EmploymentRecord> employmentRecords) {
        this.employmentRecords = employmentRecords;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(Integer seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Section() {
    }
}
