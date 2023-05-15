package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianOfRunningString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			
			int a[]= new int[n];
			for(int j =0;j<n;j++) {
				a[i] = sc.nextInt();
			}
			Median(a);
			System.out.println();
			
		}
		

	}
	public static void Median(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();
		for (int ali : arr) {
			if (Left.isEmpty() || ali < Left.peek()) {
				Left.add(ali);
			} else {
				Right.add(ali);
			}
			if (Left.size() - Right.size() > 1) {
				Right.add(Left.poll());
			}
			if (Right.size() - Left.size() > 1) {
				Left.add(Right.poll());
			}
			if (Left.size() == Right.size()) {
				System.out.println((Left.peek() + Right.peek()) / 2+" ");
			} else if (Left.size() > Right.size()) {
				System.out.print(Left.peek()+" ");
			} else {
				System.out.print(Right.peek()+" ");
			}
		}

	}
	public static int[] intersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int ali : arr2) {
//			if (HM.containsKey(ali)) {
//				int prev = HM.get(ali);
//				HM.put(ali, prev + 1);
//			} else {
//				HM.put(ali, 1);
//			}
			int prev = HM.getOrDefault(ali, 0);
			HM.put(ali, prev + 1);
		}
		System.out.println(HM);
		for (int ali : arr1) {
			if (HM.containsKey(ali) && HM.get(ali) > 0) {
				al.add(ali);
				//System.out.println(ali);
				int prev = HM.get(ali);
				HM.put(ali, prev - 1);
			}
		}
		int aa[]= new int[al.size()];
		for(int i=0;i<al.size();i++) {
			aa[i]= al.get(i);
		}
		return aa;
		
	}
	
	public static void chain(int[] arr) {
//		input =  [2,12,9,16,10,5,3,20,25,11,1,8,6]
//      output=    8,9,10,11,12
		HashSet<Integer> Set = new HashSet<>();
		for (int ali : arr) {
			Set.add(ali);
		}
		for (int ali : arr) {
			if (!Set.contains(ali - 1)) {
				int s = ali;
				while (Set.contains(s)) {
					System.out.print(s + " ");
					s++;
				}
				System.out.println();
			}
		}
	}
}
