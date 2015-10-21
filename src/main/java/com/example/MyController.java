package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	
	// we can pass more parameters to the req.
	@RequestMapping(value="/")
	public String handleTheRootOfTheServer(Model model) {
		model.addAttribute("hi" , "hellowww");
		return "simple";
	}
	
	
//	CarRepository repo;
//	List<Car> allCars = new ArrayList<>();
//	public MyController(){
//		allCars.add(new Car("Peugot", "Blue"));
//		allCars.add(new Car("BMW","Black"));
//		return;
//	}	
//	
//	// we can pass more parameters to the req.
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public String handleTheRootOfTheServerASPOST() {
//		return "index2";
//	}
//		
//	@RequestMapping(value="/", method=RequestMethod.POST) 
//	public String ShowHomePage(){
//		allCars.add(new Car("Peugot", "Blue"));
//		allCars.add(new Car("BMW","Black"));
//		return "simple";
//	}
//
//	public void RootAnyways(){
//		model.addAtrribute("cars", re)
//	}

	
	
	
	
}
