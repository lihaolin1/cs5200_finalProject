package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.Section;
import edu.northeastern.cs5200.Tables.SectionPriviledge;

@Repository
public interface SectionPriviledgeRepository extends CrudRepository<SectionPriviledge, Integer>{
	@Query("Delete from SectionPriviledge sp where sp.section = :s and sp.employmentRecord = :e")
	public void deleterecord(@Param("s") Section section, @Param("e") EmploymentRecord employmentRecord);
	
	@Query("Delete from SectionPriviledge sp where sp.section = :s")
	public void deleterecordBysection(@Param("s") Section section);

}
