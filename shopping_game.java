import java.util.Scanner;

public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i = 1 ; i <= t ; i++) {
    	   int M = sc.nextInt(); //ayush
           int N = sc.nextInt(); //HARSHIT
           
           
           if(M>N) {
        	   System.out.println("Aayush");
           }
           else if(M==N) {
        	   if(M==1 || N==1) {
        		   System.out.println("Aayush");
        	   }else {
        		   System.out.println("Harshit");
        	   }
        	   
           }
           
           else {
        	   System.out.println("Harshit");
           }
           
           
      
       }
       
           
           


	}

}
