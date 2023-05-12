package com.ojas.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class EmloyeeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID" )
	private int empId;
	@Column(name = "FRISTNAME")
	private String empFristName;
	@Column(name = "LASTNAME")
	private String empLastName;
	@Column(name = "SALARY" )
	private double empSalary;
	@Column(name = "EXPERINCE")
	private int empExpericence;

}
