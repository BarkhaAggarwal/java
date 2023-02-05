package array_2d;

public class matrix_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][]= {{11,12,13,14},
			          {21,22,23,24},
			          {31,32,33,34},
			          {41,42,43,44}};
		int k = 18;
		int ans =search(arr,k);
		System.out.println(ans);
	}

	
	
	public static int search(int arr[][], int f) {
		
		
		int i =arr.length-1; //row
		int j = 0; //col
		int n = 0;
		int m = arr[0].length;
		
		while(i>=0 && j<m) {
			if(arr[i][j]==f) {
//				System.out.println("1");
				return 1;
				
			}
			else if(arr[i][j]>f) {
				i--;
			}
			else {
				j++;
			}
			
			
		}
//		if(i==0 && j >= m  ) {
//			System.out.println("0");
//		}
		return 0;
		
		
	}
}
