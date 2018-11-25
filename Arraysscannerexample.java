import java.util.Scanner;

public class Arraysscannerexample {

	public static void main(String[] args) {
		
		int arr [][] = new int[4][3];
		
		Scanner sc = new Scanner(System.in);
		
		
		//To insert values to an array
		
		for (int i = 0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length;j++) {
				
				arr[i][j] = sc.nextInt();
				
				//System.out.print(arr[i][j]+ " ");
			}
			 System.out.println();
		}
		
		//to print values out of an array
		
		for (int i = 0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			 System.out.println();
		}
		sc.close();
	}

}
