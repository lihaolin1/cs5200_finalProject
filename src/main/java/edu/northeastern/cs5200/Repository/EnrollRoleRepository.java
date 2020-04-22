package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.Enroll;
import edu.northeastern.cs5200.Tables.EnrollRole;

@Repository
public interface EnrollRoleRepository extends CrudRepository<EnrollRole, Integer>{
	@Query("Update EnrollRole Set rolename = :r where enroll = :e and employmentRecord = :em")
	public void update(@Param("r") String rolename, @Param("e") Enroll enroll, @Param("em") EmploymentRecord employmentRecord);

	@Query("Delete From EnrollRole er where er.enroll = :e and er.employmentRecord = :e")
	public void deleterecord(@Param("e") Enroll enroll, @Param("e") EmploymentRecord employmentRecord);

	@Query("Delete From EnrollRole er where er.enroll = :e")
	public void deleterecordByenroll(@Param("e") Enroll enroll);

	@Query("Select er from EnrollRole er where er.enroll = e and er.employmentRecord = em")
	public EnrollRole findBypands(@Param("e") Enroll enroll, @Param("em") EmploymentRecord employ);
}
