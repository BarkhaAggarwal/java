package array_2d;

import java.util.Scanner;

public class Anticlockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][]=new int [n][m];
		
		for(int i =0;i<n;i++) {
			for(int j =0;j<m;j++) {
				arr[i][j] = sc.nextInt();			}
		}
		clockwise(arr, n , m);
	}
	
public static void clockwise(int a[][], int n , int m) {
		
		int i , r =0,c=0;
		
		int tot = n*m;
		int cnt =0;
		
		while(r<n && c<m) {
			if(cnt==tot) {
				break;
			}
			
			
			for(i = r ;i<n ;i++) {
				System.out.print(a[i][c]+", ");
				cnt++;
			}
			c++;
			if(cnt==tot) {
				break;
			}
			
			for(i = c ;i<m ;i++) {
				System.out.print(a[n-1][i]+", ");
				cnt++;
			}
			n--;
			
			if(cnt==tot) {
				break;
			}
			
			
			if(c<m) {
				for(i = n-1 ;i>=r ;i--) {
					System.out.print(a[i][m-1]+", ");
					cnt++;
				}
				m--;
			}
			
			
			
			if(r<n) {
				for(i = m-1;i>=c;i--) {
					System.out.print(a[r][i]+", ");
				}
				r++;
			}
			
			
			if(cnt==tot) {
				break;
			}
			
			
			
			
			
			
			
		}
		System.out.println("END");
		
	}


}
