package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[]= new int[n];
		int arr2[]= new int[n];
		for(int i = 0; i<n ; i++) {
			arr1[i]= sc.nextInt();
		}
		for(int i = 0; i<n ; i++) {
			arr2[i]= sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(intersection(arr1,arr2));

	}
	//1 2 3 1 2 4 1
	//2 1 3 1 5 2 2
	
	public static ArrayList<Integer> intersection (int a[], int b[]){
		ArrayList<Integer> arr = new ArrayList<>();
		
		int n = a.length;
		int m = b.length;
		
		int i = 0 ;
		int j = 0;
		
		while(i<n && j<m) {
			if(a[i]==b[j]) {
				arr.add(a[i]);
				System.out.println(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j]) {
				i++;
			}
			else {
				j++;
			}
			}
		
	      return arr;
		}
	

}
