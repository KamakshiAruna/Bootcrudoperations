package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.StudentDao;
import com.example.demo.dto.StudentDto;

@Component
public class StudentService {
	@Autowired
	StudentDao dao;
	
	public String insertData(StudentDto dto) {
		return dao.insertData(dto);
	}
	
	public Optional<StudentDto> fetchbyid(int id) {
		return dao.fetchbyid(id);
	}
	
	public List<StudentDto> fetchall(){ 
	    return dao.fetchall();
	}
	
	public String did(int id) {
		return dao.did(id);
	}
	
	public String update(StudentDto dto) {
		return dao.update(dto);
	}
	public String dall() {
		return dao.dall();
	}

}
