package array;

import java.util.Scanner;

public class rotate_img {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]= new int[n][n];
		for(int i = 0;i<n ; i++) {
			for(int j = 0;j<n ; j++)
			arr[i][j]= sc.nextInt();
		}
		rot_img(arr,n);
	}

	
	
	public static void rot_img(int a[][],int n) {
		
		for(int j=n-1;j>=0;j--) {
			for(int i =0;i<n;i++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		 
	}

}
