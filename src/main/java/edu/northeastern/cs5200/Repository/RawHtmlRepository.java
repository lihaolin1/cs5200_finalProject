package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.RawHtml;
import edu.northeastern.cs5200.Tables.Widget;

@Repository
public interface RawHtmlRepository extends CrudRepository<RawHtml, Integer>{
	@Query("Select ra from RawHtml ra where ra.rawHtml = :r")
	public RawHtml findByhtml(@Param("r") String rawHtml);
	
	@Query("Delete From RawHtml rh where rh.rawHtml = :y")
	public void deleteByhtml(@Param("y") String rawhtml);
	
	@Query("Delete From RawHtml rh where rh.widget = :w")
	public void deleteBywidget(@Param("w") Widget widget);
}
