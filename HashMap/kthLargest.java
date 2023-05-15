package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[]= new int[n];
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(k_largest(a, k));
		

	}
	public static int k_largest(int arr[], int k) {
		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++){
			p.add(arr[i]);
		}
		int ans = 0;
		for(int i =0;i<k ;i++) {
			ans = p.poll();
		}
		return ans;
	}
}
