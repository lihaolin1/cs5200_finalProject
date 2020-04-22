package edu.northeastern.cs5200.Tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Department_assignment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dep_assign_id;
	
	@ManyToOne
    @JsonIgnore
    private PersonProfile personProfile;
	
	@ManyToOne
    @JsonIgnore
    private Department departments;
	
	public void setId(Integer dep_id) {
		 this.dep_assign_id = dep_id;
	}
	
	public Integer getId() {
		return dep_assign_id;
	}
	
	public void setpersonProfile(PersonProfile personProfile) {
		this.personProfile = personProfile;
	}
	public PersonProfile getpersonProfile() {
		return personProfile;
	}
	
	public void setDepartment(Department department) {
		this.departments = department;
	}
	public Department getdepartment() {
		return departments;
	}	
	
	public Department_assignment create_department_assignment(PersonProfile personProfile, Department department) {
		this.personProfile = personProfile;
		this.departments = department;
		return this;
	}
	
	public Department_assignment() {
		
	}
}
