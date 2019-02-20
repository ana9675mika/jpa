import javax.persistence.*;

@Entity
@Table(name="mgr_store")
public class Manager  extends Emp
{
		private String deptName;

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public Manager(String deptName) {
	super();
	this.deptName = deptName;
}

@Override
public String toString() {
	return "Manager [deptName=" + deptName + "]";
}

public Manager(int empId, String empName, Float empSal) {
	super(empId, empName, empSal);
	this.deptName=deptName;
	// TODO Auto-generated constructor stub
}

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}

}
