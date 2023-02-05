package Recursion;

public class pt_series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increasing(1,4);
	}

	
	
	public static void increasing(int i , int n) {
		if(i>n) {
			return;  //base case
		}
		System.out.println(i);
		increasing(i+1,n);   //smaller problem
		
	}
}
