package array;

import java.util.Scanner;

public class stocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int[n];
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int ans = Integer.MIN_VALUE;
		int index_st= -1;
		int index_en= -1;
		
		for(int i = 0 ; i<n-1 ; i++) {
			for(int j = i+1;j<n ;j++) {
				if(j>i) {
					int res = j - i ;
					ans = Math.max(ans, res);
					index_st= arr[i];
					index_st=arr[j];
				}
				
			}
		}
		
		System.out.println(ans);
		
		
		
		
		
		
			
		}
	

}
