package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.Exam;

@Repository
public interface ExamRepository extends CrudRepository<Exam, Integer>{
	@Query("Select ee From Exam ee where ee.exam_name = :e")
	public Exam findByname(@Param("e") String exam_name);

	@Query("Update Exam Set rubric = :r, course = :c, exam_name = :e where exam_name = :ex")
	public void update(@Param("r") String rubric, @Param("c") Course course, @Param("e") String exam_name, @Param("ex") String examname); 

	@Query("Delete From Exam ex where ex.exam_name = :e")
	public Exam deleteByname(@Param("e") String exam_name);
}
