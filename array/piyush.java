package array;

import java.util.Scanner;

public class piyush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		char arr[][]= new char[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.next().charAt(0);
				
			}
		}
		
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(s<k) {
					break;
				}
				else if(arr[i][j]=='.') {
					s = s-2;
					s= s-1;
				}
				else if(arr[i][j]=='*') {
					s = s+5;
					
					s = s-1;
				}
				else if(arr[i][j]=='#') {
					//j = m-1;
				break;
				}
				else if(j == m-1){
					s = s+1;
				}
				
				
//				. . * .
//				. # . .
//				* * . .
//				. # * *
			
				}
			System.out.println(s);
			}
		
		if(s>k) {
			System.out.println("Yes");
			System.out.println(s);
			
		}
		else {
			System.out.println("No");
		}
		

	}

}
