package array;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][]= {{11,12,13,14},
			       {21,22,23,24},
			       {31,32,33,34},
			       {41,42,43,44}};
		}

	public static void spiral(int arr[][]) {
		int min_r=0;
		int max_r= arr.length-1;
		int max_c = arr[0].length-1;
		int min_c = 0;
		
		for(int r =min_r ; r<=max_r;r++) {
			System.out.println(arr[r][min_c]);
		}
		
		
		for(int r =min_c+1 ; r<=max_c;r++) {
			System.out.println(arr[max_r][r]);
		}
		
		for(int r =max_r-1 ; r<=min_r;r--) {
			System.out.println(arr[r][max_c]);
		}
		for(int r =max_c-1 ; r<=min_c+1;r--) {
			System.out.println(arr[r][max_c]);
		}
		
		
	}
	
	public static boolean search(int arr[][],int a) {
		int r = arr.length-1;
		int c= 0;
		while(true) {
			
			if(a>arr[r][c]) {
				
			}	
		}
		
	}
}
