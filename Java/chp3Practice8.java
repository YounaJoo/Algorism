/*import java.util.Scanner;

public class chp3Practice8 {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("정수를 몇 개 저장할까요? 100보다 작은 수로 입력하세요. ");
	    int amount = scanner.nextInt();      // 배열의 크기가 될 정수를 입력받음
	    
	    int[] array;
	    
	    if (amount > 100) {      // 100보다 큰 수를 입력했을 경우
	       System.out.println("100보다 작은 수를 입력하세요.");
	    }
	    else {
	       array = new int[amount];      // 입력받은 수만큼의 크기를 갖는 배열 생성
	       
	       for (int i = 0; i < array.length; i++) {
	    	  double value = Math.random();
	          int randInt = (int)(value * 100) + 1;      // 1에서 100까지 범위의 랜덤한 정수 생성
	          
	          if (i == 0) {
	        	  array[0] = randInt;
	             System.out.print(array[0]+" ");
	          } else if (i > 0) {
	             for (int j = i-1; j >= 0; j--) {
	                if (randInt == array[i] ) {      // 배열 안에 같은 수가 있는 경우
	                   i--;
	                } else {
	                   array[i] = randInt;
	                   System.out.print(array[i]+" ");
	                   break;
	                }
	             }
	          }
	          
	       }
	       System.out.println();
	       System.out.println(array[0]);      // 왜 인덱스 0에는 값이 0만 들어올까요ㅠㅠ
	    }

	    
	    
	    scanner.close();
	}
 }
*/