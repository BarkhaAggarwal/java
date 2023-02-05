package String;

import java.util.Scanner;

public class Split_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		palindrome(s1 , s2);
	}
	
	public static boolean pallin(String st) {
		int s = 0;
		int e = st.length()-1;
		while(s<e) {
			if(st.charAt(s)==st.charAt(e)) {	
			s++;
			e--;
			}
			else {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void palindrome(String s1 , String s2) {
		
		if (s1.length()== 1 && s2.length()==1) {
			
			System.out.println("true");
			
				
		}
		else if (s1.charAt(0)== s2.charAt(s2.length()-1)) {
			int i =0;
			int j =s2.length()-1;
			while(i<s1.length() && j>=0) {
				if(s1.charAt(i)==s2.charAt(j)) {
					i++;
					j--;
				}
				else {
					String pre = s1.substring(0, i);
					
					String suf = s2.substring(i);
					System.out.println(suf);
					String concat = pre+suf;
					
					System.out.println(pallin(concat));
					break;
					}
				
			}
		}
			else if (s1.charAt(s1.length()-1)== s2.charAt(0)) {
				int i = s1.length()-1;
				int j = 0;
				
				while(i>=0 && j < s2.length()) {
					if(s1.charAt(i)==s2.charAt(j)) {
						i--;
						j++;
					}
					else {
						String pre = s1.substring(0, j);
						
						String suf = s2.substring(j);
						
						String concat = pre+suf;
						
						System.out.println(pallin(concat));
						break;
						}
					}
			
			}
			else {
				System.out.println("false");
			}
		
		
	}

}
