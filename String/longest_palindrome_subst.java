package String;

public class longest_palindrome_subst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allPalinSS2("abaab");
	}
	public static void allPalinSS2(String str) {
		int max =0;
		int len =0;
		
		
		for (int i = 0; i < str.length(); i++) {
			 panini(str, i, i);
			 // odd , i+2 char
			panini(str, i, i + 1);// even
		}
	}
	
	public static void panini(String str, int L, int R) {
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
				String s = str.substring(L, R + 1);
				System.out.println(str.substring(L, R + 1));
				L--;
				R++;
			} else {
				return;
			}
		}
	}

}
