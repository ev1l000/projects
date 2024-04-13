package com.spec.entities;


import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity; 
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="employee_table")
public class Employee {
	
	private String empName;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	@NotNull
	private double empSalary;
	@NotBlank
	@Pattern(regexp="[6789][0-9]{10}",message = "please enter a mobile")
	private String mobileNum;
	@Email(message = "please enter email here")
	private String email;
	@NotBlank
	private String address;
	@NotBlank
	private String department;
	private int age;
	private char gender;
	private String designation;
	public Employee() {
		super();
	}
	public Employee(String empName, int empId, double empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}
	public Employee(String empName, int empId, double empSalary, String mobileNum, String email, String address,
			String department, int age, char gender, String designation) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.mobileNum = mobileNum;
		this.email = email;
		this.address = address;
		this.department = department;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
	}
}
