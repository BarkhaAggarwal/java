package array;

import java.util.Scanner;

public class Maximum_circularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
		
		for(int j =0;j<t ;j++) {
			int n = sc.nextInt();
			
			int arr1[]= new int[n];
			for(int i = 0;i<n ; i++) {
				arr1[i]= sc.nextInt();
			}
			int tot = totalSum(arr1);
			int min = minSubarray(arr1);
			int max = maxSubarray(arr1);
			int max_sub_array_sum = tot - min ;
			int ans = Math.max(max, max_sub_array_sum);
			System.out.println(ans);
		}
	}
	public static int totalSum(int arr[]) {
		int sum =0;
		for(int a : arr) {
			sum = sum + a;
		}
		return sum;
	}
	
	
	public static int maxSubarray(int [] arr) {
		int sum =0;
		int ans = Integer.MIN_VALUE;
				for(int a : arr) {
					sum = sum + a;
					ans = Math.max(ans, sum);
					if(sum<0) {
						sum = 0;
					}
				}
		//System.out.println(ans);
		return ans;
	}
	
	public static int minSubarray(int [] arr) {
		int sum =0;
		int ans = Integer.MAX_VALUE;
				for(int a : arr) {
					sum = sum + a;
					ans = Math.min(ans, sum);
					if(sum>0) {
						sum = 0;
					}
				}
		//System.out.println(ans);
		return ans;
	}

}
