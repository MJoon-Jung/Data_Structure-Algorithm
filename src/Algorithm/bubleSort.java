package Algorithm;

import java.util.Scanner;

public class bubleSort {

	public static void main(String[] args) {
//		N���� ���� �̷���� ���� A[1], A[2], ��, A[N]�� �ִ�. �� ������ ���ؼ� ���� ��Ʈ�� ������ ��, 
//		Swap�� �� �� �� �߻��ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

//		���� ��Ʈ�� ���� ������ �ִ� �� ���� �ٲ㰡�� �����ϴ� ����̴�. ���� ��� ������ 3 2 1 �̾��ٰ� ����. 
//		�� ��쿡�� ������ �ִ� 3, 2�� �ٲ��� �ϹǷ� 2 3 1 �� �ȴ�. �������δ� 3, 1�� �ٲ��� �ϹǷ� 2 1 3 �� �ȴ�. 
//		�������� 2, 1�� �ٲ��� �ϹǷ� 1 2 3 �� �ȴ�. �׷��� �� �̻� �ٲ�� �� ��찡 �����Ƿ� ������ �Ϸ�ȴ�.
//		�Է�
//		ù° �ٿ� N(1��N��500,000)�� �־�����. ���� �ٿ��� N���� ������ A[1], A[2], ��, A[N]�� �־�����. 
//		������ A[i]�� 0��|A[i]|��1,000,000,000�� ������ ����ִ�.
//
//		���
//		ù° �ٿ� Swap Ƚ���� ����Ѵ�
//
//		���� �Է� 1 
//		3
//		3 2 1
//		���� ��� 1 
//		3
        Scanner sc = new Scanner(System.in);

		
		int [] A = {-2,3,2,-1,5,1};
		System.out.println(solution(A));
		
	}
	static int solution(int [] A) {
		int answer = 0;
		
		for(int i = 0; i < A.length - 1; i++) {
			int j = i+1;
			while(j < A.length) {
				if(A[i] > A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
					answer++;
				}
				j++;
			}
		}
		
		return answer;
	}

}
