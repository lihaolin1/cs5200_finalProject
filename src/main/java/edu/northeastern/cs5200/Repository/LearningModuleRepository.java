package edu.northeastern.cs5200.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.LearningModule;

@Repository
public interface LearningModuleRepository extends CrudRepository<LearningModule, Integer>{

}
