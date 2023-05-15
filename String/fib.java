package String;

public class fib {
	public static void main(String[] args) {

		System.out.println(fibonacci(5));
	}

	public static int fibonacci(int n) {
		if(n<=1) return n;
		int left=fibonacci(n-1);
		int right=fibonacci(n-2);

		return left+right;
	}
}

