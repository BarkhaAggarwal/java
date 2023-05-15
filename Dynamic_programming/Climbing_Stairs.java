package Dynamic_programming;

public class Climbing_Stairs {
	public static void main(String[] args) {
//		int c =0;
		int n=1000;
		Integer dp[]=new Integer[n+1];
		int ans=solve(n,0,dp);
		BottomsUp(n);
		System.out.println(ans);
	}
	//static int c =0;
	public static int solve(int target,int curr,Integer dp[]) {
		if(curr>target) return 0 ;
		if(curr==target) return 1;
		if(dp[curr]!=null) return dp[curr];
		int left=solve(target, curr+1, dp);
		int right= solve(target, curr+2, dp);
		return dp[curr]=left+right;
	}
	
	public static void BottomsUp(int target) {
		int arr[]=new int[target+1];
		arr[target]=1;
		for(int i=target-1;i>=0;i--) {
			int left= arr[i+1];
			int right= 0;
			if(i+2<=target) {
				right= arr[i+2];
			}
			arr[i]=left+right;
		}
		System.out.println(arr[0]);
	}
}
