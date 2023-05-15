package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr []=new int[n];
		for(int i=0;i<n ;i++) {
			arr[i]=sc.nextInt();
		}
		int ans[]=calculateSpan(arr);
		for(int i :ans) {
			System.out.print(i+" ");
		}
		System.out.println("END");
	}
	
	public static int[] calculateSpan(int[] prices) {
	    int n = prices.length;
	    int[] spans = new int[n];
	    Stack<Integer> stack = new Stack<>();
	    for (int i = 0; i < n; i++) {
	        while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
	            stack.pop();
	        }
	        if (stack.isEmpty()) {
	            spans[i] = i + 1;
	        } else {
	            spans[i] = i - stack.peek();
	        }
	        stack.push(i);
	    }
	    return spans;
	}
}
