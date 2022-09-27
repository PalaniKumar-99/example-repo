package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		prepareCustomerRequest(new CustomerRequest(),model);
		return "registration";
	}
	
	@PostMapping("/store")
	public String registrationDetails(@Valid @ModelAttribute(value = "customerRequest") CustomerRequest customerRequest,BindingResult result,Model model)
	{
		//checking for validation errors
		if(result.hasErrors())
		{
			prepareCustomerRequest(customerRequest,model);
			return "registration";
		}
		return "CustomerDetails";
	}
	private void prepareCustomerRequest(CustomerRequest customerRequest, Model model)
	{
		
		List<Country> countryList = Arrays.asList(new Country("India","IND"),new Country("Japan","JAP"),new Country("Australia","AUS")
				,new Country("America","USA"),new Country("France","FR"));
		customerRequest.setCountryList(countryList);
		model.addAttribute("customerRequest",customerRequest);
	}
}
