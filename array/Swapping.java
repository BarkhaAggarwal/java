package array;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int size = sc.nextInt();
//		int [] a = new int [size];
//		for(int i = 0 ; i < size; i++) {
//			a[i] = sc.nextInt();
//			System.out.println(a[i]);
//		}
		int arr1[]= {10,20,30,40};
		int arr2[]= {1,2,3,4};
		System.out.println(arr1[0]+":"+ arr2[0]);
		swap(arr1, arr2);
		swap_in(arr1, arr2, 0);
		
		System.out.println(arr1[0]+":"+ arr2[0]);
		}
public static void swap(int[]a , int[]b) {
	int []t= a;
	a = b ;
	b = t ;
	//System.out.println(a[0] +":"+b[0]);
	
}
public static void swap_in(int []a , int []b , int c ) {
	int d = a [c];
	a[c]= b[c];
	b[c]= d;
}
}
