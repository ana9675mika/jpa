import javax.persistence.*;

@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.JOINED)
public class Emp 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empName;
	private Float empSal;

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int empId, String empName, Float empSal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}
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
public Float getEmpSal() {
	return empSal;
}
public void setEmpSal(Float empSal) {
	this.empSal = empSal;
}



















}
