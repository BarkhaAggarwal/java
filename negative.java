import java.util.Scanner;

public class negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		while(true) {
			int n=s.nextInt();
			if(n<0 || n>1000) {
				break;
			}
			else {
				System.out.println(n);
			}
		}
		
	}

}
