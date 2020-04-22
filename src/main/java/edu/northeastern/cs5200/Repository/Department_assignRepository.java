package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Department;
import edu.northeastern.cs5200.Tables.Department_assignment;
import edu.northeastern.cs5200.Tables.PersonProfile;

@Repository
public interface Department_assignRepository extends CrudRepository<Department_assignment, Integer>{
	@Query("Update Department_assignment Set personProfile = :p, departments = :d where personProfile = :pp and departments = :dd")
	public void update(@Param("p") PersonProfile personprofile, @Param("d") Department department, @Param("pp") PersonProfile personprofile1, @Param("dd") Department department1);
	
	@Query("Delete From Department_assignment da where da.personProfile = :p and da.departments = :d")
	public void deleterecord(@Param("p") PersonProfile personprofile, @Param("d") Department department);

	//@Query("Insert into Department_assignment (personProfile, departments) values (:p, :d)")
	//public Department_assignment saveByself(@Param("p") PersonProfile person, @Param("d") Department department);

	@Query("Select da from Department_assignment da where da.personProfile = :p and da.departments = :d")
	public Department_assignment findBypandd(@Param("p") PersonProfile person, @Param("d") Department department);
}
