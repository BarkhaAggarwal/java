package Dynamic_programming;

import java.util.HashMap;

public class longest_common_subsequence {
	public static void main(String[] args) {
		
		//System.out.println(solve("barkha","brhacd"));
		String s = "bbbab";
		String ss = rev(s);
		System.out.println(ss);
		System.out.println(lcs(s, ss));
		
	}
	public static String rev(String s) {
		String str = null;
		for(int i =s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			str = str+ch;
		}
		return str;
	}
	
	static HashMap<String,Integer> map=new HashMap<>();
	public static int solve(String s1, String s2) {
		if(s1.length()==0 || s2.length()==0) {
			return 0;
		}
		if(map.containsKey(s1+" "+s2)) return map.get(s1+" "+s2);
		if(s1.charAt(0)== s2.charAt(0)) {
		   int a= 1+solve(s1.substring(1),s2.substring(1));
		   map.put(s1+" "+s2, a);
		   return a;
		}
		else {
			int a = 0+solve(s1,s2.substring(1));
			int b = 0+solve(s1.substring(1),s2);
			int ans= Math.max(a, b);
			map.put(s1+" "+s2,ans );
			return ans ;
		}		
	}
	
	public static int lcs(String s1 , String s2) {
		int dp[][]= new int[s1.length()][s2.length()];
		for(int i = 0;i<s1.length();i++) {
			for(int j =0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					int sp1= 1;
					if(i-1>=0 && j-1>=0) sp1= 1+dp[i-1][j-1];
					dp[i][j]=sp1;
				}
				else {
				 int sp1=0;
				 int sp2=0;
				if(i-1>=0) sp1= 0+dp[i-1][j];
				if(j-1>=0) sp2= 0+dp[i][j-1];
				dp[i][j] = Math.max(sp1, sp2);
				 
				}
			}
				
		}
		return dp[s1.length()-1][s2.length()-1];
		
	}
	
}
