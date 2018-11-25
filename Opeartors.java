
public class Opeartors {
	
	public static void main(String[] args) {
		
		//Arithmetic opeartor
		int firstNum = 10;
		int secondNum = 20;
		int total = firstNum+secondNum;
		System.out.println("Total num is "+total);
				
		//Mod
		int mod = firstNum % secondNum;
		System.out.println("Mod is "+mod);
		
		//Increment ++
		int myNum;
		myNum = 50;
		myNum++;
		System.out.println("Increment num is "+myNum);
		
		//Decrement --
		int myNum1 = 50;
		myNum1--;
		System.out.println("Decrement num is "+myNum1);
				
		//Conditional statements-IF
		
		int number1 = 90;
		int number2 = 90;
		
		if(number1>number2)
		System.out.println("number1 is greater than number2");
		else if(number2>number1)
			System.out.println("number2 is greater than number1");	
		else 
			System.out.println("Both numbers are equal" );
		
		//Assignment greatest of three numbers
		
		int num1 = 87;
		int num2 = 98;
		int num3 = 35;
		
		if((num1>num2) && (num1>num3)) {
			System.out.println("Num1 is greater then other Num2 and Num3 ");
		}
		else if((num2>num1) && (num2>num3)){
			System.out.println("Num2 is greater than Num1 and Num3");
		}
		else {
			System.out.println("Num3 is greater than Num1 and Num2");
		}
			
		//Switchcase
		
		String myVar = "Fri";
		
		switch (myVar) {
		case "Sun":
			System.out.println("Hey it's Sunday!");
			break;
		case "Sat":
			System.out.println("Hey it's Ssaturday!");
			break;
		case "Fri":	
			System.out.println("Hey it's Friday!");
			break;
		case "Thu":
			System.out.println("Hey it's Thursday!");
			break;
		case "Wed":
			System.out.println("Hey it's Wednesday!");
			break;
		case "Tue":
			System.out.println("Hey it's Tuesday!");
			break;
		case "Mon":
			System.out.println("Hey it's Monday!");
			break; 	

		default:
			System.out.println("Not a correct day!");
			break;
		}
				
		
				
		
		
	
		
		
		
		
		}
				
}
				
					



