import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.cg.ems.dto.Department;
import com.cg.ems.dto.Employee;
import com.cg.ems.util.JPAUtil;

public class TestOneToManyDemo {
         public static void main(String args[])
{
        	 EntityManager em=JPAUtil.getEntityManager();
        	 EntityTransaction et=em.getTransaction();
        	
        	 Department d1=new Department();
        	 d1.setDeptCode(10);
        	 d1.setDeptName("Admin");
        	 
        	 Department d2=new Department();
        	 d2.setDeptCode(20);
        	 d2.setDeptName("Sales");
        	 
        	 Employee e1=new Employee();
        	 e1.setEmpId(1000);
        	 e1.setEmpName("VaisaliS");
        	 e1.setEmpSal(1000);
        	 e1.setEmpDept(d1);
        	 
        	 Employee e2=new Employee();
        	 e2.setEmpId(2000);
        	 e2.setEmpName("Rahul Sharma");
        	 e2.setEmpSal(2000);
        	 e2.setEmpDept(d2);
        	 
        	 Employee e3=new Employee();
        	 e3.setEmpId(3000);
        	 e3.setEmpName("Manish Ozha");
        	 e3.setEmpSal(3000);
        	 e3.setEmpDept(d1);
        	 
        	 Employee e4=new Employee();
        	 e4.setEmpId(4000);
        	 e4.setEmpName("Anjulata T");
        	 e4.setEmpSal(4000);
        	 e4.setEmpDept(d2);
        
        	 
         
        	 Set<Employee> adminEmpSet=new HashSet();
        	 Set<Employee> salesEmpSet=new HashSet();
        	 adminEmpSet.add(e1);
        	 adminEmpSet.add(e2);
        	
        	 salesEmpSet.add(e3);
        	 salesEmpSet.add(e4);
        	 
        	 d1.setEmpSet(adminEmpSet);
        	 d2.setEmpSet(salesEmpSet);
        	 
        	 et.begin();
        	 em.persist(d1);
        	 em.persist(d2);
        	 
        	
        	 et.commit();
        	 System.out.println("employee inserted");
        	
        	
        	 
        	 
        	 
        	 
        	 
      }
}
