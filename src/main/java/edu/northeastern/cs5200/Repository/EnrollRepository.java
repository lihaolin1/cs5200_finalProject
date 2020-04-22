package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.Enroll;
import edu.northeastern.cs5200.Tables.Section;
import edu.northeastern.cs5200.Tables.Student;

import java.util.List;

@Repository
public interface EnrollRepository extends CrudRepository<Enroll, Integer>{
	@Query("SELECT c FROM Enroll c where c.id=:id")
	public Enroll findByeid(@Param("id") Integer id);
	
	@Query("Update Enroll Set finalGrade = :f, letterGrade = :l, studentFeedback = :s, detailedGrade = :d, student = :stu, section = :sec where student = :stu1 and section = :sec1")
	public void update(@Param("f") String finalGrade, @Param("l") String letterGrade, @Param("s") String studentFeedback, @Param("d") String detailedGrade, @Param("stu") Student student, @Param("sec") Section section, @Param("stu1") Student student1, @Param("sec1") Section section1);
	
	@Query("SELECT c FROM Enroll c where c.student=:s and c.section = :se")
	public Enroll findBypands(@Param("s") Student student, @Param("se") Section section);

	@Query("select e from Enroll e where e.student=:s")
	public List<Enroll> findEnrollByStudent(@Param("s") Student student);
}
