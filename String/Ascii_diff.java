package String;

import java.util.Scanner;

public class Ascii_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int len = st.length();
		
		int a = 0 ;
		
		for(int i=0;i<len;i++) {
			if(i<=len-2) {
				 a = st.charAt(i+1)-st.charAt(i);
				 System.out.print(st.charAt(i));
					System.out.print(a);
			}
			else {
				System.out.print(st.charAt(i));
			}
			
			
			
		}
		
	}

}
