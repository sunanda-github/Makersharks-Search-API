package com.makershark.SearchSupplier.service;

import com.makershark.SearchSupplier.exception.NoManufacturerFoundException;
import com.makershark.SearchSupplier.model.Supplier;
import com.makershark.SearchSupplier.repo.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    public Page<Supplier> getSupplierDetails(String location, String business, String processes,int pageSize,int pageNo){
       try{

           Page<Supplier> suppliers = supplierRepo.findSupplierByCriteria(location,business,processes, PageRequest.of(pageNo,pageSize));
           if(!(suppliers.isEmpty())){
               return suppliers;
           }else{
               throw new RuntimeException("No matching data found");
           }
       }catch (IllegalArgumentException e){
           throw new NoManufacturerFoundException("Manufacturer not found");
       }

    }
}
