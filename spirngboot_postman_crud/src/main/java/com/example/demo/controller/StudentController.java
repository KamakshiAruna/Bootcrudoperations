package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping
	public String insertData(@RequestBody StudentDto dto) {
		return service.insertData(dto);
	}
	
	@GetMapping("{id}")
	public Optional<StudentDto> fetchbyid(@PathVariable int id) {
		return service.fetchbyid(id);
	}
	
	@GetMapping
	public List<StudentDto> fetchAll() {
		return service.fetchall();
	}
	
	@DeleteMapping("{id}")
	public String deletebyid(@PathVariable int id) {
		return service.did(id);
	}
	
	@PutMapping
	public String update(@RequestBody StudentDto dto) {
		return service.update(dto);
	}
	
	@DeleteMapping
	public String deleteAll() {
		return service.dall();
	}

}
