package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr []=new int[n];
		for(int i=0;i<n ;i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println(largestRectangleArea(arr));
		largestRectangleArea(arr);

	}
	
	public static void largestRectangleArea(int[] heights) {
		
		int n = heights.length;
		Stack<Integer> s = new Stack<>();
		int left[]= new int [n];  //smaller
		int right[]= new int [n];
		
		for(int i=0;i<n;i++) {
			if(s.isEmpty()) {
				left[i] = -1;
				s.push(i);
			}
			else {
				while(!s.isEmpty() && heights[s.peek()]>heights[i]) {
				s.pop();
				s.push(i);
					}
				
				if(s.isEmpty()) {
					left[i] = -1;
					s.push(i);
				}
				
			}
			
			
				
				
		}
		
		System.out.println(Arrays.toString(left));	
	}

}
