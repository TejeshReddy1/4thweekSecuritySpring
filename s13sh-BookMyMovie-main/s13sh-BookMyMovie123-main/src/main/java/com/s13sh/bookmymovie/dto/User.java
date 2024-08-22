package com.s13sh.bookmymovie.dto;

import java.time.LocalDate;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;




@Component
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 3, max = 10, message = "* Enter between 3~10 characters")
    private String name;
    @NotEmpty(message = "* this is required field")
    @Email(message = "* Enter proper email address")
    private String email;
    @Size(min = 3, max = 10, message = "* Enter between 3~10 characters")
    private String password;
    @NotEmpty(message = "* this is required field")
    private String gender;
    @NotNull(message = "* this is required field")
    @DecimalMax(value = "9999999999", message = "* Enter proper mobile number")
    @DecimalMin(value = "6000000000", message = "* Enter proper mobile number")
    private long mobile;
    @NotNull(message = "* this is required field")
    @Past(message = "* Enter valid Date")
    private LocalDate dob;
    private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(int id, @Size(min = 3, max = 10, message = "* Enter between 3~10 characters") String name,
			@NotEmpty(message = "* this is required field") @Email(message = "* Enter proper email address") String email,
			@Size(min = 3, max = 10, message = "* Enter between 3~10 characters") String password,
			@NotEmpty(message = "* this is required field") String gender,
			@NotNull(message = "* this is required field") @DecimalMax(value = "9999999999", message = "* Enter proper mobile number") @DecimalMin(value = "6000000000", message = "* Enter proper mobile number") long mobile,
			@NotNull(message = "* this is required field") @Past(message = "* Enter valid Date") LocalDate dob,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.mobile = mobile;
		this.dob = dob;
		this.role = role;
	}

    
}
