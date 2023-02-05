package Recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(3));
		System.out.println(pow(2,5));
		System.out.println(fibonacci(5));
	}
	
	
	public static int fact(int n) {
		
		if(n==0) {
			return 1;
			}
		int sp = fact(n-1);
		return sp*n;
		
}
	
	public static int pow(int a , int b ) {
		
		if(b==0) {
			return 1;
		}
		
		int mul = pow(a,b-1);
		return mul*a;
		}
	
	
	  public static int fibonacci(int n) {
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
		if(n<=1) {
			return n;
		}
		int a = fibonacci(n-1);
		int b = fibonacci(n-2);
		
		return a + b;
		
	}

}
