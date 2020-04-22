package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.Enroll;
import edu.northeastern.cs5200.Tables.EnrollPriviledge;

@Repository
public interface EnrollPriviledgeRepository extends CrudRepository<EnrollPriviledge, Integer>{
	@Query("Delete from EnrollPriviledge ep where ep.enroll = :e and ep.employmentRecord = :em")
	public void deleterecord(@Param("e") Enroll enroll, @Param("em") EmploymentRecord employmentRecord);

	@Query("Delete from EnrollPriviledge ep where ep.enroll = :e")
	public void deleterecordByenroll(@Param("e") Enroll enroll);

}
