package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.State;

public interface IStateRepository extends CrudRepository<State,Integer> {

}
