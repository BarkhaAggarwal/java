package String;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int len = st.length();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<len;i++) {
			if(st.charAt(i-1)!=st.charAt(i)) {
				sb.append(st.charAt(i-1));
			}
		}
		
		sb.append(st.charAt(len-1));
		System.out.println(sb.toString());
	
	
	}

}
