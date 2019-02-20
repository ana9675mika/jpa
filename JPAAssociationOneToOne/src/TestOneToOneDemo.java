import javax.persistence.*;

import com.cg.ems.dto.Address;
import com.cg.ems.dto.Student;
import com.cg.ems.util.JPAUtil;

public class TestOneToOneDemo {
         public static void main(String args[])
{
        	 EntityManager em=JPAUtil.getEntityManager();
        	 EntityTransaction et=em.getTransaction();
        	 Address vAddress=new Address();
        	 vAddress.setCity("Pune");
        	 vAddress.setState("Maharastra");
        	 vAddress.setStreet("Singhad Road");
        	 vAddress.setZipcode("411041");
        	 
        	 Address rAddress=new Address();
        	 rAddress.setCity("Gaziabad");
        	 rAddress.setState("UP");
        	 rAddress.setStreet("GT Road");
        	 rAddress.setZipcode("200731");
        	 
        	 Address sAddress=new Address();
        	 sAddress.setCity("Delhi");
        	 sAddress.setState("Delhi");
        	 sAddress.setStreet("MG Road");
        	 sAddress.setZipcode("200722");
        	 
        	 Address tAddress=new Address();
        	 tAddress.setCity("Basti");
        	 tAddress.setState("Lacknow");
        	 tAddress.setStreet("Block Road");
        	 tAddress.setZipcode("200151");
        	 
        	 Student vinita=new Student();
        	 vinita.setStuName("Vinita Lalawani");
        	 vinita.setStuAddress(vAddress);
        	 
        	 Student rahul=new Student();
           	 rahul.setStuName("Rahul Sharma");
        	 rahul.setStuAddress(rAddress);
        	 
        	 Student shreya=new Student();
           	shreya.setStuName("Shreya Sengar");
        	 shreya.setStuAddress(sAddress);
        	 
        	 Student tanu=new Student();
           	 tanu.setStuName("Tanu Agrawal");
        	tanu.setStuAddress(tAddress);
        	 et.begin();
        	 em.persist(vinita);
        	 em.persist(rahul);
        	 em.persist(shreya);
        	 em.persist(tanu);
        	 et.commit();
        	 System.out.println("Data Inserted");
        	 System.out.println("..........Fetch.......");
        	 
        	 
        	 
        	 
        	 
        	 
        	 
      }
}
