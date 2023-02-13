package array;

import java.util.Scanner;

public class sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
       
        sort012(arr,n);
        print(arr);
	}

	public static void print(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort012(int []arr, int size) {
		
		int lo=0;
		int mid =0,temp=0;
		int hi= size-1;
		
		while(mid<=hi) {
			switch(arr[mid]) {
			case 0: {
				temp = arr[mid];
				arr[mid]=arr[lo];
				arr[lo]=temp; 
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++; break;
				
			case 2:{
				temp = arr[hi];
				arr[hi]=arr[mid];
				arr[mid]=temp;
				hi--;
				break;
				}
			
			
			}
		}
		
		
		
	}
	
}
