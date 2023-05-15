import java.util.Scanner;

public class ODD_EVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumE= 0;
        int sumO= 0;

        for(int i = 1 ; i <= num ; i++){
            int n1 = sc.nextInt();
            sumE= 0;
            sumO= 0;
            
            while(n1>0){
                int rem  = n1 % 10 ;
                if(rem % 2 == 0){
                    sumE = sumE + rem ;
                    
                }
                else{
                  sumO = sumO + rem ;
                  
                }
                
                n1 = n1 /10;

            }
            System.out.println("O="+sumO);
            System.out.println("E="+sumE);
            
               if(sumE % 4 == 0 || sumO % 3 == 0){
                    System.out.println("Yes");
                }
                else{
                   System.out.println("No");
                }
           
                
        

}
	}

}
