package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	@Query("SELECT s FROM Student s where s.id=:id")
	public Student findBysid(@Param("id") Integer id);
	@Query("Update Student stu set stu.lastName = :l, stu.firstName =:f, stu.username = :u, stu.password = :p, stu.Status = :s, stu.finacialAid = :fi, stu.workStudy = :w, stu.gpa = :g, stu.scholarship = :sch Where stu.id = :id")
	public void update(@Param("l") String Lastname, @Param("f") String Fristname, 
			@Param("u") String Username, @Param("p") String Password, @Param("s") Integer Status,
			@Param("fi") Boolean finacialAid, @Param("w") Boolean workStudy, @Param("g") Double gpa, 
			@Param("sch") Double scholarship, @Param("id") Integer id);
}
