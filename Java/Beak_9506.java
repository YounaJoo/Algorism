/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class Beak_9506 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		
		while(true) {
			n = sc.nextInt();			
			if(n == -1) {
				break;
			}
			ArrayList<Integer> list = gcd(n);
			
			Collections.sort(list);
			
			String str = "";
			int temp = n;
			for(int i = 0; i < list.size(); i++) {
				int num = list.get(i);
				temp -= num;
				str += num;
				if(i + 1 < list.size()) {
					str += " + ";
				}	
			}
			
			if(temp == 0) {
				System.out.println(n + " = " + str);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
	
	public static ArrayList<Integer> gcd(int a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i < a; i++) {
			if(a % i == 0) {
				list.add(i);
			}
		}
		
		return list;
	}
	
	// Queue »ç¿ë
	public static void main(String[] args) {
        Queue<String> num = new LinkedList<>();
        Queue<String> q = new LinkedList<>(); 
        String a = null;
        Scanner sc = new Scanner(System.in);
        while(true) {
            a=sc.next();
            if(Integer.parseInt(a)==-1)break;
            num.offer(a);
        }
        while(true) {
            if(num.peek()==null)break;
            int per=0;
            for(int j=1;j<Integer.parseInt(num.element());j++) {
                if(Integer.parseInt(num.element())%j==0) {
                    q.offer(String.valueOf(j));
                    per=per+j;
                }
            }
            if(per==Integer.parseInt(num.element())) {
                System.out.print(num.element()+" = ");
                while(q.size()!=1) {
                    System.out.print(q.poll()+" + ");
                }System.out.println(q.poll());
            }else System.out.println(num.element()+" is NOT perfect.");
            q.clear();
            num.poll();
        }
    }
}
*/