import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class DoublePassword {

	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		try{
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			String pswd1 = sc.readLine();
			
			String pswd2 = sc.readLine();
			int count = 1;
			for(int i = 0; i < 4; i++) {
				if (pswd1.charAt(i) != pswd2.charAt(i)) {
					count *= 2;
				}
			}
			System.out.print(count);
		}
	
		catch(IOException e){
			e.printStackTrace();
		}
//		BufferedReader br = new BufferedReader(Reader in);
		
	}
}
