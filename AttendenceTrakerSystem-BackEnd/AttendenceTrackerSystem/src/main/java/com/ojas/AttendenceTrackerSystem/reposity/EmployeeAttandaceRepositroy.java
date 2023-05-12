package com.ojas.AttendenceTrackerSystem.reposity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ojas.AttendenceTrackerSystem.model.EmployeeAttadance;

@Repository
public interface EmployeeAttandaceRepositroy extends JpaRepository<EmployeeAttadance, Integer> {
	
	

}
@Query(value = "from EmployeeAttadance where empName=:empName and date between :date1 and :date2  ")
   List<EmployeeAttadance> getByNameAndDate(@Param("empName") String empName , @Param("date1") String date1 ,@Param("date2") String date2);