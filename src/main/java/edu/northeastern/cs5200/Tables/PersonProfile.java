package edu.northeastern.cs5200.Tables;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PersonProfile {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(generator="customGenerationId")
    //@Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "personProfile",  cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Address> addresses = new ArrayList<>();
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "personProfile",  cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Department_assignment> departments = new ArrayList<>();
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "personProfile",  cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Email> emails = new ArrayList<>();
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "personProfile",  cascade = CascadeType.ALL)
    @JsonIgnore
    private List<EmploymentRecord> employmentRecords = new ArrayList<>();
    
    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "personProfile",  cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Phones> phones = new ArrayList<>();

    public List<Phones> getPhones() {

        return phones;
    }

    public void setPhones(List<Phones> phones) {
        this.phones = phones;
    }

    public List<EmploymentRecord> getEmploymentRecords() {
        return employmentRecords;
    }

    public void setEmploymentRecords(List<EmploymentRecord> employmentRecords) {
        this.employmentRecords = employmentRecords;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Department_assignment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department_assignment> departments) {
        this.departments = departments;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonProfile() {
    }
}
