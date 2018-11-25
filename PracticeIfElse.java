
public class PracticeIfElse {

	public static void main(String[] args) {
		int firstNum;
		int SecondNum;
		int thirdNum;
		
		firstNum =10;
		SecondNum=78;
		thirdNum=56;
		
		if((firstNum>SecondNum) && (firstNum>thirdNum))
			System.out.println("First Number is the greatest");
		
		else if((SecondNum>firstNum) && (SecondNum>thirdNum))
			System.out.println("Second Number is the greatest");
		
		else
			System.out.println("Third number is greatest");
			
			

	}

}
