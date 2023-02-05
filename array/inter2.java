package array;

import java.util.Arrays;
import java.util.Scanner;

public class inter2 {

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
		Arrays.sort(arr);
		Arrays.sort(arr1);
		printIntersection(arr1,arr,m , n);
	}
	
	static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
//	public static void intersection(int []a , int []b , int n , int m ) {
//		
//		if(n>m) {
//			for(int i =0;i<a.length;i++) {
//				for(int j =0;j<b.length;j++) {
//					if(a[i]==b[j]) {
//						System.out.print(a[i]+" ");
//					}
//					
//				}
//			}
//		}
//		else {
//			for(int i =0;i<b.length;i++) {
//				for(int j =0;j<a.length;j++) {
//					if(b[i]==a[j]) {
//						System.out.print(b[i]+" ");
//					}
//					
//				}
//			}
//			
//		}
//		
//	}
}
