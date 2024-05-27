package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.dto.StudentDto;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	public String insertData(StudentDto dto) {
		return dao.inserData(dto);
	}
	
	public String deletebyid(int id) {
		return dao.deletebyid(id);
	}
	
	public List<StudentDto> fetchAll() {
		return dao.fetchAll();
	}

}
