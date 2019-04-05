/*import java.util.*;

public class Beak_14501 {

	static int n;
	static int ans;
	
	static int[] p = new int[16];
	static int[] t = new int[16];
	
	public static void go(int day, int total) {
		if(day == n) {
			ans = Math.max(ans, total);
			return;
		}
		
		go(day+1, total);
		if(day + t[day] <= n) {
			go(day + t[day], total+p[day]);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			t[i] = in.nextInt();
			p[i] = in.nextInt();
		}
		
		go(0, 0);
		System.out.println(ans);

	}

}
*/