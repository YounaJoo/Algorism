import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int co[][] = new int[num][2];
		
		for(int i = 0; i < num; i++) {
			co[i][0] = sc.nextInt();
			co[i][1] = sc.nextInt();
		}
		
		Arrays.sort(co, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				else {
					return Integer.compare(o1[0], o2[0]);	
				}
			}
		});
		
		for(int i = 0; i < num; i++) {
			System.out.println(co[i][0] + " " + co[i][1]);
		}
		sc.close();
	}
}
