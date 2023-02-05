package array;

import java.util.Scanner;

public class arr_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [][]= new int [3][5];
//Scanner sc = new Scanner(System.in);
int p =1;
for(int i = 0 ; i<3 ; i++) {
	for(int j = 0;j<5 ; j++) {
		arr[i][j]= p;
		p++;
		}
}

for(int [] row : arr) {
	for(int a :row) {
		System.out.print(a+"\t");
	}
	System.out.println();
}

	}

}
