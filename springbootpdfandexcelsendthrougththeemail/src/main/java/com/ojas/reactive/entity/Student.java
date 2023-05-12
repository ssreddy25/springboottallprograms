package com.ojas.reactive.entity;




import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@ToString
public class Student {
	
	
	private int id;
	private String name;
	private String lastName;
	private int marks;
	private String coures;
	private String status;
	

}
