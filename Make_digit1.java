import java.util.ArrayList;
import java.util.Scanner;

public class Make_digit1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d;
		ArrayList<Integer> d1 = new ArrayList<>();
		for(int i=0;i<n;i++) {
			d=sc.nextInt();
			d1.add(d);
		}
		int sum=0;
		int l = d1.size();
		///System.out.println(d1.get(0)*);
		for(int i = l-1;i>=0;i--) {
			sum = (int) (sum + d1.get(i)*Math.pow(10, l-1));
			l--;
		}
		System.out.println(sum);
	}

}
