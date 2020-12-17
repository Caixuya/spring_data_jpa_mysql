package com.thxy.spring_data_jpa_mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thxy.spring_data_jpa_mysql.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
