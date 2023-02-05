package String;

import java.util.Scanner;

public class canUReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int len = st.length();
		read(st,len);
	}
	public static void read(String s , int len) {
		
		
		int i;
		for(i=0;i<len;i++) {
			char c = s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				for(int k= i+1;k<len ; k++) {
					char c1 = s.charAt(k);
					if(Character.isUpperCase(c1)) {
						System.out.println(s.substring(i, k));break;
					}
				
				
				}
				
				
			}
		}
		
		System.out.println(s.substring(i));
		
		
	}

}
