package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.Evaluation;

@Repository
public interface EvaluationRepository extends CrudRepository<Evaluation, Integer>{
	@Query("Select ee From Evaluation ee where ee.evaluation_name = :e")
	public Evaluation findByname(@Param("e") String evaluation_name);
	
	@Query("Update Evaluation Set rubric = :r, course = :c, evaluation_name = :e where evaluation_name = :ev")
	public void update(@Param("r") String rubric, @Param("c") Course course, @Param("e") String eva_name, @Param("ev") String evaname); 

	@Query("Delete From Evaluation ev where ev.evaluation_name = :e")
	public void deleteByname(@Param("e") String evaluation_name);
}
