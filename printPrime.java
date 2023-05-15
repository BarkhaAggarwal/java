import java.util.Scanner;

public class printPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//       
//        
//        for(long i=2;i<=n;i++){
//           long isPrime = 0;
//            for(long j=2;j<=i/2;j++){
//                if(i%j==0){
//                    isPrime = 1;
//                    break;
//                }
//                
//            }
//            if (isPrime == 0 && n != 1){
//             System.out.println(i); 
//            }
//            }
		int digit = sc.nextInt();
        int num =0;
        for(int i = 1 ; i <=digit;i++){
            int n = sc.nextInt();
            num = num*10 + n ;
        }
        //System.out.println(num); 
        int res =0;
        while(num>0) {
        	int rem = num % 10 ;
        	num = num/10;
        	res = res *10 + rem ;
        }
        System.out.print(res); 
	}

}
