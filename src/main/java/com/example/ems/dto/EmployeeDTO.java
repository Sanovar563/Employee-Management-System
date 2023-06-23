package com.example.ems.dto;

import java.math.BigDecimal;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

	
	    private int id;
	    private String name;
	    private String email;
	    private String password;
	    private BigDecimal salary;
	    private int leaveDays;
	    private Date joinDate;
	    private String department;
	    private String position;

	  

	  
	}

