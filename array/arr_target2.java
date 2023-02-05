package array;

import java.util.Scanner;

public class arr_target2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
		int find = sc.nextInt();
		
		for(int i = 0;i<n ; i++) {
			for(int j = i+1;j<n;j++) {
				if(find==(arr[i]+arr[j])) {
					System.out.println(arr[i]+" and "+arr[j]);
					
				}
			}
			
		}
		
	}

}
