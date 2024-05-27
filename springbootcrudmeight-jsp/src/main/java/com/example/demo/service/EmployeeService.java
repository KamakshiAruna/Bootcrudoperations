package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.EmployeeDto;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	public String insert(EmployeeDto dto) {
		return employeeDao.insert(dto);
	}
	
	public EmployeeDto fetchbyid(int id) {
		return employeeDao.fetchbyid(id);
	}
	
	public String deletebyid(int id) {
		return employeeDao.deletebyid(id);
	}
	
	public String deleteall() {
		return employeeDao.deleteall();
	}
	
	public List<EmployeeDto> fetchall(){
		return employeeDao.fetchall();
	}
	
	public String update(EmployeeDto dto) {
		return employeeDao.update(dto);
	}


}
