import javax.persistence.*;

import com.cg.ems.util.JPAUtil;

public class TestInheritanceDemo {

	public static void main(String[] args)
	{
		Emp rahul=new Emp();
		rahul.setEmpName("Rahul Chauhan");
		rahul.setEmpSal(60000.0F);
		Manager vaishali=new Manager();
		vaishali.setEmpName("VaishaliS");
		vaishali.setEmpSal(5000.0F);
		vaishali.setDeptName("java");
		EntityManager em=JPAUtil.getEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		em.persist(rahul);
		em.persist(vaishali);
		tran.commit();
		System.out.println("data is inserted");
		
	}

}
