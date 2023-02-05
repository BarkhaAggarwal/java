import java.util.Scanner;

public class Prime_Fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        //int num2 = sc.nextInt();
	        for(int div=2;div*div <= num;div++){ //sieve of eratos...
	            while(num%div==0){
	                num = num/div;
	                System.out.println(div) ;
	            }
	        }


	        if(num!= 1){
	            System.out.println(num);
	        }
	}

}
