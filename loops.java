
public class loops {

	public static void main(String[] args) {
		
		//FOR loop(Declaration/initializing, condition, increment/decrement)
		/*for (int i=1; i<=10;i++) {
			System.out.println(i);				
		}*/
	
		//For loop for first 5 natural numbers
		//Average = sum(1+2+3+..n)/n
		
		
		int number =10;
		int sum=0;
		int average;
		
		for(int i=1;i<=10;i++) {
		sum=sum+i;
		}
		average=sum/number;
		System.out.println("sum is " + sum);
		System.out.println("Average is " +average);
	
		
			
	}

}
