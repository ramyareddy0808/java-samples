
public class ArraysExample {

	public static void main(String[] args) {

		int arr [][]=new int[4][3];
		
		arr[0][0] = 76;
		arr[0][1] = 89;
		arr[0][2] = 56;
		
		arr[1][0] = 23;
		arr[1][1] = 76;
		arr[1][2] = 10;
		
		arr[2][0] = 76;
		arr[2][1] = 98;
		arr[2][2] = 45;
		
		arr[3][0] = 90;
		arr[3][1] = 30;
		arr[3][2] = 56;
		
		for (int i = 0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			 System.out.println();
		}
		
		

	}

}
