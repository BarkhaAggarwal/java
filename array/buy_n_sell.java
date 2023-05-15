package array;

import java.util.Scanner;

public class buy_n_sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		max_profit(arr , n);
		
	}

	
	
	public static void max_profit(int a[], int n ) {
		
		int min = a[0];
		int max = 0;
		
		for(int i =0; i<n ;i++) {
			if (a[i]<min) {
				min = a[i];
			}
			int profit = a[i]-min;
			
			if(profit>max) {
				max = profit;
			}
		}
		
		System.out.println(max);
		
		
	}
	
	
	
}
