package String;

public class LP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean palindrome(String s , int l , int r ) {
		
//		int l =0 ;
//		int r = s.length()-1;
		while(l<=r) {
			if(s.charAt(l)==s.charAt(r)) {
				l++;
				r--;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	
public static  void check(String s) {
		
	int max = 0;
	String ans="";
	
	for(int i = 0 ;i<s.length();i++) {
		for(int j = i ;j<s.length();j++) {
			if(palindrome(s,i , j)) {
		
			}
		}
	}
	
	
	}
}
