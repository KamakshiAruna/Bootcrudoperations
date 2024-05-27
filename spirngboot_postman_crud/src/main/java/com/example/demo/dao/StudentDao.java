package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.StudentDto;
import com.example.demo.repository.StudentRepository;

@Component
public class StudentDao {
	@Autowired
	StudentRepository repository;
	
	public String insertData(StudentDto dto) {
		repository.save(dto);
		return "data inserted";
	}
	
	public Optional<StudentDto> fetchbyid(int id) {
		Optional<StudentDto> dto=repository.findById(id);
		return dto;
	}
	
	public List<StudentDto> fetchall() {
		List<StudentDto> l=repository.findAll();
		return l;
	}
	
	public String did(int id) {
		Optional<StudentDto> l=repository.findById(id);
		if(l.isPresent()) {
			repository.deleteById(id);
			return "Data deleted";
		}else {
			return "No data found";
		}
	}
	
	public String update(StudentDto dto) {
		int id=dto.getId();
		Optional<StudentDto> op=repository.findById(id);
		if(op.isPresent()) {
			repository.save(dto);
			return "Data updated";
		}else {
			return "No data found";
		}
	}
	
	public String dall() {
		List<StudentDto> l=repository.findAll();
		if(l.isEmpty()) {
			return "No data found";
		}else {
			repository.deleteAll();
			return "data deleted";
		}
	}

}
