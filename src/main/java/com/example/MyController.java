package com.example;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {
	
	@Inject
	VegetableRepJPA vegRepository;
	
	// we can pass more parameters to the req.
	@RequestMapping(value="/")
	public String handleTheRootOfTheServer(Model model) {
		model.addAttribute("hi" , "hellowww");
		model.addAttribute("veges", vegRepository.findAll());
		model.addAttribute("veg", new Vegetable());
		return "simple";
	}
	
	@RequestMapping(value="/addvegetable", method=RequestMethod.POST)
	public String handleTheRootOfTheServerASPOST(Vegetable pVeg) {
		vegRepository.save(pVeg);
		return "redirect:/";
	}
		
	
//	CarRepository repo;
//	List<Car> allCars = new ArrayList<>();
//	public MyController(){
//		allCars.add(new Car("Peugot", "Blue"));
//		allCars.add(new Car("BMW","Black"));
//		return;
//	}	
//	
	// we can pass more parameters to the req.

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
