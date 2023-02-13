package array;

import java.util.Scanner;

public class Running_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
		int sum = 0;
		for(int i = 0;i<n ; i++) {
			sum = sum + arr[i];
			arr[i]= sum ;
		}
		for(int a :arr) {
			System.out.print(a+" ");
		}
	}

}
