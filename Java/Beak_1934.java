/*import java.util.Scanner;

public class Beak_1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		long[][] a = new long[n][2];
		
		for(int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(lcm(a[i][0], a[i][1]));
		}
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) 
			return a;
		
		return gcd(b, a % b);
	}
	
	public static long lcm(long a, long b) {
		int re = gcd((int)a, (int)b);
		
		if(re == 0) {
			return 0;
		}
		
		return Math.abs(a * b / re);
	}
}

*/