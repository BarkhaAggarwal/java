package array;

import java.util.Scanner;

public class find_ali {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
		int ali = sc.nextInt();
		int cnt= 0;
		for(int i = 0;i<n ; i++) {
			if(ali==arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	
	
	
	
	}
}
