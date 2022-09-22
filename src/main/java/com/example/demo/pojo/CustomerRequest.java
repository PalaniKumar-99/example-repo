package com.example.demo.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

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
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dob;
	private String gender;
	private List<String> hobbies;
	private String country;
	private List<Country> countryList;
}
