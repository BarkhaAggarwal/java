package array;

public class Kadance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,-40};
		kadancee(arr);

	}
	public static void kadancee(int [] arr) {
		int sum =0;
		int ans = Integer.MIN_VALUE;
				for(int a : arr) {
					sum = sum + a;
					ans = Math.max(ans, sum);
					if(sum<0) {
						sum = 0;
					}
				}
		System.out.println(ans);
	}

}
