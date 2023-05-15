import java.util.Scanner;

public class Boston_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        int num = sc.nextInt();
		        int sum1=0;
		        int sum2=0;
		        int backup= num;

		
			while(num>0){
		            int rem = num%10;
		            sum1 = sum1 + rem;
		            num = num / 10;
		            }
		        

		        for(int div = 2 ; div <= backup ; div++){
		            while(backup % div==0){
		            	backup = backup / div;
		                //System.out.println(div);
		            	//sum2 = sum2 + div ;
		            	}
		            while(div>0) {
	            		int rem  = div % 10;
	            		//System.out.println(rem);
	            		sum2 = sum2 + rem ;
	            		div = div / 10 ;
	            	}
		        }
		        
		         //System.out.println(sum2);

		        if(sum1 == sum2){
		        	 System.out.println("1") ;
		        }
		        else {
		        	 System.out.println("0");
		        }
		}
	

}
