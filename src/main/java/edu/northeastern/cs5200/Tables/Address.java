package edu.northeastern.cs5200.Tables;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    private String address;

    @ManyToOne
    @JsonIgnore
    private PersonProfile personProfile;

    public PersonProfile getPersonProfile() {
        return personProfile;
    }

    public void setPersonProfile(PersonProfile personProfile) {
        this.personProfile = personProfile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address() {
    }
}
