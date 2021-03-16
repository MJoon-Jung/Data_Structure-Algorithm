package data_practice;

import java.util.Scanner;

public class taskSet4 {
	public static void main(String[] args) {
//		���� �ٸ� ����� ������ ���� a1, a2,��, an�� �ִ�. 
//		� ���� �ڽŰ� ������ �� �� (��, �ٷ� ���� ���� �ٷ� ������ ��)���� ���� ��
//		�� ���� local mimimum�̶�� �θ���. �� a1�� ��쿡�� a2���� ������, an�� ��쿡�� an-1
//		���� ������ local mimimum�̴�. � �������� local minimum�� �ִ� 1���� �� �� ������ �������ϴ١����
//		�θ���� ����. �Է����� �ϳ��� ������ �־��� �� ���� ���̰� �� ������ �κ� ������ ã�Ƽ� ����ϴ� ���α׷�
//		�� �ۼ��϶�. ���� ��� �Է� ������ 1, 3, 7, 6, 12, 11, 9, 0, -1, 2, -3, 5 ��� ���� �� ������ �κ� ����
//		�� 12, 11, 9, 0, -1, 2�̴�. �Է� ������ ���� n�� ���� �־����� �̾ n���� ������ �־�����.

		int[] arr = {1, 3, 7, 6, 12, 11, 9, 0, -1, 2, -3, 5};
		
		int start = 0;
		int end = 0;
		int numElements = 0;
		/*
		 * local_minimum�� �ִ� 1�� j�� ���Ѵ�. 
		 * �� j�� ������ ��
		 * �� �κм����� ���Ҽ��� j-i+1
		 */
		for (int i = 0; i < arr.length-1; i++) {
			int j = i+1 ;
			int localMinimumCount = 0;
			for (; j < arr.length; j++) { 
				localMinimumCount = getLocalMinimumCount(arr, i, j);
//				System.out.println("localMininumCount:"+ localMinimumCount+ ", i:" + i + ", j:" + j );
				if (localMinimumCount == 1) {
					if (numElements < (j-i+1)) {
						start = i;
						end = j;
						numElements = j-i+1;
					}
				}
			}
		}
		for (int i = start; i <= end; i++)
			System.out.print(arr[i] + " ");
	}
	private static int getLocalMinimumCount(int[] arr, int start, int end) {
		int cnt = 0;
		if (arr[start] < arr[start+1]) cnt++;
		for (int i = start+1; i < end; i++) {
			if (arr[i] < arr[i-1] && arr[i] < arr[i+1]) 
				cnt++;
		}
		if (arr[end] < arr[end-1]) cnt++;
		return cnt;
	}
}