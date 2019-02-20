package com.cg.ems.dto;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="emp1")

public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id",length=20)
	private int empId;
	
	@Column(name="emp_name",length=30)
	private String empName;
	
	@Column(name="emp_sal",length=10)
	private float empSal;
	
	@Transient
	private LocalDate empDOJ;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public LocalDate getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(LocalDate empDOJ) {
		this.empDOJ = empDOJ;
	}
	
	public Employee() {
		super();
		
	}

	public Employee(int empId, String empName, float empSal, LocalDate empDOJ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDOJ = empDOJ;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDOJ=" + empDOJ + "]";
	}
	

}
