/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Beak_11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] a = new int[num];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < num; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		//Quick(a, 0, a.length-1);
		
		//for(int i = 0; i < num; i++) {
			//System.out.print(a[i]);
		//}
		
		Arrays.sort(a);
		
		br.close();
		
		System.out.println(a[k-1]);
		
	}
	
	public static void Quick(int[] list, int start, int end) {
		if(start < end) {
			int t = partition(list, start, end);
			Quick(list, start, t-1);;
			Quick(list, t+1, end);
		}
	}
	
	public static int partition(int[] list, int start, int end) {
		
		int pivot = list[end];
		int idx = start - 1;
		
		for(int i = start; i < end; i++) {
			if(list[i] < pivot){
				int j = ++idx;
				int temp = list[j];
				list[j] = list[i];
				list[i] = temp;
			}
		}
		
		int j = ++idx;
		int temp = list[j];
		list[j] = list[end];
		list[end] = temp;
		
		return idx;
	}

}
*/