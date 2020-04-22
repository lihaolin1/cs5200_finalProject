package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.CourseRole;
import edu.northeastern.cs5200.Tables.EmploymentRecord;

@Repository
public interface CourseRoleRepository extends CrudRepository<CourseRole, Integer>{
	@Query("Update CourseRole Set rolename = :r where course = :c and employmentRecord = :e")
	public void update(@Param("r") String rolename, @Param("c") Course course,@Param("e") EmploymentRecord employmentRecord);

	@Query("Delete From CourseRole cou where cou.course = :c and cou.employmentRecord = :e")
	public void deleterecord(@Param("c") Course course, @Param("e") EmploymentRecord employmentRecord);

	@Query("Delete From CourseRole cou where cou.course = :c")
	public void deleterecordBycourse(@Param("c") Course course);

	@Query("Select cr from CourseRole cr where cr.course = :c and cr.employmentRecord = :e")
	public CourseRole findBycande(@Param("c") Course course, @Param("e") EmploymentRecord employ);
}
