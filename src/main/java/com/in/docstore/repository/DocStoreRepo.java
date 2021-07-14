package com.in.docstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.docstore.entity.Customer;

@Repository
public interface DocStoreRepo  extends JpaRepository<Customer, Long>{

}