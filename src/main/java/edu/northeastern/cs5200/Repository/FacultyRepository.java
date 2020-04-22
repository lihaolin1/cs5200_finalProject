package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Faculty;

@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Integer>{
	@Query("SELECT p FROM Faculty p where p.id=:id")
	public Faculty findByfpid(@Param("id") Integer id);
	
	@Modifying(clearAutomatically = true)
	@Query("Update Faculty fa set fa.lastName = :l, fa.firstName =:f, fa.username = :u, fa.password = :p, fa.benefits = :b, fa.tenureStatus = :t, fa.parking = :pa, fa.bankAccount = :ba Where fa.id = :id")
	public void update(@Param("l") String Lastname, @Param("f") String Fristname, @Param("u") String Username, @Param("p") String Password, @Param("b") String benefits,@Param("t") Boolean tenureStatus, @Param("pa") String parking, @Param("ba") String bankAccount, @Param("id") Integer id);
}
