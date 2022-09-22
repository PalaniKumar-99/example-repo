package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Country;
import com.example.demo.pojo.CustomerRequest;

@Controller
@RequestMapping("/customer")
public class CustomerRegistrationController {

	@GetMapping("/registration")
	public String getRegistrationPage(Model model)
	{
		CustomerRequest customerRequest = new CustomerRequest();
		List<Country> countryList = Arrays.asList(new Country("India","IND"),new Country("Japan","JAP"),new Country("Australia","AUS")
				,new Country("America","USA"),new Country("France","FR"));
		customerRequest.setCountryList(countryList);
		model.addAttribute("customerRequest",customerRequest);
		return "registration";
	}
	
	@PostMapping("/store")
	public String registrationDetails(@ModelAttribute(value = "customerRequest") CustomerRequest customerRequest,Model model)
	{
		
		return "CustomerDetails";
	}
}
