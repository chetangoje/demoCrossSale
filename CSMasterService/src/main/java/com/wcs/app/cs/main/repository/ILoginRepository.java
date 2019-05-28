package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.Login;

public interface ILoginRepository extends CrudRepository<Login, Long>{
	public Login findAllByUsernameAndPassword(String username, String password);
}
