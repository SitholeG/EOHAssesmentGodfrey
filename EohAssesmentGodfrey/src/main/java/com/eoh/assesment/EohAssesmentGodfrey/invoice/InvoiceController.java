package com.eoh.assesment.EohAssesmentGodfrey.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	
	@RequestMapping("/Invoice")
	public String addInvoice(){
		invoiceService.addInvoice();
		return "Done";
	}
}
