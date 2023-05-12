package com.ojas.springmvc.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.springmvc.entity.ProductEntity;

@Repository
public interface ProductRepositery extends JpaRepository<ProductEntity, Integer> {

}
