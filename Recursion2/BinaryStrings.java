package Recursion2;

public class BinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public static void binary(String s , StringBuilder ans) {
		
		
		
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)=='?') {
				
				binary(s, ans.append(1));
				binary(s, ans.append(0));
				
			}
		}
		
	}

}
