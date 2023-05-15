package Recursion2;

public class letter_key_pad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 static	String [] arr = new String[]{"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
 
 public static void letter(String arr, StringBuilder ans , int i) {
	 
	 if(ans.length()==arr.length()) {
		 System.out.println(ans);
		 return;
	 }
	 
	 letter(arr, ans, i);
	 
 }

}
