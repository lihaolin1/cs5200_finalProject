package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Email;
import edu.northeastern.cs5200.Tables.PersonProfile;

@Repository
public interface EmailRepository extends CrudRepository<Email, Integer>{
	@Query("Update Email Set email = :e, personProfile = :p where personProfile = :pp and email =:ee")
	public void update(@Param("e") String email, @Param("p") PersonProfile person, @Param("pp") PersonProfile person1, @Param("ee") String email1);

	@Query("Delete From Email em where em.email = :e")
	public void deleteemail(@Param("e") String email);
}
