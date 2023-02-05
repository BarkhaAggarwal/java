package String;

import java.util.Scanner;

public class odd_even {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	int len = st.length();
	
	for(int i=0;i<len;i++) {
		if(i%2==0) {
			int a = st.charAt(i);
			a = a+1;
			System.out.print((char)a);
					
		}
		else {
			int a = st.charAt(i);
			a = a-1;
			System.out.print((char)a);
					
		}
	}
	
	
}


}
