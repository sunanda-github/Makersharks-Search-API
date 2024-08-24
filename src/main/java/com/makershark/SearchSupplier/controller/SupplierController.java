package com.makershark.SearchSupplier.controller;
import com.makershark.SearchSupplier.model.Supplier;
import com.makershark.SearchSupplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;


    @GetMapping("/query")
    public Page<Supplier> getSupplier(@RequestParam("location") String location,
                                      @RequestParam("business")String business,
                                      @RequestParam("processes")String processes,
                                      @RequestParam("pageSize") int pageSize,
                                      @RequestParam("pageNo") int pageNo
                                       ){
        return supplierService.getSupplierDetails(location,business,processes,pageNo,pageSize);

    }
}
