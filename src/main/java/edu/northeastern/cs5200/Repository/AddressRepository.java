package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Address;
import edu.northeastern.cs5200.Tables.PersonProfile;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{
	@Modifying(clearAutomatically = true)
	@Query("Update Address Set address = :a, personProfile = :p where personProfile = :pp and address = :aa")
	public void update(@Param("a") String address, @Param("p") PersonProfile personprofile, @Param("pp") PersonProfile personprofile1, @Param("aa") String address1);

	@Query("Delete From Address ad where ad.address = :a")
	public void deleteaddress(@Param("a") String address);
	
	@Query("Select a from Address a where a.personProfile = :p and address = :a")
	public Address findBypanda(@Param("p") PersonProfile person, @Param("a") String address);
}
