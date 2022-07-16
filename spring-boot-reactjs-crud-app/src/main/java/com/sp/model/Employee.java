package com.sp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Empty field!")
    @Column(name = "first_name")
    private String firstName;
    @NotBlank(message = "Empty field!")
    @Column(name = "last_name")
    private String lastName;
    @NotBlank(message = "Empty field!")
    @Column(name = "city")
    private String city;
    @NotBlank(message = "Empty field!")
    @Column(name = "address")
    private String address;
    @NotBlank(message = "Empty field!")
    @Column(name = "telephone")
    private String telephone;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
