package com.ojas.spring.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.spring.entity.Plans;

@Repository
public interface PlansRepository extends JpaRepository<Plans, Integer> {

}
