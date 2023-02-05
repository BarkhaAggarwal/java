package array;

import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int[n];
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		int max =0;
		int index = -1;
		for(int i =0;i<n;i++) {
			int c = 0;
			for(int j = 0;j<n;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>max) {
				max = c ;
				index = i ;
			}
		}
		
		if(max>n/2) {
			System.out.println(arr[index]);
		}
		
		
	}

}
