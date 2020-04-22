package edu.northeastern.cs5200.Repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.Department;

@Repository
public interface courseRepository extends CrudRepository<Course, Integer>{
	@Query("SELECT c FROM Course c where c.id=:id")
	public Course findBycid(@Param("id") Integer id);
	
	@Query("SELECT c FROM Course c where c.name=:id")
	public Course findByname(@Param("id") String name);
	
	@Query("Update Course Set name = :n, description = :d, calendar = :c, department = :dd where name = :nn")
	public void update(@Param("n") String name, @Param("d") String description, @Param("c") Date calender, @Param("dd") Department department, @Param("nn") String name1);
}
