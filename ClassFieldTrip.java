package icpc;

import java.util.Scanner;

public class ClassFieldTrip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
//		int forLength = 0;
//		if(input1.length() < input2.length()) {
//			forLength = input2.length();
//		} else {
//			forLength = input1.length();
//		}
//		System.out.println(forLength);
		int sum = input1.length() + input2.length();
		int index1 = 0;
		int index2 = 0;
		StringBuilder sp = new StringBuilder();
		
		while(index1 < input1.length() && index2 < input2.length()) {
			if (input1.charAt(index1) >= input2.charAt(index2)) {
				sp.append(input2.charAt(index2));
				index2++;
			} else {
				sp.append(input1.charAt(index1));
				index1++;
			}
		}
		int length = 0;
		String smaller = "";
//		if(index1 > index2) {
//			smaller = input2;
//			length = input2.length();
//		}
//		else {
//			smaller = input1;
//			length = input1.length();
//		}
//		for(int i = Math.min(index1, index2); i < length; i ++ ) {
//			sp.append(smaller.charAt(i));
//		}
		if(index1 < input1.length()) {
			length = index1;
			smaller = input1;
		}
		else {
			length = index2;
			smaller = input2;
		}
		for(int i = length; i < smaller.length(); i ++ ) {
			sp.append(smaller.charAt(i));
		}
		String result = sp.toString();
		System.out.println(result);
	}
}
//ahjmnoy
//acijjkll