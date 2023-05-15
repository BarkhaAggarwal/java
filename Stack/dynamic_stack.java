package Stack;

public class dynamic_stack extends stack{

	@Override
	public void add(int ali) {
		if(isFull()) {
			grow();
		}
		super.add(ali);
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	private void grow() {
		int[] biggy = new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			biggy[i] = arr[i];
		}
		this.arr = biggy;	

}
}
