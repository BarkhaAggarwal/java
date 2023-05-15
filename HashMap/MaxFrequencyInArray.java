package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int a[]= new int[n];
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(frequency(a));

	}
	public static int frequency(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int maxFreq = 0;
        int maxFreqNum = -1;
		for(int a : arr) {
			int fre = hm.getOrDefault(a, 0)+1;
			hm.put(a, fre);
			
			if(fre>maxFreq) {
				maxFreq = fre;
				maxFreqNum = a;
			}
		}
		return maxFreqNum;
	}

}
