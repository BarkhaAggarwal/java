package String;

import java.util.Scanner;

public class long_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i=0;i<t;i++) {
			sc.nextLine();
			String s = sc.nextLine();
			
			int k = sc.nextInt();
			long_string(s,k);
		}
		
	}

	public static void long_string(String s, int k) {
		int c=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				c++;
			}
		}
		
		if(c==k) {
			int len = s.length();
			System.out.println(len);
		}else {
			System.out.println("-1");
		}
		
		
		
	}
	
	
}
