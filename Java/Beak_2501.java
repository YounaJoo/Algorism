/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Beak_2501 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int n, k;
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				k--;
				if(k == 0) {
					System.out.println(i);
					break;
				}
			}
		}
		
		if(k!=0) {
			System.out.println(-1);
		}
		
		Collections.sort(result);
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
		
		if(result.size() >= k) {
			System.out.print(result.get(k-1));
		}else {
			System.out.print(-1);
		}
	}
}
*/