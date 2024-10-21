package emp;

import java.util.Scanner;

public class EmployeeMain {
	
	EmployeeSerivce serivce=new EmployeeSerivce();
	static boolean ordering=true;
	public static void menu(){
		System.out.println("--------------Employee Management-----------"
				+"\n 1.Add Employee"
				+"\n 2.View Employee"
				+"\n 3.Update Employee"
				+"\n 4.Delete Employee"
				+"\n 5.View Employee"
				+"\n 6.Exist");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeSerivce service=new EmployeeSerivce();
    do {
    	menu();
    	System.out.println("Enter your choice :");
    	int choice=s.nextInt();
    	switch(choice){
    	case 1:
    		System.out.println("Add Employee");
    		service.empAdd();
    		break;
    	case 2:
    		System.out.println("View Employee");
    		service.viewEmp();
    		break;
    	case 3:
    		System.out.println("Update Employee");
    		service.empUpdate();
    		break;
    	case 4:
    		System.out.println("Delete Employee");
    		service.empDelete();
    		break;
    	case 5:
    		System.out.println("View All Employee");
    		service.viewAllEmps();
    		break;
    	case 6:
    		System.out.println("Thank you for using application");
    		System.exit(0);
    	default:
    		System.out.println("please enter valid choice");
    		break;
    	
    	}
    	
    }while(ordering);
	}

}
