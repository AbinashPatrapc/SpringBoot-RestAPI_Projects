package com.numetry.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.numetry.model.Voter;
import com.numetry.service.IvoterMgmtService;

@Controller
public class VoterappController {

	@Autowired
	private IvoterMgmtService service;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/vregister")
	public String lunchRegisterPage(@ModelAttribute("vote") Voter vote) {
		return "voterRegistration";
	}

	@GetMapping("/report")
	public String showEmployeeReport(Map<String, Object> map, Voter vote) {
		List<Voter> list = service.getAllVoter();
		map.put("List", list);
		return "report";
	}

	@PostMapping("/vregister")
	public ModelAndView RegisterPage(@ModelAttribute("vote") Voter vote) {
		String result = "";
		String nationality = vote.getNationality();
		
		LocalDate dateOfBirth=vote.getDob();
		LocalDate currentDate = LocalDate.now();
		int age=(int) ChronoUnit.YEARS.between(dateOfBirth, currentDate);
		vote.setAge(age);
		
		int newAge=vote.getAge();
		if (nationality.equals("Indian") &&newAge >= 18 && newAge<75 ) {
			result = service.registerVoter(vote);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("message", result);
			modelAndView.setViewName("confirmation"); 
			return modelAndView;
			
		} else if (nationality.equals("Indian") && newAge < 18) {
			result = "You are Under age to vote now Please go through Rules and Regulation";
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("message", result);
			modelAndView.setViewName("underageError"); 
			return modelAndView;
			
		}else if(nationality.equals("Indian") && newAge>75) {
			result = service.registerVoter(vote)+" and You can take one person with you for voting";
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("message", result);
			modelAndView.setViewName("confirmation"); 
			return modelAndView;
		}else {
			result = "Only Indian nationals are allowed to register!";
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("message", result);
			modelAndView.setViewName("error"); 
			return modelAndView;
		}

	}

}
