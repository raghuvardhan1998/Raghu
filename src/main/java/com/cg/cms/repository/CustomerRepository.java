package com.cg.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cms.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}