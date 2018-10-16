package com.eoh.assesment.EohAssesmentGodfrey.persistance;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eoh.assesment.EohAssesmentGodfrey.entities.Invoice;

public interface InvoiceRepositor extends CrudRepository<Invoice,Long>{
	List<Invoice> findAll();
	Invoice findById(long id);
}
