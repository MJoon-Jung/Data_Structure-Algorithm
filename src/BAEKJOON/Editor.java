package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

//BAEKJOON 1406
public class Editor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<String>left = new Stack<>();
		Stack<String>right = new Stack<>();
		
		//���ڿ� �Է¹���
		String str = sc.next();
		
		//left stack�� str �� ���ھ� ä������
		for(int i = 0; i < str.length(); i++) {
			left.push(String.valueOf(str.charAt(i)));
		}
		
		//�ݺ�Ƚ��
		int cnt = sc.nextInt();
		
		//�ݺ�
		for(int i = 0; i < cnt; i++) {
			char mode = sc.next().charAt(0);
			switch (mode) {
				case 'L':{
					if(!left.empty()) {						
						right.push(left.pop());
					}
					break;
				}
				case 'D':{		
					if(!right.empty()) {						
						left.push(right.pop());
					}
					break;
				}
				case 'B':{		
					if(!left.empty()) {						
						left.pop();
					}
					break;
				}
				case 'P':{
					String p = sc.next();
					left.push(p);
					break;
				}
			}
		}
		
		//�ٽ� left stack�� right stack �� ��ģ��
		int z = left.size();
		for(int i = 0; i < z; i++) {
			right.push(left.pop());
		}
		int k = right.size();
		for(int i = 0; i < k; i++) {
			sb.append(right.pop());
		}
		System.out.println(sb);
	}
}
