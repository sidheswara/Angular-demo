package emp;
import java.util.*;
public class EmployeeSerivce {
  HashSet<Employee> empset=new HashSet<Employee>();
  Employee emp1=new Employee(101,"Shital",24,"Developer","IT",25000);
  Employee emp2=new Employee(102,"Meena",26,"Tester","CO",52000);
  Employee emp3=new Employee(103,"Sai",23,"Developer","Admin",20000);
  Employee emp4=new Employee(104,"Teja",28,"DevOps Eng","TL",30000);
  Employee emp5=new Employee(105,"Vamshi",30,"System  Eng","Manager",70000);
  
  Scanner s= new Scanner(System.in);
  
  boolean  found=false;
  int id;
  String name;
  int age;
  String department;
  String desiganation;
  double salary;
  
  public EmployeeSerivce() {
	  empset.add(emp1);
	  empset.add(emp2);
	  empset.add(emp3);
	  empset.add(emp4);
	  empset.add(emp5);
  }
  public void viewAllEmps() {
	  for(Employee emp:empset) {
		  System.out.println(emp);
	  }
  }
  
  public void viewEmp() {
	  
	  System.out.println("Enter the ID:");
	  id=s.nextInt();
	  for(Employee emp:empset) {
		  if(emp.getId()==id) {
			  System.out.println(emp);
			  found=true;
		  }
	  }
       if(!found) {
 	       System.out.println("Employee with this ID not prseent...");
       }
  }
  
  public void empUpdate() {
	  System.out.println("Enter ID :");
	  id=s.nextInt();
	  boolean found=false;
	  for(Employee emp:empset) {
		  if(emp.getId()==id) {
			  System.out.println("Enter Name :");
			  name=s.next();
			  System.out.println("Enter new salary :");
			  salary=s.nextDouble();
			  emp.setName(name);
			  emp.setSalary(salary);
			  System.out.println("Updataed details of employees are :");
			  System.out.println(emp);
			  found=true;
		  }
		  }
	     if(!found) {
		   System.out.println("Employee is not prseent...");
	    }else {
		   System.out.println("Employee details updated successfully...");
	  }
	
  }
  public void empDelete(){
		 System.out.println("Enter ID:");
		 id=s.nextInt();
		 boolean found=false;
		 Employee employeeDelete=null;
		 for(Employee emp:empset) {
			 if(emp.getId()==id) {
				 employeeDelete=emp;
				 found=true;
			 }
		 }
		 if(!found) {
			 System.out.println("Employee is not prseent...");
		 }else {
			 empset.remove(employeeDelete);
			 System.out.println("Employee Deleted successfully...");
		 }
	 }
  public void empAdd(){
	  System.out.println("Enter id :");
	  id=s.nextInt();
	  System.out.println("Enter name :");
	  name=s.next();
	  System.out.println("Enter age :");
	  age=s.nextInt();
	  System.out.println("Enter desiganation :");
	  desiganation=s.next();
	  System.out.println("Enter department :");
	  department=s.next();
	  System.out.println("Enter salary :");
	  salary=s.nextDouble();
	  
	  Employee emp=new Employee(id,name,age,desiganation,department,salary);
	  empset.add(emp);
	  System.out.println(emp);
	  System.out.println("Employee Added successfully....");
  }
}
