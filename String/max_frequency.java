package String;

import java.util.Scanner;

public class max_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int len = st.length();
		max_f(st, len);
		
	}
	
	public static void max_f(String s, int len) {
		
		int max=0;
		char a = 0;
		for(int i=0;i<len;i++) {
			int c = 0;
			for(int j =0;j<len;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					}
				
				
				
			}
			if(c>max) {
				max = c ;
				a = s.charAt(i);
			}
		}
		System.out.println(a);
		
	}
	
	

}
