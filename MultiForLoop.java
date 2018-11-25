
public class MultiForLoop {
	public static void main(String[] args) {
		
		//rows = 5, columns =6
		
		/*int rows =5;
		int columns=6;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				
				System.out.print("* ");
			}
				System.out.println();
			
		}*/
		

			
		/*for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		for(int i = 1; i<=6; i++)
		{
			for(int j = 1; j<=(2*i-1); j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		
	
		}
		
		
	}

}
