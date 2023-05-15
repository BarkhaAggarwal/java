import java.util.Scanner;

public class pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		 //int n =4;
	        int row = 0;
	        int tot = 1;
	        int print =1;
	        while(row<n){
	           int cnt = 0;
	           while(cnt< tot){
	             System.out.print(print+"\t");
	             print++;
	             cnt++;
	           }
	           
	           
	           
	           tot++;
	            row++;
	            System.out.println();
	        }
	}

}
