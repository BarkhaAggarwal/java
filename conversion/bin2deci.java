package conversion;

import java.util.Scanner;

public class bin2deci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
int pos = 0 ;
        while(n>0){
            int rem = n % 10 ;
           // System.out.println(rem);
            sum =  sum + rem * (int)(Math.pow(2 , pos));
            System.out.println(pos+"-"+sum);
            pos++;
            n = n /10;
            }
        System.out.println(sum);

	}

}
