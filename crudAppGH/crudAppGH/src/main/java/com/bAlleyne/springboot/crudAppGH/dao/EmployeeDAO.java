package com.bAlleyne.springboot.crudAppGH.dao;

import java.util.List;

import com.bAlleyne.springboot.crudAppGH.entity.Employee;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
