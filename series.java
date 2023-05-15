import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
        //int sum = 0;
      
            for(int i = 1; n>0 ; i++){
              int  sum = 3 * i + 2;
                if(sum % x != 0){
                    System.out.println(sum);
                    n--;
                }
               }
            
        
        
	}

}
