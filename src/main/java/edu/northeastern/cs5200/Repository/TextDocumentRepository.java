package edu.northeastern.cs5200.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Widget;
import edu.northeastern.cs5200.Tables.textDocument;

@Repository
public interface TextDocumentRepository extends CrudRepository<textDocument, Integer>{
	@Query("Select te from textDocument te where te.textDocument = :t")
	public textDocument findBytext(@Param("t") String textDocument);
	
	@Query("Delete From textDocument td where td.textDocument = :y")
	public void deleteBytext(@Param("y") String text);
	
	@Query("Delete From textDocument td where td.widget = :w")
	public void deleteBywidget(@Param("w") Widget widget);
}
