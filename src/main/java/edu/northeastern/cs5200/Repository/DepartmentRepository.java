package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{
	@Query("SELECT d FROM Department d where d.name=:st")
	public Department findByname(@Param("st") String name);
	
	@Query("Update Department Set name = :n, location = :l, dean = :d where name = :nn")
	public void update(@Param("n") String name, @Param("l") String location, @Param("d") String dean, @Param("nn") String name1); 

	@Query("Delete From Department de Where de.name = :n")
	public void deleteByname(@Param("n") String name);
}
