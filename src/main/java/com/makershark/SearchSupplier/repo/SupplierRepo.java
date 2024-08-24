package com.makershark.SearchSupplier.repo;


import com.makershark.SearchSupplier.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier,Long>, PagingAndSortingRepository<Supplier,Long> {

    @Query("SELECT s FROM Supplier s where s.location = :location AND s.business = :business AND s.processes =:processes")
    public Page<Supplier> findSupplierByCriteria(@Param("location") String location,
                                                 @Param("business") String business,
                                                 @Param("processes") String processes, PageRequest pageRequest);
}
