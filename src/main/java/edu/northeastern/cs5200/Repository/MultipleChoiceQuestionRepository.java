package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Exam;
import edu.northeastern.cs5200.Tables.MultipleChoiceQuestion;

@Repository
public interface MultipleChoiceQuestionRepository extends CrudRepository<MultipleChoiceQuestion, Integer>{
	@Query("Select mu From MultipleChoiceQuestion mu where mu.multipleChoiceQuestion = :m")
	public MultipleChoiceQuestion findByquestion(@Param("m") String multipleChoiceQuestion);

	@Query("Delete From MultipleChoiceQuestion mc where mc.multipleChoiceQuestion = :m")
	public void deleteByquestion(@Param("m") String multipleChoiceQuestion);
	
	@Query("Delete From MultipleChoiceQuestion mc where mc.exam = :e")
	public void deleteByexam(@Param("e") Exam exam);
}
