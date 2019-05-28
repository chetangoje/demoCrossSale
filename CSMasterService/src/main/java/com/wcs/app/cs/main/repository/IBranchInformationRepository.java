package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.BranchInformation;
import com.wcs.app.cs.main.model.Login;

public interface IBranchInformationRepository extends CrudRepository<BranchInformation, String> {
	public BranchInformation findAllByLogin(Login login);
}
