package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Slide;
import edu.northeastern.cs5200.Tables.Widget;

@Repository
public interface SlideRepository extends CrudRepository<Slide, Integer>{
	@Query("Select sl From Slide sl where sl.slide = :s")
	public Slide findByslide(@Param("s") String slide);
	
	@Query("Delete From Slide s where s.slide = :y")
	public void deleteByslide(@Param("y") String slide);
	
	@Query("Delete From Slide s where s.widget = :w")
	public void deleteBywidget(@Param("w") Widget widget);
}
