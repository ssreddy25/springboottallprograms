package com.ojas.spring.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.spring.entity.PlansHistroy;

@Repository
public interface PlansHistoryRepository extends JpaRepository<PlansHistroy,Integer> {

}
