package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arr[]= {-20 , 10,-5 , 4,6,-9,80,-60,50};
solve(arr, 3);
	}
	
	public static void solve(int a[] , int k) {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<k;i++) {
			if(a[i]<0) {
				q.add(i);
			}
		}
		//System.out.println(q);
		System.out.println(a[q.peek()]);
		
		for(int s=1 ;s<=a.length-k;s++) {
			if(!q.isEmpty() && q.peek()==s-1) {
				q.poll();
			}
			int e = s+k-1;
			if(a[e]<0) {
				q.add(e);
			}
			System.out.println(a[q.peek()]);
			
		}
		
	}
	
	

}
