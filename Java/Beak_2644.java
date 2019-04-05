/*import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Beak_2644 {

	static int[][] graph;
	static boolean[] visit;
	static int n;
	static int m;
	static int[] count = new int[1001];
	
	public static void bfs(int sp, int ep) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(sp);
		visit[sp] = true;
		
		
		int temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			for(int j = 0; j < n+1; j++) {
				if(graph[temp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
					count[j] = count[temp] + 1;
					System.out.println(temp);
					System.out.println(count[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		graph = new int[1001][1001];
		visit = new boolean[1001];
		
		int start, end;
		
		n = sc.nextInt();
		
		start = sc.nextInt();
		end = sc.nextInt();
		
		m = sc.nextInt();
		
		int a, b = 0;
		for(int i = 1; i <= m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			graph[a][b] = graph[b][a] = 1; 
		}
		
		bfs(start, end);
		
		if(count[end] != 0) {
			System.out.println(count[end]);
		}else {
			System.out.println(-1);
		}
	}

}
*/