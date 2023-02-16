package icpc;

import java.util.Dictionary;
import java.util.Scanner;
import java.util.Stack;

public class GhostLeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertical = sc.nextInt();
		int numRungs = sc.nextInt();
//		Dictionary dc = new Dictionary();

		int i = 0;
		int[][] rungOrder = new int[numRungs][2];
		int[] result = new int[vertical];

		while (i < numRungs) {
			rungOrder[i][0] = sc.nextInt();
			rungOrder[i][1] = rungOrder[i][0] + 1;
			i++;
		}

//		
		for (int j = 1; j <= vertical; j++) { // needs 1 - 7

			Stack<Integer> stack = new Stack<>();
			stack.push(j);
			for (int k = 0; k < numRungs; k++) {
				if (stack.peek() == rungOrder[k][0]) {
					stack.push(rungOrder[k][1]);
				} else if (stack.peek() == rungOrder[k][1]) {
					stack.push(rungOrder[k][0]);
				}

			}
			int destination = stack.peek();
//			System.out.println(destination);
			result[destination - 1] = j;

		}
//		System.out.println()d/;
		for (int m = 0; m < result.length; m++) {
			System.out.println(result[m]);
		}

	}
}
