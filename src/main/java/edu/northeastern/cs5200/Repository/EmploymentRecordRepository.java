package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.PersonProfile;
import edu.northeastern.cs5200.Tables.Section;

@Repository
public interface EmploymentRecordRepository extends CrudRepository<EmploymentRecord, Integer>{
	@Query("SELECT c FROM EmploymentRecord c where c.id=:id")
	public EmploymentRecord findByeid(@Param("id") Integer id);
	
	@Query("Update EmploymentRecord Set officeHour = :o, type = :t, personProfile = :p, section = :s where personProfile = :pp and section = :ss")
	public void update(@Param("o") String officeHour, @Param("t") String type, @Param("p") PersonProfile personProfile, @Param("s") Section section, @Param("pp") PersonProfile person_Profile, @Param("ss") Section Section);

	@Query("Select e From EmploymentRecord e where e.personProfile = :p and e.section = :s")
	public EmploymentRecord findrecord(@Param("p") PersonProfile personprofile, @Param("s") Section section);

	@Query("SELECT c FROM EmploymentRecord c where c.personProfile=:p and c.section = :s")
	public EmploymentRecord findBypands(@Param("p") PersonProfile person, @Param("s") Section section);
}
