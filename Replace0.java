import java.util.Scanner;

public class Replace0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

long sum = 0;
long sum1 = 0;

if (num == 0){
	System.out.println(5);
	}
else{  
	while(num>0){
        	   long rem = num % 10;
                    if (rem == 0){
                        rem = 5;
                    }
                    sum = sum * 10 + rem ;
                    num = num / 10 ;
        		}
	
	while(sum > 0){
        long rem = sum % 10;
      sum1 = sum1 * 10 + rem ;
       sum = sum / 10 ;
      }
	System.out.println(sum1);
        }

        


	}

}
