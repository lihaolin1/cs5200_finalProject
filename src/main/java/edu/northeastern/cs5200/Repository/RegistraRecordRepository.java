package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.RegistraRecord;
import edu.northeastern.cs5200.Tables.Section;

@Repository
public interface RegistraRecordRepository extends CrudRepository<RegistraRecord, Integer>{
	@Query("Update RegistraRecord Set CRN = :c, course = :cc, section = :s where course = :ccc and section = :ss")
	public void update(@Param("c") Integer Crn, @Param("cc") Course course, @Param("s") Section section, @Param("ccc") Course course1, @Param("ss") Section section1);

	@Query("Delete From RegistraRecord rr where rr.course = :c and rr.section = :s")
	public void deleterecord(@Param("c") Course course, @Param("s") Section section);

	@Query("Delete From RegistraRecord rr where rr.course = :c")
	public void deleterecordBycourse(@Param("c") Course course);

	@Query("Delete From RegistraRecord rr where rr.section = :s")
	public void deleterecordBysection(@Param("s") Section section);

	
	@Query("Select r from RegistraRecord r where r.course = :c and r.section = :s")
	public RegistraRecord findBycands(@Param("c") Course course, @Param("s") Section section);
}
