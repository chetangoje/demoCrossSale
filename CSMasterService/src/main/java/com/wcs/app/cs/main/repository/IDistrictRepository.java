package com.wcs.app.cs.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.District;
import com.wcs.app.cs.main.model.State;

public interface IDistrictRepository extends CrudRepository<District, Integer> {

	public List<District> findByState(State state);
}
