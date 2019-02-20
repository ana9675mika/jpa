package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.*;
import com.cg.ems.dto.Employee;
import com.cg.ems.util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao
{	
	EntityManager em=null;
	EntityTransaction entityTran=null;
	public EmployeeDaoImpl()
	{
		em=JPAUtil.getEntityManager();
		entityTran=em.getTransaction();
	}

	@Override
	public Employee addEmp(Employee emp) {
		entityTran.begin();
		em.persist(emp);
		entityTran.commit();
		return emp;
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() {
		
		String selAllQuery="SELECT emps FROM Employee emps";
		TypedQuery<Employee> tq=em.createQuery(selAllQuery,Employee.class);
		ArrayList<Employee> empList=(ArrayList) tq.getResultList();
		return empList;
	}

	@Override
	public Employee deleteEmp(int empId) {
		Employee e1=em.find(Employee.class, empId);
		entityTran.begin();
		em.remove(e1);
		entityTran.commit();
		return e1;
	}

	@Override
	public Employee getEmpById(int empId) {
		Employee ee=em.find(Employee.class,empId);
		return ee;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		Employee ee=em.find(Employee.class, empId);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		entityTran.begin();
		em.merge(ee);
		entityTran.commit();
		return ee;
	}

}
