package data_practice;

import java.util.Scanner;

public class taskSet3 {

	public static void main(String[] args) {
//		�Է����� ������ ���� n�� �̾ n���� �������� �־�����. �� �� �������� Ȥ�� ������������ ���ĵǾ� �ִ�
//		���� �� ������ ã�Ƽ� �� ������ ���̸� ����ϴ� ���α׷��� �ۼ��϶�. ���� ��� n=13�̰� �Է� �������� 
//		2, 3, 15, 15, 13, 12, 11, 9, 0, -1, 2, -3, 5 ��� ����ģ ������ ���� �� �����̰� �� ���̴� 8�̴�.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar = new int [n];
		for(int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		reco(n,ar); 
		recp(n,ar);
		if(reco(n,ar) > recp(n,ar))
			System.out.println(reco(n,ar));
		else
			System.out.println(recp(n,ar));

	}
	public static int reco(int n, int [] ar) {
		int man = 1;
		for(int i =0; i < n-1; i++) {
			int length = 1;
			while(ar[i] >= ar[i+1]) {
				i++;
				length++;
				if(man < length)
					man = length;
				if(i == n-1)
					break;
			}
		}
		return man;
		
	}
	public static int recp(int n,int [] ar) {
		int man = 1;
		for(int i =n-1; i > 0; i--) {
			int length = 1;
			while(ar[i] >=ar[i-1]) {
				i--;
				length++;
				if(man < length)
					man = length;
				if(i == 0)
					break;
			}
		}
		return man;
	}

}
