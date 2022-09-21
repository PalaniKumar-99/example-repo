package com.example.demo.pojo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
	private String firstName;
	private String lastName;
	private String email;
	private Date dob;
	private String gender;
	private List<String> hobbies;
	private String country;
	private List<Country> countryList;
}
