package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.repository.EmployeeRepository;

@Component
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public String insert(EmployeeDto dto) {
		employeeRepository.save(dto);
		return "data inserted";
	 
	}
	
	public EmployeeDto fetchbyid(int id) {
		Optional<EmployeeDto> op=employeeRepository.findById(id);
		if(op.isPresent()) {
			EmployeeDto dto=op.get();
			return dto;
			
		}else {
			return null;
		}
	}
	
	public String deletebyid(int id) {
		Optional<EmployeeDto> op=employeeRepository.findById(id);
		if(op.isPresent()) {
			employeeRepository.deleteById(id);
			return "Data is deleted";
		}else {
			return "No data found";
		}
	}
	
	public String deleteall() {
		List<EmployeeDto> l=employeeRepository.findAll();
		if(l.isEmpty()) {
			return "no data found";
		}else {
			employeeRepository.deleteAll();
			return "Data is deleted";
		}
	}
	
	public List<EmployeeDto> fetchall() {
		List<EmployeeDto> l=employeeRepository.findAll();
		return l;
	}
	
	public String update(EmployeeDto dto) {
		int id=dto.getId();
		Optional<EmployeeDto> op=employeeRepository.findById(id);
		if(op.isPresent()) {
			employeeRepository.save(dto);
			return "data update";
		}else {
			return "no data found";
		}
	}



}
