package edu.northeastern.cs5200.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.northeastern.cs5200.Tables.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
