import java.util.Scanner;

public class pat0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //5
		 //int n =4;
	        int row = 0;
	        int tot = 1;
	        int print =1;
	        while(row<n){
	           int cnt = 0;
	           while(cnt< tot){
	        	   if(row>1 && cnt!=0) {
	        		   if(cnt<tot-1) {
	        			   System.out.print("0"+"\t");
	  	  	             
	        		   }
	        		   else {
	        			   System.out.print(print+"\t");
	        		   }
	        			  
	        	   }else {
	        		   System.out.print(print+"\t");
	  	             
	        	   }
	             
	             cnt++;
	           }
	           
	           print++;
	           
	           tot++;
	            row++;
	            System.out.println();
	        }
	}

}
