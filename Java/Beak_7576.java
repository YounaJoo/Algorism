import java.util.*;
class Pair {
	int x;
	int y;

	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Beak_7576 {
	static int n;
	static int m;
	static int[][] box;
	static int[][] value;
	static Queue<Pair> q = new LinkedList<Pair>();
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	// ���ʿ� �� ���� �����̸� 0 ���
	// ��� �� ���� ���ϴ� �����̸� -1 ���
	// �� ���� �� ������ �ּ� �� ��

	static void bfs() {
		while (!q.isEmpty()) {
			Pair p = q.remove();
			int x = p.x;
			int y = p.y;
			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (box[nx][ny] == 0 && value[nx][ny] == -1) {
						box[nx][ny] = 1;
						value[nx][ny] = value[x][y] + 1;
						q.add(new Pair(nx, ny));
					}
				}
			}//for�� ����
		} // while�� ����
	}

	static void lastCheck() {
		// ��� �� ���� ���ϴ� �����̸� -1 ���
		// �� ���� �� ������ �ּ� �� ��
		int ans = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0) {
					System.out.println("-1");
					return;
				}
				if(value[i][j] > ans) ans = value[i][j];
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean perfect = true;
		m = sc.nextInt(); // ��
		n = sc.nextInt(); // ��
		box = new int[n][m];
		value = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				box[i][j] = sc.nextInt();
				value[i][j] = -1;
				if (box[i][j] == 1){
					value[i][j] = 0;
					q.add(new Pair(i,j));
				}
				if (box[i][j] == 0 && perfect)
					perfect = false;
			}
		}
		// ÷���� �� ���� ����
		if (perfect)
			System.out.println(0);
		// bfs
		else {
			bfs();
	             		lastCheck();
		}
	}
}