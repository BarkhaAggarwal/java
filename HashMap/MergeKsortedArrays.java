package HashMap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		int arr[][]= new int[k][n];
		for(int i =0;i<k;i++) {
			for(int j =0;j<n;j++) {
			arr[i][j] = sc.nextInt();
		}
	}

	        
	        // Create a min heap and add all elements of the 2D array
	        PriorityQueue<Integer> minHeap = Arrays.stream(arr)
	                .flatMapToInt(Arrays::stream)
	                .collect(PriorityQueue::new, PriorityQueue::add, PriorityQueue::addAll);
	        
	        // Print the elements of the min heap in sorted order
	        while (!minHeap.isEmpty()) {
	            System.out.print(minHeap.poll() + " ");
	        }
	}

}
