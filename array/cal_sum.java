package array;

import java.util.Scanner;

public class cal_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int[n];
		int mod = (int) (1e9+7);
		
		int sum = 0;
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
			sum += arr[i];
			//sum %= mod;
			
		}
		
		int ts = sum;
		int q = sc.nextInt();
		for(int i =0;i<q;i++) { //use mat.pow(2,n)
			int x = sc.nextInt();
			
			sum += ts;
			ts = sum;
			
			sum %= mod;
			}
		
		System.out.println(sum%mod);
		
		
		
		
		}
	

}
