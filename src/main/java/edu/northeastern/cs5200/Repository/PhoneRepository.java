package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.PersonProfile;
import edu.northeastern.cs5200.Tables.Phones;

@Repository
public interface PhoneRepository extends CrudRepository<Phones, Integer>{
	@Modifying//(clearAutomatically = true)
	@Query("Update Phones pho Set pho.phone = :p, pho.personProfile = :pp where pho.personProfile = :ppf and pho.phone = :ph")
	public void update(@Param("p") String phone, @Param("pp") PersonProfile person, @Param("ppf") PersonProfile person1, @Param("ph") String phone1);

	@Query("Delete From Phones pho where pho.phone = :p")
	public void deletephone(@Param("p") String phone);

	@Query("Select pho from Phones pho where pho.personProfile = :p and pho.phone = :ph")
	public Phones findBypandp(@Param("p") PersonProfile person, @Param("ph") String phone);
}
