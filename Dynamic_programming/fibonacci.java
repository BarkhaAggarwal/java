package Dynamic_programming;

public class fibonacci {
	public static void main(String[] args) {
	// Bottoms Up
		
		int n=10000;
		int arr[]=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=n;i++) {	
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[n]);
	}
}
