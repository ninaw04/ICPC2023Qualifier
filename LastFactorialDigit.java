package icpc;

import java.util.Dictionary;
import java.util.Scanner;
import java.util.Stack;

public class LastFactorialDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		int[] array = new int[amt];
		for (int i = 0; i < amt; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if(array[i] == 1 || array[i] == 2 || array[i] == 4) {
				System.out.println(array[i]);
			}
			if(array[i] == 3) {
				System.out.println(6);
			}
			if(array[i] >= 5) {
				System.out.println(0);
			}
		}
	}

}
