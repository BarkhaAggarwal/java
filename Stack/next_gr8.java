package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class next_gr8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr []= new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();		
			}
		
//int arr[]= {50,30,20,40,10,45,5,60,15,8};
//next(arr);
      next2(arr);
	}
	
	public static void next(int arr[]) {
		Stack<Integer> s = new Stack<>();
		
		
		for(int b : arr) {
			while(!s.isEmpty() && s.peek()<b) {
				int a = s.pop();
				System.out.println(a +"=>"+b);
			}
			s.add(b);
		}
	}
	
	public static void next2(int arr[]) {
		Stack<Integer> s = new Stack<>();
		
		int[] ans = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			int b = arr[i];
			while(!s.isEmpty() && arr[s.peek()]<b) {
				int a = s.pop();
				ans[a]=b;
				//System.out.println(a +"=>"+b);
			}
			s.add(i);
		}
		for(int i =0;i<ans.length;i++) {
			if(ans[i]==0) {
				ans[i]=-1;
			}
		}
		for(int i =0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
			}
		}
		
	}
	


