package programmers_problem;
import java.util.Scanner;

public class code9 {

	public static void main(String[] args) {
//
//		ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
//
//		��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
//		�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
//
//		���
//		�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
//
//		5
//		5 50 50 70 80 100    40.000%
//		7 100 95 90 80 70 60 50    57.143%
//		3 70 90 80 33.333%
//		3 70 90 81 66.667%
//		9 100 99 98 97 96 95 94 93 91  55.556%
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int [] ar;
		for(int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int count = 0;
			ar = new int [n];
			for(int j = 0; j < n; j++) {
				ar[j] = sc.nextInt();
			}
			for(int j =0; j < n; j++) {
				if(average(n,ar) < ar[j]) {
					count++;
				}
			}
			System.out.println(String.format("%.3f",(double)count/(double)n*100) + "%");
		}
		
	}
	static double average(int n,int [] ar) {
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += (double)ar[i];
		}
		return sum / (double)n;
	}
}
