package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Evaluation;
import edu.northeastern.cs5200.Tables.SubmissionAssignment;

@Repository
public interface SubmissionAssignmentRepository extends CrudRepository<SubmissionAssignment, Integer>{
	@Query("Select su From SubmissionAssignment su where su.submissionAssignment = :s")
	public SubmissionAssignment findByassignment(@Param("s") String submissionAssignment);

	@Query("Delete From SubmissionAssignment sa Where sa.submissionAssignment = :s")
	public void deleteByquestion(@Param("s") String submissionAssignment);
	
	@Query("Delete From SubmissionAssignment sa Where sa.evaluation = :e")
	public void deleteByevaluation(@Param("e") Evaluation evaluation);
}
