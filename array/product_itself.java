package array;

import java.util.Scanner;

public class product_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
		product(arr,n);
	}
	
	
	public static void product(int arr[], int n ) {
		
		if (n == 1) {
            System.out.print("0");
            return;
        }
		
		
		int mul =1;
		
		for(int i =0;i<n;i++) {
			mul = mul*arr[i];
		}
		

		for(int i =0;i<n;i++) {
			arr [i] = mul / arr [i];
		}
		

		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
