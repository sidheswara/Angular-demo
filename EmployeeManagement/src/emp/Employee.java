package emp;
import java.io.*;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String desiganatin;
	private String department;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesiganatin() {
		return desiganatin;
	}
	public void setDesiganatin(String desiganatin) {
		this.desiganatin = desiganatin;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desiganatin=" + desiganatin
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, int age, String desiganatin, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.desiganatin = desiganatin;
		this.department = department;
		this.salary = salary;
	}
	
	
}
