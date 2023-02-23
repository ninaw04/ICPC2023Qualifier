package pacnw_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class DoublePassword {
	private static final Reader Reader = null;

	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String pswd1 = sc.readLine();
		
		String pswd2 = sc.readLine();
//		while(())
		
//		BufferedReader br = new BufferedReader(Reader in);
		int count = 1;
		for(int i = 0; i < 4; i++) {
			if (pswd1.charAt(i) != pswd2.charAt(i)) {
				count *= 2;
			}
		}
		
//		System.out.println((int)Math.pow(2, count));
		System.out.print(count);
	}
}
