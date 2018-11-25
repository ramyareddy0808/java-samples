import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		int firstNumber, secondNumber, sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		firstNumber = sc.nextInt();
		secondNumber = sc.nextInt();
		
		sum = firstNumber+secondNumber;
		
		
		System.out.println("Sum is " +sum);
		
		sc.close();
		
	}

}
