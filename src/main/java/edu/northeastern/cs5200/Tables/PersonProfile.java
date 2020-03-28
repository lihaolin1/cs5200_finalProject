package edu.northeastern.cs5200.Tables;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PersonProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "personProfile")
    private List<Address> addresses;

    @OneToMany(mappedBy = "personProfile")
    private List<Department> departments;

    @OneToMany(mappedBy = "personProfile")
    private List<Email> emails;

    @OneToMany(mappedBy = "personProfile")
    private List<EmploymentRecord> employmentRecords;

    @OneToMany(mappedBy = "personProfile")
    private List<Phones> phones;

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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
