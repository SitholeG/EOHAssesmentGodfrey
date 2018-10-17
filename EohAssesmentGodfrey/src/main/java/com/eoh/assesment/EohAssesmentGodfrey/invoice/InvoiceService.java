package com.eoh.assesment.EohAssesmentGodfrey.invoice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InvoiceService {
	@Autowired
	InvoiveRepo invoiveRepo;
	
	public void addInvoice(){
		InvoiceEntiti invoice = new InvoiceEntiti();
		invoice.setClient("Test1");
		invoice.setInvoiceDate(new Date());
		invoice.setVatRate(14L);
		invoiveRepo.save(invoice);
		
	}

}
