import java.util.Scanner;

public class basic_cal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 char ch = sc.next().charAt(0);
	       
	       while(true){
	    	   if(ch=='X'||ch=='x'){
	    			break;
	    		}
	    	   
	    	   if(ch == '+') {
	    		   int a = sc.nextInt();
	    		   int b = sc.nextInt();
	    		   System.out.println( a+b );
	    	   }
	    	   else if(ch == '-') {
	    		   int a = sc.nextInt();
	    		   int b = sc.nextInt();
	    		   System.out.println( a-b );
	    	   }
	    	   else if(ch == '/') {
	    		   int a = sc.nextInt();
	    		   int b = sc.nextInt();
	    		   
	    		   System.out.println( a/b );
	    	   }
	    	   else if(ch == '*') {
	    		   int a = sc.nextInt();
	    		   int b = sc.nextInt();
	    		   System.out.println( a*b );
	    	   }
	    	   else if(ch == '%') {
	    		   int a = sc.nextInt();
	    		   int b = sc.nextInt();
	    		   System.out.println( a%b );
	    	   }
	    	   else {
	    		   System.out.println("Invalid operation. Try again.");
	    		   
	    	   }
	    	   ch = sc.next().charAt(0);
	    	   
	       }
//.out.println("Invalid operation. Try again.");

	}

}
