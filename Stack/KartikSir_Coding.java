package Stack;

import java.util.Scanner;
import java.util.Stack;

public class KartikSir_Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // number of queries
        Stack<Integer> s= new Stack<>();

        for (int i = 0; i < q; i++) {
        	int p = sc.nextInt();
        	if(p==2) {
        		int cost = sc.nextInt();
        		s.push(cost);
        	}
        	else {
        		if(!s.isEmpty()) {
        			int ans = s.pop();
            		System.out.println(ans);
        		}
        		else {
        			System.out.println("No Code");
        		}
        		
        	}
        	
        	
        	
        }
		
		
		
	}

}
