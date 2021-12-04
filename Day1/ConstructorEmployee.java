package Week7.Day1;

public class ConstructorEmployee {
	int empId;
	String empName;
	boolean empStatus;
	
	//Default Constructor
	ConstructorEmployee(){
		System.out.println("Default Constructor");
	}
	
	// Parameterized Constructor
	ConstructorEmployee(int id,String name,boolean status){
		System.out.println("Parameterized Constructor");
		empId=id;
		empName=name;
		empStatus=status;
		
	}
	public static void main(String[] args) {
		ConstructorEmployee emp= new ConstructorEmployee();
	System.out.println(emp.empId);
	System.out.println(emp.empName);
	System.out.println(emp.empStatus);
	}
}
