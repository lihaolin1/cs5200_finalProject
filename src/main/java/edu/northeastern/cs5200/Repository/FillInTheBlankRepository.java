package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Exam;
import edu.northeastern.cs5200.Tables.FillInTheBlank;

@Repository
public interface FillInTheBlankRepository extends CrudRepository<FillInTheBlank, Integer>{
	@Query("Select fi From FillInTheBlank fi where fi.fillInTheBlank = :f")
	public FillInTheBlank findByquestion(@Param("f") String fillInTheBlank);
	
	@Query("Delete From FillInTheBlank fb where fb.fillInTheBlank = :f")
	public void deleteByquestion(@Param("f") String fillInTheBlank);
	
	@Query("Delete From FillInTheBlank fb where fb.exam = :e")
	public void deleteByexam(@Param("e") Exam exam);
}
