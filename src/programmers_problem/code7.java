package programmers_problem;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class code7 {

	public static void main(String[] args) {
//		���� ó���ϴ� ���� ����п��� ����� �߿��� ���̴�. ����п��� N���� ���� ��ǥ�ϴ� �⺻ ��谪���� ������ ���� �͵��� �ִ�. ��, N�� Ȧ����� ��������
//		������ : N���� ������ ���� N���� ���� ��
//		�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
//		�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
//		���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
//		N���� ���� �־����� ��, �� ���� �⺻ ��谪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		�Է�
//		ù° �ٿ� ���� ���� N(1 �� N �� 500,000)�� �־�����. �� ���� N���� �ٿ��� �������� �־�����. �ԷµǴ� ������ ������ 4,000�� ���� �ʴ´�.
//		���
//		ù° �ٿ��� �������� ����Ѵ�. �Ҽ��� ���� ù° �ڸ����� �ݿø��� ���� ����Ѵ�.
//		��° �ٿ��� �߾Ӱ��� ����Ѵ�.
//		��° �ٿ��� �ֺ��� ����Ѵ�. ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵ�.
//		��° �ٿ��� ������ ����Ѵ�
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int n = sc.nextInt();
		int [] ar = {3,51,7,12,29,64,91};
		System.out.println(median(n,ar));
		

	}
	public static double Arithmetic_mean(int n, int [] ar) {
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += ar[i];
		}
		double r =  Math.round((sum/n * 1000.0)/1000.0);
		return r;
	}
	public static int median(int n, int [] ar) {
		ar = bubblesort(ar);
		int middle = ar[n/2];
		return middle;
	}
	public static int [] bubblesort(int [] ar) {
		for(int i = 0; i < ar.length-1; i++) {
			int temp;
			for(int j = ar.length-1; j > 0; j--) {
				if(ar[j-1] > ar[j]) {
					temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
			}
		}
		return ar;
	}
	public static void more(int [] ar) {
		ar = bubblesort(ar);
		int [] arr = new int [ar.length];
		for(int i = 0; i < ar.length; i++) {
			int idx = i+1;
			while(true) {
				if(ar[i] == ar[idx]) {
					arr[i]++;
					idx++;
				}
				else {
					break;
				}
			}
		}
}
	public static void maxArray(int [] ar) {
		int max = -99999999;
		int max2 = 0;
		for(int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
			
		}
	}
	public static int range(int [] ar) {
		ar = bubblesort(ar);
		return ar[ar.length-1]-ar[0];
	}
}
