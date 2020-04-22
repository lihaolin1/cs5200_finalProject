package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.Section;
import edu.northeastern.cs5200.Tables.SectionRole;

@Repository
public interface SectionRoleRepository extends CrudRepository<SectionRole, Integer>{
	@Query("Update SectionRole Set rolename = :r where section = :s and employmentRecord = :e")
	public void update(@Param("r") String rolename, @Param("s") Section section, @Param("e") EmploymentRecord employmentRecord);

	@Query("Delete From SectionRole sr where sr.section = :s and sr.employmentRecord = :e")
	public void deleterecord(@Param("s") Section section, @Param("e") EmploymentRecord employmentRecord);

	@Query("Delete From SectionRole sr where sr.section = :s")
	public void deleterecordBysection(@Param("s") Section section);

	@Query("Select sr from SectionRole sr where sr.section = :s and sr.employmentRecord = :e")
	public SectionRole findBysande(@Param("s") Section secction, @Param("e") EmploymentRecord employ);
}
