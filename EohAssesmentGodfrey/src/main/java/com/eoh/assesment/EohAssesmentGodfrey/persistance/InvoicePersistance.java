package com.eoh.assesment.EohAssesmentGodfrey.persistance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eoh.assesment.EohAssesmentGodfrey.entities.Invoice;

public class InvoicePersistance{
	@Autowired
	InvoiceRepositor invoiceRepositor;
	
	public List<Invoice> getAllIncoices(){
		return invoiceRepositor.findAll();
	}
	
	public Invoice getInvoice(long id){
		return invoiceRepositor.findById(id);
	}

}
