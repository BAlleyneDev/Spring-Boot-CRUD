package com.bAlleyne.springboot.crudAppGH.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bAlleyne.springboot.crudAppGH.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
