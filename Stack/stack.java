package Stack;

public class stack {
 int[]arr;
 int tos ;



public stack() {
	this(5); //constructor chaining
}

public stack(int cap) {
	tos = -1;
	arr = new int[cap];
}

public int size() {
	return tos + 1;
}
public void add(int ali) {
	if(size()==arr.length) {
		throw new RuntimeException("full hun bhai");
	}
	tos++;
	arr[tos] = ali;
}

public int peek() {
	if(isEmpty()) {
		throw new RuntimeException("empty");
	}
	return arr[tos];
}

public boolean isEmpty() {
	// TODO Auto-generated method stub
	return size()==0;
}

public int pop() {
	if(isEmpty()) {
		throw new RuntimeException("empty");
	}
	int ans = arr[tos];
	tos--;
	return ans;
}
public void disp() {
	for(int i=0;i<=tos;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	
}
