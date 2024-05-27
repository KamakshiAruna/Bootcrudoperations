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

	public String inserData(StudentDto dto) {
		repository.save(dto);
		return "Data is inserted";
	}

	public String deletebyid(int id) {
		Optional<StudentDto> dto=repository.findById(id);
		if(dto.isPresent()) {
			repository.deleteById(id);
			return "Data is deleted";
		}else {
			return "No data found";
		}
	}
	
	public List<StudentDto> fetchAll() {
		List<StudentDto> l=repository.findAll();
		if(l.isEmpty()) {
			return null;
		}else {
			return l;
		}
	}

}
