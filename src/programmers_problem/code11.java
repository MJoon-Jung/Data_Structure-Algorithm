package programmers_problem;
import java.util.Arrays;
import java.util.Scanner;

public class code11 {

	public static void main(String[] args) {
//����
//ī���뿡�� ���� �α� �ִ� ���� ������ ��Ģ�� ����� ����. ī���� ���� 21�� ���� �ʴ� �ѵ� ������, ī���� ���� 
//�ִ��� ũ�� ����� �����̴�. ������ ī���븶�� �پ��� ������ �ִ�.
//
//�ѱ� �ְ��� ���� ��� �������� ���ο� ���� ��Ģ�� ����� ���, â���̿� �����Ϸ��� �Ѵ�.
//
//������ ������ ���迡�� �� ī�忡�� ���� ������ ���� �ִ�. �� ����, ������ N���� ī�带 ��� ���ڰ� ���̵��� 
//�ٴڿ� ���´�. �׷� �Ŀ� ������ ���� M�� ũ�� ��ģ��.
//
//���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�. ���� ���� �����̱� ������, 
//�÷��̾ �� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.
//
//N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.
//
//ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ´�.
//
//���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.
//
//���
//ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.
//5 21
//5 6 7 8 9
//���� ��� 1 
//21
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		int [] ar = new int [N];
//		for(int i = 0; i < N; i++) {
//			ar[i] = sc.nextInt();
//		}
		int N = 5;
		int M = 21;
		int [] ar = {5,6,7,8,9};
		System.out.println(card(ar));
		
		
	}
	static int search(int M,int [] ar) {
		int min = 99999999;
		for(int i = 0; i <ar.length; i++) {
			int sum = 0;
			if(M - ar[i] < 0)
				continue;
			if(min > M-sum) {
				min = sum;
			}
		}
		return min;
	}
	static int [] card(int [] ar) {
		int [] arr = new int [ar.length-2];
		for(int i = 0; i < ar.length; i++) {
			int sum = 0;
			for(int j = i+1; j <= i+2; j++) {
				sum += ar[j];
			}
		}
		return arr; 
	}

}
