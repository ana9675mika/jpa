package com.cg.ems.ui;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmpJpaDemo {
	public static void main(String args[])
	{
		EmployeeService empSer=new EmployeeServiceImpl();
		System.out.println(".........inserting a record........");
		Employee e1=new Employee();
		e1.setEmpName("Kratika");
		e1.setEmpSal(81000.0F);
		Employee ee1=empSer.addEmp(e1);
		System.out.println(ee1 + " is inserted in table");
		
		System.out.println(".....fetch only one record........");
		Employee ee=empSer.getEmpById(555);
		System.out.println(ee);
		
		System.out.println("......fetch all records.........");
		ArrayList<Employee> eList=empSer.fetchAllEmp();
		for(Employee tempE:eList)
		{
			System.out.println(tempE.getEmpId()+"\t"
					+tempE.getEmpName()+"\t"
					+tempE.getEmpSal());;
		}
		System.out.println("..........delete.......");
		Employee deletedEmp=empSer.deleteEmp(8);
		System.out.println(deletedEmp+" deleted");
		
		System.out.println("...........update..........");
		Employee updatedEmp=empSer.updateEmp(6, "Nitin", 1900);
		System.out.println("updated data for "+updatedEmp.getEmpId());
		
	}

}
