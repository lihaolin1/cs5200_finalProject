package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.Semester;
import edu.northeastern.cs5200.Tables.Semester_assignment;

@Repository
public interface Semester_assignmentRepository extends CrudRepository<Semester_assignment, Integer>{
	@Query("Update Semester_assignment Set semester = :s, course = :c where semester = :se and course = :co")
	public void update(@Param("s") Semester se1, @Param("c") Course cou1, @Param("se") Semester se2, @Param("co") Course cou2);

	@Query("Delete from Semester_assignment sa where sa.semester = :s and sa.course = :c")
	public void deletesemester_assign(@Param("s") Semester se1, @Param("c") Course cou1);

	@Query("Select sa from Semester_assignment sa where sa.course = :c and sa.semester = :s")
	public Semester_assignment findBycands(@Param("c") Course course, @Param("s") Semester semester);
}
