package String;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String st= "hello world";
 int f = st.indexOf("w");
 int f1 = st.lastIndexOf("l");
 System.out.println(f1);
 System.out.println(st.startsWith("hello"));
 System.out.println(st.endsWith("world"));
 System.out.println(st.substring(0, 10)); //ending exclusive
 
 for(int s =0;s<st.length();s++) {
	 for(int e = s+1;e<=st.length();e++) {
		 System.out.println(st.substring(s, e));
	 }
	 
 }
 
 
	}
}
