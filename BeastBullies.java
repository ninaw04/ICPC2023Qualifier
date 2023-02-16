package icpc;

import java.util.Arrays;
import java.util.Scanner;

public class BeastBullies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		
		int[] animals = new int[amount];
		for (int i = 0; i < amount; i++) {
			animals[i] = sc.nextInt();
		}
		Arrays.sort(animals);
		int k = animals.length -2;
		int sum  = 0;
		while(k >= 0 && sum < animals[animals.length-1]) {
			sum += animals[k];
			k--;
		}
		//everyone to the left is dead
		int weaker = 0;
		int m;
		for(m = 0; m < animals.length-1; m++) {
			weaker += animals[m];
		}
		int dies = 0;
		if(weaker < animals[amount-1]) {
			dies = m;
		} 
		else {
			dies = 1;
		}
		System.out.println(amount-dies);
	}
}
