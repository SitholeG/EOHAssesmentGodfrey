package com.eoh.assesment.EohAssesmentGodfrey.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eoh.assesment.EohAssesmentGodfrey.entities.Invoice;

@RestController
public class InvoiceController {

	@RequestMapping("/hello")
	public List<Invoice> getInvoices(){
		return null;
	}
}
