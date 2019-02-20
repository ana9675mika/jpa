package com.cg.ems.dto;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="dept_masterr")
public class Department {
		
		@Id
		@Column(name="dept_code",length=10)
		 private int deptCode;
		
		@Column(name="dept_name",length=25)
		private String deptName;
		
		
		
		@OneToMany(cascade=CascadeType.ALL, mappedBy="empDept")
		private Set<Employee> empSet=new HashSet<Employee>();
		
		public Set<Employee> getEmpSet() {
			return empSet;
		}
		public void setEmpSet(Set<Employee> empSet) {
			this.empSet = empSet;
		}
		public int getDeptCode() {
			return deptCode;
		}
		public void setDeptCode(int deptCode) {
			this.deptCode = deptCode;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		@Override
		public String toString() {
			return "Department [deptCode=" + deptCode + ", deptName=" + deptName + "]";
		}
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Department(int deptCode, String deptName) {
			super();
			this.deptCode = deptCode;
			this.deptName = deptName;
		}
		
		 

}
