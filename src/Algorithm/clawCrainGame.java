package Algorithm;

public class clawCrainGame {

	public static void main(String[] args) {
//		[���ѻ���]
//				board �迭�� 2���� �迭�� ũ��� 5 x 5 �̻� 30 x 30 �����Դϴ�.
//				board�� �� ĭ���� 0 �̻� 100 ������ ������ ����ֽ��ϴ�.
//				0�� �� ĭ�� ��Ÿ���ϴ�.
//				1 ~ 100�� �� ���ڴ� ���� �ٸ� ������ ����� �ǹ��ϸ� ���� ���ڴ� ���� ����� ������ ��Ÿ���ϴ�.
//				moves �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
//				moves �迭 �� ���ҵ��� ���� 1 �̻��̸� board �迭�� ���� ũ�� ������ �ڿ����Դϴ�.
//		board	moves	result
//		[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]	4
		
		int [][] r = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] a = {1,5,3,5,1,2,1,4};
		
		System.out.println(Solution(r,a));
	}
	static int Solution(int [][] r,int [] a) {
		int answer = 0;
		int [][] ar = new int [r.length][r[0].length];
		int [] count  = new int [ar.length];
		int [] val = new int [a.length];
		for(int i = 0; i < r.length; i++) {
			for(int j = 0; j < r[0].length; j++) {
				ar[i][j] = r[j][i];
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			val[i] =Solution2(a[i],ar,count);
		}
		answer = bomb(val);
		
		return answer;
	}
	static int bomb(int [] val) {
		int count = 0;
		int idx = 0;
		while(true) {
			if(val[idx] == val[idx+1]) {
				
			}
		}
		
		
		return count;
	}
	static int Solution2(int k,int [][] ar,int [] count) {
		if(count[k-1] == ar.length) {
			count[k-1] = ar.length;
		}
		return ar[k-1][count[k-1]++];			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
