package programmers_problem;
import java.util.Scanner;

public class code8 {

	public static void main(String[] args) {
//		�� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�. 
//		�� ������ �ݰ��� ū ������� �׿��ִ�. ���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡�� �� ��° ���� �ű�� �Ѵ�.
//
//		�� ���� �� ���� ���Ǹ��� �ٸ� ž���� �ű� �� �ִ�.
//		�׾� ���� ������ �׻� ���� ���� �Ʒ��� �ͺ��� �۾ƾ� �Ѵ�.
//		�� �۾��� �����ϴµ� �ʿ��� �̵� ������ ����ϴ� ���α׷��� �ۼ��϶�. ��, �̵� Ƚ���� �ּҰ� �Ǿ�� �Ѵ�.
//		Scanner sc =new Scanner(System.in);
//		int n = sc.nextInt();
//		int [][] top = new int [3][n];
//		
		hanoi(3,0,2,1);
		
	}
//	static void hanoi(int num, int from, int to, int other) {
//		if(num== 0)
//			return;
//		hanoi(num-1,from,other,to);
//		System.out.println((from+1)+"���� " + (to+1)+ "�� �̵�");
//		hanoi(num-1, to, other,from);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void hanoi(int n,int from,int to, int other) { //from ����� ��չ�ȣ / to ������ ��չ�ȣ / other ������ ��չ�ȣ
		if(n == 0) {
			return;
		}
		hanoi(n-1,from,other,to);
		System.out.println(from+1 +"������"+(to+1)+"������ �ű��");
		hanoi(n-1,other,to,from);
	}

}
