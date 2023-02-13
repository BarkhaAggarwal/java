package array;

import java.util.Scanner;

public class MaxPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int j =0;j<t ;j++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr1[]= new int[n];
			for(int i = 0;i<n ; i++) {
				arr1[i]= sc.nextInt();
			}
			int arr2[]= new int[m];
			for(int i = 0;i<m ; i++) {
				arr2[i]= sc.nextInt();
			}
			
			maxSumPath(arr1 , arr2, n , m);
		}
		
	}
	public static int max(int x, int y){
		   return (x > y)? x : y;
		}
	
	
	public static void maxSumPath(int arr1[], int arr2[], int n , int m) {
		int i =0 , j =0;
		int sum1=0, sum2=0;
		int res =0;
		
		while(i <n && j<m) {
			if(arr1[i]<arr2[j]) {
				sum1 = sum1 + arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				sum2 = sum2 + arr2[j];
				j++;
			}
			else {
				res += max(sum1 , sum2);
				System.out.println(res);
				
				sum1 =0;
				sum2 =0;
				while(i<n && j<m && arr1[i]==arr2[j]) {
					res = res + arr1[i];
					System.out.println(res);
					
					i++;
					j++;
					
				}
				
			}
		}
		
		
		while(i<n) {
			sum1 = sum1 + arr1[i];
			
			i++;
		}
		while(j<m) {
			sum2 = sum2 + arr2[j];
			j++;
		}
		
		res += max(sum1,sum2);
		
		System.out.println(res);
		
	}


}
