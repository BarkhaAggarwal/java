package String;

import java.util.Scanner;

public class toggle_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char st1;
		String s1;
		int len = st.length();
		
		for(int i=0;i<len;i++) {
			char s =st.charAt(i); 
			if(Character.isUpperCase(s)) {
				st1=Character.toLowerCase(s);
			}
			else {
				st1=Character.toUpperCase(s);
			}
			
			System.out.print(st1);
			
				
			
		}
		

	}

}
