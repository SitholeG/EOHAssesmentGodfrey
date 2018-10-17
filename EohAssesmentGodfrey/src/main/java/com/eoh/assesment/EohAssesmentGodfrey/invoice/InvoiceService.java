package com.eoh.assesment.EohAssesmentGodfrey.invoice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InvoiceService {
	@Autowired
	InvoiveRepo invoiveRepo;
	
	public void addInvoice(InvoiceEntity invoiceEntity){
		invoiveRepo.save(invoiceEntity);
		
	}
	
	public List<InvoiceEntity> getAllInvoices(){		
		return Lists.newArrayList(invoiveRepo.findAll());
	}
	public Optional<InvoiceEntity> getInvoiceById(Long id){		
		return invoiveRepo.findById(id);
	}

}
