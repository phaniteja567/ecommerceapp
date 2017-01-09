package com.backend.dao;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.SupplierModel;

@ComponentScan
@Repository
public interface SupplierDao {
	public void addSupplier(SupplierModel supplier);

}
