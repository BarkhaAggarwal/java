package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);

		q.add(40);
		print(q);
		System.out.println("***********");
		rec(q,0);
		System.out.println("***********");
		System.out.println(q);

	}
	
	public static void  print(Queue<Integer>q) {
		
		for(int i =1 ;i<=q.size();i++) {
			int ans = q.poll();
			System.out.println(ans);
			q.add(ans);
		}
	
		System.out.println();
	}

	
public static void  rec(Queue<Integer>q, int c) {
		if(c==q.size()) {
			return;
		}
		
			int ans = q.poll();
			q.add(ans);
			
		rec(q , c+1);
		System.out.println(ans);
			
			
			
			
		
	
		
	}

}
