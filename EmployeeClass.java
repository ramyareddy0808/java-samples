
public class EmployeeClass {
	
	//variable - these are "INSTANCE LEVEL" variables-accessed within the same class
	int salary;
	int bonus;
	
	//method
	void calculateSalary() {
		
		//Defining a variable inside a method is called "LOCAL VARIABLE"-access is within this method only
		int totalSalary;
		
		totalSalary = salary+bonus;
		System.out.println("Total salary is "+totalSalary);	
	}
	
	//Another way of defining a method 
	
	void calculateSalary1(int sal,int bon){
		int totalSalary;
		
		totalSalary = sal+bon;
		
		System.out.println("Total salary is "+totalSalary);
		
	}
	
	//Constructor
	/*public EmployeeClass() {
		System.out.println("Inside default constructor");
	}
	EmployeeClass(int salary, int bonus){
		System.out.println("total salary is " + (salary+bonus));
	}*/
		

}
