package array;

import java.util.Scanner;

public class Icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
		int light = arr[0];
		int index = 0;
		for(int i = 0;i<n ; i++) {
			if(light>arr[i]) {
				light = arr[i];
				index = i;
			}
		}
		System.out.println(index+1);
	}

}
