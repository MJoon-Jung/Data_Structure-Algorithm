package data_practice;


public class tsk {

	public static void main(String[] args) {
//		���� �ٸ� ����� ������ ���� a1, a2,��, an�� �ִ�. 
//		� ���� �ڽŰ� ������ �� �� (��, �ٷ� ���� ���� �ٷ� ������ ��)���� ���� ��
//		�� ���� local mimimum�̶�� �θ���. �� a1�� ��쿡�� a2���� ������, an�� ��쿡�� an-1
//		���� ������ local mimimum�̴�. � �������� local minimum�� �ִ� 1���� �� �� ������ �������ϴ١����
//		�θ���� ����. �Է����� �ϳ��� ������ �־��� �� ���� ���̰� �� ������ �κ� ������ ã�Ƽ� ����ϴ� ���α׷�
//		�� �ۼ��϶�. ���� ��� �Է� ������ 1, 3, 7, 6, 12, 11, 9, 0, -1, 2, -3, 5 ��� ���� �� ������ �κ� ����
//		�� 12, 11, 9, 0, -1, 2�̴�. �Է� ������ ���� n�� ���� �־����� �̾ n���� ������ �־�����.

		int [] ar = {1,3,7,6,12,11,9,0,-1,2,-3,5};
		int len = 0;
		int localMin = 0;
		int lenElement = 0;
		int start =0;
		int end = 0;
		for(int i = 0; i < ar.length-1; i++) {
			int j = i+1;
			for(; j < ar.length; j++) {
				localMin = getLocalmin(i,j,ar);
				if(localMin==1) {
					if(lenElement < j-i+1) {
						start = i;
						end = j;
						lenElement = j-i+1;
					}
				}
			}
			
		}
		for(int i = start; i <= end; i++) {
			System.out.println(ar[i]);
		}
		
		
	}
	public static int getLocalmin(int start,int end, int [] ar) {
		int cmt = 0;
		if(ar[start] < ar[start+1])
			cmt++;
		for(int i = start+1; i < end; i++) {
			if(ar[i] < ar[i-1] && ar[i] < ar[i+1])
				cmt++;
		}
		if(ar[end] < ar[end-1])
			cmt++;
		return cmt;
	}
}
