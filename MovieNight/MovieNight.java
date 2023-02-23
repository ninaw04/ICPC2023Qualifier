package icpc;

import java.util.Scanner;

public class MovieNight {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int x = 0;
		int[] input = new int[amount];
		while(x < amount) {
			input[x] = sc.nextInt();
			x++;
		}
		int[][] arr = new int[amount-1][2];
		int count = 0;
		for(int j = 0; j < input.length-1; j ++) {
			arr[count][0] = input[j];
			arr[count][1] = input[j+1];
//			System.out.println(arr[count][0] + " "+ arr[count][1]);
			count++;
		}
		int sol = 0;
		for(int m = 1; m < arr.length; m ++) {
			if(arr[m][0] == arr[m-1][0]) {
				sol++;
//				System.out.println("here" + m + " " + (m-1));
			}
			if(arr[m][0] == arr[m-1][1]) {
				sol ++;
//				System.out.println("here" + m + " " + (m-1));
			}
			if(arr[m][1] == arr[m-1][0]) {
				sol++;
//				System.out.println("here" + m + " " + (m-1));
			}
			if(arr[m][1] == arr[m-1][1]) {
				sol++;
//				System.out.println("here" + m + " " + (m-1));
			}
		}
		System.out.println(sol);
		
		
		
		
	}
}
