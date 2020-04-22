package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Evaluation;
import edu.northeastern.cs5200.Tables.SimpleEssayAssignment;

@Repository
public interface SimpleEssayAssignmentRepository extends CrudRepository<SimpleEssayAssignment, Integer>{
	@Query("Select si From SimpleEssayAssignment si where si.simpleEssayAssignment = :s")
	public SimpleEssayAssignment findByassignment(@Param("s") String simpleEssayAssignment);

	@Query("Delete From SimpleEssayAssignment se Where se.simpleEssayAssignment = :s")
	public void deleteByquestion(@Param("s") String simpleEssayAssignment);
	
	@Query("Delete From SimpleEssayAssignment se Where se.evaluation = :e")
	public void deleteByevaluation(@Param("e") Evaluation evaluation);
}
