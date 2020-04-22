package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.EssayQuestion;
import edu.northeastern.cs5200.Tables.Exam;

@Repository
public interface EassyQuestionRepository extends CrudRepository<EssayQuestion, Integer>{
	@Query("Select ee from EssayQuestion ee where ee.eassayQuestion = :e")
	public EssayQuestion findByquestion(@Param("e") String eassayQuestion);
	
	@Query("Delete From EssayQuestion ee where ee.eassayQuestion = :e")
	public void deleteByquestion(@Param("e") String eassayQuestion);
	
	@Query("Delete From EssayQuestion ee where ee.exam = :e")
	public void deleteByexam(@Param("e") Exam exam);
}
