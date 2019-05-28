package com.wcs.app.cs.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.wcs.app.cs.main.model.Invoice;

public interface IinvoiceRepositoty extends CrudRepository<Invoice,String> {

}
