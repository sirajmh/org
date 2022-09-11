package com.organization.org.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.org.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
