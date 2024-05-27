package Spring_mvc_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Spring_mvc_crud.dao.EmployeeDao;
import Spring_mvc_crud.dto.EmployeeDto;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute EmployeeDto employeeDto) {
		//System.out.println(employeeDto);
		employeeDao.insertData(employeeDto);
		return "Data inserted Successfully";
	}
	
//	fetchbyid
	
	@RequestMapping("/fid")
	public ModelAndView fetchById(@RequestParam int id) {
	   EmployeeDto dt=employeeDao.fetchById(id);
	   ModelAndView view=new ModelAndView("fid.jsp");
	   view.addObject("data", dt);
	   return view;
  		
	}
	
//	fetchAll
	@RequestMapping("/fall")
	public ModelAndView fetchAll() {
		List<EmployeeDto> dto= employeeDao.fetchAll();
		ModelAndView view=new ModelAndView("fetchall.jsp");
		view.addObject("data", dto);
		return view;
	}

//	deletebyid
	@ResponseBody
	@RequestMapping("/deletebyid")
	public String delete(@RequestParam int id) {
		//System.out.println(id);
		String msg=employeeDao.deletebyid(id);
		return msg;
	}

//	deleteAll
	@ResponseBody
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		String msg=employeeDao.deleteAll();
		return msg;
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(EmployeeDto dto) {
		String msg=employeeDao.update(dto);
		return msg;
	}


}
