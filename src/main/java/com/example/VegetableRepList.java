package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class VegetableRepList implements VegetableRep{
	
	List <Vegetable> VegList = new ArrayList<>();
	
	public VegetableRepList() {
		VegList.add(new Vegetable("Peaches","Pink","2.25"));
		VegList.add(new Vegetable("Apples","Green","1.25"));
		VegList.add(new Vegetable("Grapes","Red","1.75"));
		VegList.add(new Vegetable("Bananas","Yellow","1.00"));
 
	}

	@Override
	public List<Vegetable> findAll() {
		return Collections.unmodifiableList(VegList);
	}

	@Override
	public void add(Vegetable v) {
		VegList.add(v);
	}
	

}
