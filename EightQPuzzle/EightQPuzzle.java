package icpc;

import java.util.ArrayList;
import java.util.Scanner;

public class EightQPuzzle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		ArrayList<int[]> al = new ArrayList<>();
		for(int i = 0; i < amt; i++) {
			al
		}
	}

	public boolean verify(ArrayList<int[]> al, int[] queen) {
		for(int i = 0; i < al.size(); i++) {
			if(queen[0] == al.get(i[0])) {
				return false;
			}
			if(queen[1] == al.get(i[1])) {
				return false;
			}
			if((queen[0] - i[0])/(queen[1] - i[1])) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * find slope between two queens, stored in arrayList
	 * not valid if new queen has same x and y coordinates
	 * also check not valid if slope is 1
	 */
}
