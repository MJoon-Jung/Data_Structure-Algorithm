package programmers_problem;
public class code10 {

	public static void main(String[] args) {
//		�ڿ��� n�� �־����� ��, n�� ���� ū ���ڴ� ������ ���� ���� �մϴ�.
//
//		���� 1. n�� ���� ū ���ڴ� n���� ū �ڿ��� �Դϴ�.
//		���� 2. n�� ���� ū ���ڿ� n�� 2������ ��ȯ���� �� 1�� ������ �����ϴ�.
//		���� 3. n�� ���� ū ���ڴ� ���� 1, 2�� �����ϴ� �� �� ���� ���� �� �Դϴ�.
//		���� �� 78(1001110)�� ���� ū ���ڴ� 83(1010011)�Դϴ�.
//
//		�ڿ��� n�� �Ű������� �־��� ��, n�� ���� ū ���ڸ� return �ϴ� solution �Լ��� �ϼ����ּ���.
//
//		���� ����
//		n�� 1,000,000 ������ �ڿ��� �Դϴ�.
//		n	result
//		78	83
//		15	23
//		����� �� ����
//		����� ��#1
//		���� ���ÿ� �����ϴ�.
//		����� ��#2
//		15(1111)�� ���� ū ���ڴ� 23(10111)�Դϴ�.
		int n = 78;
		int count = binary(n);
		while(true) {
			n++;
			if(count == binary(n))
				break;
		}
		System.out.println(n);
		
	}
	static int binary(int k) {
		int count = 0;
		while(true) {
			if(k%2 == 1) {
				count++;
			}
			k = k / 2;
			if(k == 0) {
				count++;
				break;
			}
		}
		return count;
	}
}
















