/*import java.util.Scanner;

public class chp3Practice8 {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("������ �� �� �����ұ��? 100���� ���� ���� �Է��ϼ���. ");
	    int amount = scanner.nextInt();      // �迭�� ũ�Ⱑ �� ������ �Է¹���
	    
	    int[] array;
	    
	    if (amount > 100) {      // 100���� ū ���� �Է����� ���
	       System.out.println("100���� ���� ���� �Է��ϼ���.");
	    }
	    else {
	       array = new int[amount];      // �Է¹��� ����ŭ�� ũ�⸦ ���� �迭 ����
	       
	       for (int i = 0; i < array.length; i++) {
	    	  double value = Math.random();
	          int randInt = (int)(value * 100) + 1;      // 1���� 100���� ������ ������ ���� ����
	          
	          if (i == 0) {
	        	  array[0] = randInt;
	             System.out.print(array[0]+" ");
	          } else if (i > 0) {
	             for (int j = i-1; j >= 0; j--) {
	                if (randInt == array[i] ) {      // �迭 �ȿ� ���� ���� �ִ� ���
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
	       System.out.println(array[0]);      // �� �ε��� 0���� ���� 0�� ���ñ��Ф�
	    }

	    
	    
	    scanner.close();
	}
 }
*/