package com.eoh.assesment.EohAssesmentGodfrey.invoice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	
	@RequestMapping(value = "/invoice",  method = RequestMethod.POST)
	public String addInvoice(@ModelAttribute InvoiceEntity invoiceEntity){
		invoiceService.addInvoice(invoiceEntity);
		return "Done";
	}
	
	@RequestMapping(value = "/invoices",  method = RequestMethod.GET)
	public List<InvoiceEntity> getAllInvoices(){
		return invoiceService.getAllInvoices();
	}
	
	@RequestMapping(value = "/Invoice/{id}",  method = RequestMethod.GET)
	public Optional<InvoiceEntity> getInvoice(@PathVariable(value = "id") Long id){
		return invoiceService.getInvoiceById(id);
	}
}
