package array;

import java.util.Scanner;

public class wave_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][]= new int[n][m];
		for(int i = 0;i<n ; i++) {
			for(int j = 0;j<m ; j++)
			arr[i][j]= sc.nextInt();
		}
		wave_row(arr,n,m);
	}
	
	public static void wave_row(int arr[][],int n , int m){
		
		
		
		for(int r=0;r<n;r++) {
			if(r%2==0) {
				for(int c = 0;c<m;c++) {
					System.out.print(arr[r][c]+" ");
					
				}
			}
			else {
				for(int c = m-1;c>=0;c--) {
					System.out.print(arr[r][c]+" ");
					
				}
				
			}
			System.out.println();
		}
		
		
		
	}
	

}
