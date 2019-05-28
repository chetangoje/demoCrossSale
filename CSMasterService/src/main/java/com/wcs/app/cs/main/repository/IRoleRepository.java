package com.wcs.app.cs.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.Role;

public interface IRoleRepository extends CrudRepository<Role, Integer> {

	@Query("From Role where roleName ='branchmanager'")
	public Role findByRoleName();

}
