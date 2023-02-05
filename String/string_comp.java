package String;

import java.util.Scanner;

public class string_comp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		
		int c = 1;
		for(int i =1;i<len;i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				c++;
			}
			else {
				sb.append(s.charAt(i-1));
				if(c!=1) {
					sb.append(c);
				}
				c=1;
			}
			
			
		}
		
		sb.append(s.charAt(len-1));
		if(c!=1) {
			sb.append(c);
		}
		System.out.println(sb.toString());
		
	}	

}
