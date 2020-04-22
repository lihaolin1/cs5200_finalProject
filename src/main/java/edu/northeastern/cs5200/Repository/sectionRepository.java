package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Section;

@Repository
public interface sectionRepository extends CrudRepository<Section, Integer>{
	@Query("SELECT s FROM Section s where s.title=:st")
	public Section findBytitle(@Param("st") String title);
	
	@Modifying(clearAutomatically=true)
	@Query("Update Section ss Set ss.seatCapacity = :s where ss.title = :t")
	public void updateseat(@Param("s") Integer seatCapacity, @Param("t") String title);
	
	@Query("Update Section se Set se.title = :t, se.seatCapacity = :s, se.faculty = :f where se.title = :tt")
	public void update(@Param("t") String title, @Param("s") Integer seats, @Param("f") String faculty, @Param("tt") String title1);
}
