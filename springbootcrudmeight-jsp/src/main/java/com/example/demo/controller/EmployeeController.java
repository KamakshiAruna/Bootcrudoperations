package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping("/insertjsp")
	public String insertjsp() {
		return "insert.jsp";
	}

	@PostMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute EmployeeDto dto) {
		return service.insert(dto);
	}

	@GetMapping("/fid")
	public ModelAndView fetchbyid(@RequestParam int id) {
		EmployeeDto dto = service.fetchbyid(id);
		ModelAndView view = new ModelAndView("fid.jsp");
		view.addObject("obj", dto);
		return view;

	}

	@GetMapping("/did")
	@ResponseBody
	public String deletebyid(@RequestParam int id) {
		return service.deletebyid(id);
	}
	
	@GetMapping("/dall")
	@ResponseBody
	public String deleteAll() {
		return service.deleteall();
	}
	
	@GetMapping("/fall")
	public ModelAndView fetchAll() {
		List<EmployeeDto> l=service.fetchall();
		ModelAndView view=new ModelAndView("fall.jsp");
		view.addObject("obj", l);
		return view;
	}
	
	@GetMapping("/update")
	@ResponseBody
	public String update(EmployeeDto dto) {
		return service.update(dto);
	}

}
