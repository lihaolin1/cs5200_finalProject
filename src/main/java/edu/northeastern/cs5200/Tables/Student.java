package edu.northeastern.cs5200.Tables;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean finacialAid;
    private Boolean workStudy;
    private Double gpa;
    private Double scholarship;

    @OneToMany(mappedBy = "student")
    private List<Enroll> enrolls;

    public List<Enroll> getEnrolls() {
        return enrolls;
    }

    public void setEnrolls(List<Enroll> enrolls) {
        this.enrolls = enrolls;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFinacialAid() {
        return finacialAid;
    }

    public void setFinacialAid(Boolean finacialAid) {
        this.finacialAid = finacialAid;
    }

    public Boolean getWorkStudy() {
        return workStudy;
    }

    public void setWorkStudy(Boolean workStudy) {
        this.workStudy = workStudy;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Double getScholarship() {
        return scholarship;
    }

    public void setScholarship(Double scholarship) {
        this.scholarship = scholarship;
    }

    public Student() {
    }
}
