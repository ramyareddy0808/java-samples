
public class EmployeeClassDemo {

	public static void main(String[] args) {
		
		//Variable-Declaration
		EmployeeClass ramya;
		
		//using "NEW" keyword-instantiating the object - means creating a memory for the object 
		//initialising-assigning default values to the variable 
		ramya = new EmployeeClass();
				
		ramya.salary = 10000;
		ramya.bonus = 5000;
		
		ramya.calculateSalary();
		
		//----------------------------------------------------------
		
		EmployeeClass jojo = new EmployeeClass();
		
		jojo.salary = 307890;
		jojo.bonus = 782183;
		
		jojo.calculateSalary();
		
		//----------------------------------------------------------
		
		//New way of declaring
		
		EmployeeClass reddy = new EmployeeClass();
		
		reddy.calculateSalary1(16878,435465);
		
	
		
	}
	
	//Constructor
	/*public static void main(String[] args) {
		EmployeeClass ramya = new EmployeeClass();
		
		EmployeeClass Jojo = new EmployeeClass(30000,20000);
	}*/

}
