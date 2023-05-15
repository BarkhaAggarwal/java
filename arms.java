import java.util.Scanner;

public class arms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int cnt = 0;
         int bckup = n ;
        while(n>0){
            int rem = n %10;
            n = n /10;
            cnt++;
        }
        n = bckup;
       int sum =0;
        //int p = (int)Math.pow(10 , cnt);
        while(bckup>0){
            int rem = bckup %10;
            sum = sum + (int)Math.pow(rem , cnt);
            bckup = bckup /10;
            
        }
        if(sum==n) {
        	System.out.println("True");
        }else {
        	System.out.println("False");
        }
	}

}
