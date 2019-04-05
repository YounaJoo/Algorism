/*import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Beak_2606 {

	static int[][] computer;
	static boolean[] visit;
	static int n;
	static int m;
	
	public static int bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visit[i] = true;
		int count = 0;
		
		int temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			for(int j = 0; j <= n; j++) {
				if(computer[temp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		computer = new int[1001][1001];
		visit = new boolean[1001];
		
		int a, b = 0;
		for(int i = 1; i <= m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			computer[a][b] = computer[b][a] = 1;
		}
		
		System.out.println(bfs(1));
	}

}
*/