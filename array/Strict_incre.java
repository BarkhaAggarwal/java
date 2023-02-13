package array;

import java.util.Scanner;

public class Strict_incre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int [n];
		
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		check(arr,n);
		
	}

	
	public static void check(int a[], int n) {
		int i =0;
		
		
		while(i<n-1 && a[i]<a[i+1]) {
			i++;
		}
		while(i<n-1 && a[i]>a[i+1]) {
			i++;
		}
		
		
		
		if(i==n-1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
	}
	
	
}
