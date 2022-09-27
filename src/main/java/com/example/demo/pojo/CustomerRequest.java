package com.example.demo.pojo;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	@Email
	private String email;
	@NotNull
	@Past
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date dob;
	@NotEmpty
	private String gender;
	@NotEmpty
	private List<String> hobbies;
	@NotEmpty
	private String country;
	private List<Country> countryList;
}
