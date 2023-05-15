package conversion;

import java.util.Scanner;

public class pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int row = 0 ;
        int tot1 = (n+1)/2;
        int totsp = 0;
        int totsp1 = 3;
        int totp = 1 ;
        int p = 1;
        //System.out.println("************************");
        while(row<n) {
        	//star1
        	int cnt = 0;
        	while(cnt <tot1) {
        		System.out.print("*\t");
        		cnt++;
        	}
        	
        	//space
        	if(row==1) {
        		totsp = 1 ;
        	}
        	int cntsp = 0;
        	while(cntsp <totsp) {
        		System.out.print("\t");
        		cntsp++;
        	}
        	
        	//star2
        	int cnt2 = 0;
        	if(row==0 || row==n-1) {
        		cnt2= 1;
        	}
        	while(cnt2 <tot1) {
        		System.out.print("*\t");
        		cnt2++;
        	}
        	
        	
        
        	row++;
        	System.out.println();
        	if(row>n/2) {
        		tot1++;
        		totsp = totsp -2;
        	}
        	else {
        		tot1--;
        		totsp = totsp + 2;
        		
        	}
        	
        }
//        System.out.println("************************");
//        while(row<n) {
//        	int cntsp = 0;
//        	while(cntsp < totsp1) {
//        		System.out.print("\t");
//        		cntsp++;
//        	}
//        	int cnt = 0;
//        	while(cnt <totp) {
//        		
//        		if(cnt>totp/2) {
//        			p--;
//        			System.out.print(p+"\t");
//        			
//        			
//        		}
//        		else {
//        			
//        			System.out.print(p+"\t");
//        			p++;
//        			
//        		}
//        		
//        		cnt++;
//        	}
//        	
//        	
//        	 totsp1--;
//        	 totp = totp +2;
//        	
//        	row++;
//        	System.out.println();
//        }
        
        
        
	}

}
