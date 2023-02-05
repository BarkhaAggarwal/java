package array;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int j =0;j<t ;j++) {
			int n = sc.nextInt();
			
			int arr[]= new int[n];
			for(int i = 0;i<n ; i++) {
				arr[i]= sc.nextInt();
			}
			
			Div_subarray(arr,n);
		}

	}
	
	public static void Div_subarray(int arr[], int n ) {
		int c =0;
		for(int i=0;i<n;i++) {
			for(int j = i ; j<n ;j++) {
				int sum =0;
				
				for(int r = i ; r<=j;r++) {
					sum = sum + arr[r];
					}
				
				if(sum % n ==0 ) {
					c++;
					}
				}
		}
		System.out.println(c);
		}
	

}
