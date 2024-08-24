package com.makershark.SearchSupplier.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplier_id;
    private String company_name;
    private String website;
    private String location;


    private String business;


    private String processes;


}
