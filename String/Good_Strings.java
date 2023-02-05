package String;

public class Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void good_st(String s, int n) {
		int c =0;
		int idx=0;
		for(int i=0;i<n;i++) {
			
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' ) {
				//c=1;
				idx =i;
				if(s.charAt(i+1)=='a'|| s.charAt(i+1)=='e' || s.charAt(i+1)=='i' ) {
					c++;
				}
				
				
				
			}
			
			
			
			
		}
		
		
	}
	

}
