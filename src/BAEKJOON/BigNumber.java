package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

//BAEKJOON Problem 17298
//����
//ũ�Ⱑ N�� ���� A = A1, A2, ..., AN�� �ִ�. ������ �� ���� Ai�� ���ؼ� ��ū�� NGE(i)�� ���Ϸ��� �Ѵ�. Ai�� ��ū���� �����ʿ� �����鼭 Ai���� ū �� �߿��� ���� ���ʿ� �ִ� ���� �ǹ��Ѵ�. �׷��� ���� ���� ��쿡 ��ū���� -1�̴�.
//
//���� ���, A = [3, 5, 2, 7]�� ��� NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1�̴�. A = [9, 5, 4, 8]�� ��쿡�� NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1�̴�.
//
//�Է�
//ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000,000)�� �־�����. ��°�� ���� A�� ���� A1, A2, ..., AN (1 �� Ai �� 1,000,000)�� �־�����.
//
//���
//�� N���� �� NGE(1), NGE(2), ..., NGE(N)�� �������� ������ ����Ѵ�.
//
//���� �Է� 1 
//4
//3 5 2 7
//���� ��� 1 
//5 7 7 -1
//���� �Է� 2 
//4
//9 5 4 8
//���� ��� 2 
//-1 8 8 -1

public class BigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer>stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int size = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String [] ar = str.split(" ");
		int arr [] = new int [size];
		
		stack.push(0);
		for(int i = 1; i < size; i++) {
			if(stack.empty()) {
				stack.push(i);
			}
			while(!stack.empty() && Integer.valueOf(ar[stack.peek()]) < Integer.valueOf(ar[i])) {
				arr[stack.peek()] = Integer.valueOf(ar[i]);
				stack.pop();
			}
			stack.push(i);
		}
		while(!stack.empty()) {
			arr[stack.peek()] = -1;
			stack.pop();
		}
		for(int i = 0; i < size; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
	}
}