package array;

import java.util.Arrays;
import java.util.Scanner;

public class roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int n = 0;n<t;n++) {
			int available = sc.nextInt(); 
			
			int price[]= new int[available];
			
			for(int m = 0;m<available;m++) {
			 price[m] = sc.nextInt();
			}
			int money = sc.nextInt();
			 Arrays.sort(price);
			for(int i = 0;i<price.length-1;i++) {
				for(int j = i+1;j<price.length;j++) {
					if(money == price[i]+price[j]) {
						
						System.out.println("Deepak should buy roses whose prices are "+price[i]+" and "+price[j]);
					}
////						2
//					2
//					40 40
//					80
//
//					5
//					10 2 6 8 4
//					10
//					
				}
				}
		}
		

	}

}
