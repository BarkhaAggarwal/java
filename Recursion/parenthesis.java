package Recursion;

public class parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
generate(0, 0, "", 3);
	}
	
public static void generate(int op , int cl , String path , int n) {
		
		if (op == n && cl == n) {
			System.out.println(path);
			return;
		}
		if(op<cl) {
			return;
		}
		
		if (cl < n) {
			generate(op, cl + 1, path + ")", n);
		}
		if (op < n) {
			generate(op + 1, cl, path + "(", n);
		}
	}

}
