package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeRepository extends JpaRepository<EmployeeDto, Integer> {

}
