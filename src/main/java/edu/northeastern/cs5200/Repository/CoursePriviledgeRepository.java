package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.CoursePriviledge;
import edu.northeastern.cs5200.Tables.EmploymentRecord;

@Repository
public interface CoursePriviledgeRepository extends CrudRepository<CoursePriviledge, Integer>{
	@Query("Delete from CoursePriviledge where course = :c and employmentRecord = :e")
	public void deleterecord(@Param("c") Course course, @Param("e") EmploymentRecord EmployR);

	@Query("Delete from CoursePriviledge cp where cp.course = :c")
	public void deleterecordBycourse(@Param("c") Course course);

}
