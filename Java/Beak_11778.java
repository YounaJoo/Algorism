/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Beak_11778 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int n3 = 0; int n1 = 1; int n2 = 1;

		int k = 0; int q = 0;
		
		if(n <= m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		for(int i = 3; i <= n; i++) {
			n3 = n1 + n2;
			if(i == m) {
				q = n3;
			}
			n1 = n2;
			n2 = n3;
		}
		
		k = n3;
		System.out.println(gcd(k, q));
	}
	
	public static int fibo(int n) {
		if(n <= 1)
			return n;
		else
			return fibo(n-2) + fibo(n-1);
	}
	
	public static int gcd(int a, int b) {
		while(b!=0){
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	static int gcd(int a, int b) {
		if(b == 0) return a;
		
		return gcd(b, a % b);
	}
	
}
*/