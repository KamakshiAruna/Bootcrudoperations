package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.StudentDto;

import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/insertHtml")
	public String insertHtml() {
		return "insert.html";
	}

	@PostMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute StudentDto dto) {
		return service.insertData(dto);
	}
	
	@RequestMapping("/did")
	@ResponseBody
	public String deletebyid(@RequestParam int id) {
		return service.deletebyid(id);
	}
	
	
	@GetMapping("/fall")
	public String fetchAll(ModelMap map) {
		 List<StudentDto> l=service.fetchAll();
		 map.put("obj", l);
		 return "fetchall.html";
		 
	}

}
