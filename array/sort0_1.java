package array;

import java.util.Scanner;

public class sort0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int[n];
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		int cnt =0;
		for(int i = 0;i<n;i++) {
			if(arr[i]==0) {
				cnt++;
			}
		}
		
		for(int i =0;i<cnt;i++) { 
			arr[i]= 0;
		}
		
		for(int i =cnt;i<n;i++) { 
			arr[i] = 1;
		}
		
		for(int a : arr) {
			System.out.print(a +" ");
		}
		
	}

}
