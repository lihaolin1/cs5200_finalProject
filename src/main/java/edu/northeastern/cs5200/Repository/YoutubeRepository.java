package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Widget;
import edu.northeastern.cs5200.Tables.YoutubeVideo;

@Repository
public interface YoutubeRepository extends CrudRepository<YoutubeVideo, Integer>{
	@Query("Select you from YoutubeVideo you where you.YoutubeVideo = :y")
	public YoutubeVideo findByvideo(@Param("y") String YoutubeVideo);
	
	@Query("Delete From YoutubeVideo you where you.YoutubeVideo = :y")
	public void deleteByyoutube(@Param("y") String youtube);
	
	@Query("Delete From YoutubeVideo you where you.widget = :w")
	public void deleteBywidget(@Param("w") Widget widget);
}
