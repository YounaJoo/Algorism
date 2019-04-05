/*import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Line_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split("");
		
		ArrayList<String> list = new ArrayList<String>();
		int[] alpha = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			alpha[str.charAt(i) - 'A']++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] != 0) {
				int ch = 'A' + i;
				System.out.print((char)ch + " " + alpha[i] + " ");
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
        
		int[] alpha = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			alpha[str.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}
		
	}

}
*/