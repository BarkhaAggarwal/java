package String;

public class rev_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "the sky is blue";  //sc.nextLine //sentence input


		int ind = str.lastIndexOf(" ");
		
		System.out.print(str.substring(ind+1));
		
		String remain = str.substring(0,ind);
		ind = remain.lastIndexOf(" ");
		String st1= remain.substring(ind+1);
		
		System.out.print(" "+st1);
		
	
	
	
	


	}

}
