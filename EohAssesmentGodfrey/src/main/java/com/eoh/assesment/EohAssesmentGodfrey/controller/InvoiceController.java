package com.eoh.assesment.EohAssesmentGodfrey.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eoh.assesment.EohAssesmentGodfrey.entities.Invoice;
import com.eoh.assesment.EohAssesmentGodfrey.persistance.InvoiceService;

@RestController
public class InvoiceController {

	@RequestMapping("/invoices")
	public List<Invoice> getAllInvoices(){
		InvoiceService invoiceService = new InvoiceService();
		
		return invoiceService.getAllIncoices();
	}
}
