package com.numetry.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.numetry.model.Student;
import com.numetry.service.IStudentMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentOperationController {
	@Autowired
	private IStudentMgmtService service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/report")
	public String showEmployeeReport(Map<String, Object> map, Student stud) {
		List<Student> list = service.getAllStudent();
		map.put("List", list);
		return "student_report";
	}
	
	@GetMapping("/register")
	public String registerStudent(@ModelAttribute("stud") Student stud) {
		stud.setSchoolName("St.Xavier Convent School");
		return "addStudent";
	}
	
	
	@PostMapping("/register")
	public String addStudent(HttpSession ses,@ModelAttribute("stud") Student stud) {
		String result=service.addStudent(stud);
		ses.setAttribute("resultMsg",result);
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("rollNo")int rollNo,RedirectAttributes attr) {
		String msg=service.deleteStudent(rollNo);
		attr.addFlashAttribute("resultMsg", msg);
		return "redirect:report";
	}
	
	@GetMapping("/edit")
	public String showEmployeeEditForm(@RequestParam("rollNo")int rollNo,@ModelAttribute("stud") Student stud) {
		Student stud1=service.getStudentByRollNo(rollNo);
		//stud=stud1;
		BeanUtils.copyProperties(stud1, stud);
		return "student_edit";
	}
	
	@PostMapping("/edit")
	public String editEmployee(@ModelAttribute("stud")Student stud,RedirectAttributes attr) {
		String msg=service.editStudent(stud);
		attr.addFlashAttribute("resultMsg", msg);
		return "redirect:report";
	}
	
	
}
