import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_BFS_1260 {
	static int[][] graph;
	static boolean[] visit;
	static int n;
	static int m;
	static int sp;
	
	public static void dfs(int i) {
		visit[i] = true;
		System.out.print(i + " ");
		for(int j = 1; j <= n; j++) {
			if(graph[i][j] == 1 && visit[j] == false) {
				dfs(j);
			}
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visit[i] = true;
		System.out.println();
		System.out.print(i + " ");
		
		int temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			for(int j = 0; j < n+1; j++) {
				if(graph[temp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		graph = new int[1001][1001];
		visit = new boolean[1001];
		
		n = sc.nextInt();	
		m = sc.nextInt();	
		sp = sc.nextInt();
		
		int a, b = 0;
		for(int i = 1; i <= m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			graph[a][b] = graph[b][a] = 1; 
		}
		
		dfs(sp);
		for(int i = 1; i <= n; i++) {
			visit[i] = false;
		}
		bfs(sp);
	}
}
