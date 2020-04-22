package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.Semester;

@Repository
public interface SemesterRepository extends CrudRepository<Semester, Integer>{
	@Query("Update Semester Set semester = :s where semester = :ss")
	public void update(@Param("s") String semester, @Param("ss") String sem);

	@Query("Delete From Semester se where se.semester = :s")
	public void deleteByname(@Param("s") String semester);

	@Query("Select s From Semester s where s.semester = :se")
	public Semester findByname(@Param("se") String semester);
}
