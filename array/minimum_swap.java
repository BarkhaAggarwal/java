package array;

import java.util.Scanner;

public class minimum_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i = 0;i<n ; i++) {
			arr[i]= sc.nextInt();
		}
		minimumSwaps(arr);

	}
	public static void minimumSwaps(int[] arr) {
        int i =0;
        int count=0;
        int temp;
        int  n = arr.length;
        while(i<n){
            if(arr[i] != i+1){
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                count++;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}
