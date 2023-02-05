package String;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st = "NITIN";
  pallin(st);

	}
	
	public static void pallin(String st) {
		int s = 0;
		int e = st.length()-1;
		while(s<e) {
			if(st.charAt(s)==st.charAt(e)) {	
			s++;
			e--;
			}
			else {
				System.out.println("false");
			}
			
		}
		
		System.out.println("true");
		
	}
	
	
	
}
