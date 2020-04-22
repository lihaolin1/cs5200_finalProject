package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.Widget;

@Repository
public interface WidgetRepository extends CrudRepository<Widget, Integer>{
	@Query("Select w From Widget w where w.Widget_name = :e")
	public Widget findByname(@Param("e") String widget_name);
	
	@Query("Update Widget Set rubric = :r, course = :c, Widget_name = :e where Widget_name = :ex")
	public void update(@Param("r") String rubric, @Param("c") Course course, @Param("e") String widget_name, @Param("ex") String widgetname); 

	@Query("Delete From Widget w where w.Widget_name = :y")
	public void deleteByname(@Param("y") String name);
}
