package Sorting;

import java.util.Arrays;

public class Quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {50,40,80,90,70,10,30,60,120};
		quick(0, arr.length-1, arr);
//		for(int i=0;i<arr.length;i++ ) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println(Arrays.toString(arr));

	}

	public static void quick(int s , int e, int[]arr) {
		if(s>=e) {
			return;
		}
		int pivot= arr[(s+e)/2];
		int l = s;
		int r = e;
		while(l<=r) {
			while(arr[l]<pivot) {
				l++;
			}
			while(arr[r]>pivot) {
				r--;
			}
			if(l<=r) {
				int temp = arr[l];
				arr[l]= arr[r];
				arr[r]= temp;
				l++;
				r--;
			}
			
			
		}
		quick(s, r, arr);
		quick(l, e, arr);
	
		
	}
	
}
