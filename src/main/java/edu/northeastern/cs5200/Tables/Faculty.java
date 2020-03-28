package edu.northeastern.cs5200.Tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty extends PersonProfile{
    private String benefits;
    private Boolean tenureStatus;
    private String parking;
    private String bankAccount;

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public Boolean getTenureStatus() {
        return tenureStatus;
    }

    public void setTenureStatus(Boolean tenureStatus) {
        this.tenureStatus = tenureStatus;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Faculty() {
    }
}
