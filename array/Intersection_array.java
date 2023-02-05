package array;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr []= new int[n];
		int arr1 []= new int[m];
		
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i =0;i<m;i++) {
			arr1[i]= sc.nextInt();
		}
		intersection(arr,arr1);
	}

	public static boolean binary_search(int arr[],int k ) {
		int n = arr.length;
		int s =0;
		int h = n;
		while(s<=h) {
			int mid= (s+h)/2;
			if(arr[mid]==k) {
				return true;
			}
			else if(mid<k) {
				s = mid+1;
			}
			else {
				h = mid-1;
			}
		}
		
		
		return false;
		
	}
	
	public static void intersection(int []a , int []b) {
		//int ans;
		Arrays.sort(b);
		for(int i =0;i<a.length;i++) {
			if(binary_search(b,a[i])) {
				System.out.println(a[i]);
			}
				
			
		}
		
	}
}
