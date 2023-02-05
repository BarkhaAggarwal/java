package array_2d;

import java.util.Scanner;

public class Diagonal_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr [][]= new int [r][c];
		
		for(int i =0;i<r ; i++) {
			for(int j =0;j<c ; j++) {
				arr[r][c] = sc.nextInt();
				}
		}
		
	}
	
	public static void traverse(int a[][], int r , int c) {
		
		int i =0; //row
		int j =0 ;
		int k = c-1;
				
			  while(i<r-1) {
					if(j!=k) {
						System.out.println(a[i][j]);
						k--;
					}
//					i++;
					j++;
				}
		
		
		
		
	}
	
	

}
