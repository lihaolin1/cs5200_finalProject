package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phones {
    @Id
    private String phone;

    @ManyToOne
    @JsonIgnore
    private PersonProfile personProfile;

    public PersonProfile getPersonProfile() {
        return personProfile;
    }

    public void setPersonProfile(PersonProfile personProfile) {
        this.personProfile = personProfile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Phones() {
    }
}
