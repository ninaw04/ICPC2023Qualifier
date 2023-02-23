package icpc;

import java.util.Scanner;

public class SCV {
	public static int[] operations(int one, int two) {
		int sum = one + two;
		int sub = one - two;
		int mult = one * two;
		int div = one%two == 0? one/two : -1;
		int[] toReturn = {sum, sub, mult, div};
//		System.out.println(sum + " " + sub + " " + mult + " " + div);
		return toReturn;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] ops1 = operations(a, b);
		int[] ops2 = new int[4];
		int[] mins = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
		for(int i = 0; i < ops1.length; i ++) {
			if(i==3 && ops1[i] ==-1) {
				continue;
			}
			else {
				ops2 = operations(ops1[i], c);
				int min = Integer.MAX_VALUE;

				for(int j = 0; j < ops2.length; j ++) {
					if(ops2[j] >= 0) {
						min = Math.min(min, ops2[j]);
					}
					
				}
				mins[i] = min;
				
			}
		}
		int finalMin = Integer.MAX_VALUE;
		for(int m = 0; m < mins.length; m++) {
//			finalMin = mins[m]!=-1 ? Math.min(finalMin, mins[m]) : continue;
			if(mins[m]>=0) {
				finalMin = Math.min(finalMin, mins[m]);
			}
		}
		System.out.println(finalMin);
		//perform operstions take in 2 parameters
	}
	
}
