package com.ojas.springmvc.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.springmvc.entity.EmloyeeEntity;

@Repository
public interface EmployeeRepositery  extends JpaRepository<EmloyeeEntity, Integer>{

}
