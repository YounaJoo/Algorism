/*import java.util.Scanner;

public class Beak_1850 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long gcd = gcd(Math.max(a, b), Math.min(a, b));
		
		String str = "";
		for(int i = 0; i < gcd; i++) {
			str += "1";
		}
		
		System.out.println(str);
	}
	
	static long gcd(long a, long b) {
		while(b != 0) {
			long r = a % b;
			 a = b;
			 b = r;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		for(int i = 0; i < gcd(a, b); i++) {
			System.out.print("1");
		}
	}
	
	static long gcd(long a, long b) {
		if(b == 0) return a;
		
		return gcd(b, a % b);
	}

}
*/