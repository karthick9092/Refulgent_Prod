package com.refulgent.core.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refulgent.entity.sample.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
