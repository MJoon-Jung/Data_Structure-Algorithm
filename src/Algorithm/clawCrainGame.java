package Algorithm;

import java.util.Arrays;

public class clawCrainGame {
	static int answer = 0;
	static int [] value;
	static int val_idx = 0;
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
		
//		int [][] r = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//		int [] a = {1,5,3,5,1,2,1,4};
		int [][] r = {{0, 0, 1, 0, 0},{0, 0, 1, 0, 0},{0, 2, 1, 0, 0},{0, 2, 1, 0, 0},{0, 2, 1, 0, 0}};
		int [] a = {1, 2, 3, 3, 2, 3, 1};
		System.out.println(Solution(r,a));
	}
	static int Solution(int [][] r,int [] a) {
		int [][] ar = new int [r.length][r[0].length];
		int [] count  = new int [ar.length];
		value = new int [a.length];	
		for(int i = 0; i < r.length; i++) {
			for(int j = 0; j < r[0].length; j++) {
				ar[i][j] = r[j][i];
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			Solution2(a[i],ar,count);
		}
		int [] val = Arrays.copyOf(value, val_idx);
		bomb(val);
		return answer;
	}
	static int [] bomb(int [] val) {
		int idx = 0;
		int index = 0;
		int [] ar = new int [val.length];
		while(idx < val.length-1) {
			if(val[idx] != val[idx+1]) {
				if(val[idx] != 0) {					
					ar[index] = val[idx];
					idx++;
					index++;
				}
				else {
					idx++;
				}
			}
			else {
				if(val[idx] != 0) {					
					answer += 2;
					idx += 2;
				}
				else {
					idx += 2;
				}
			}
		}
		if(!isprime(ar,index)) {
			return bomb(ar);
		}
		else {
			return ar;
		}
	}
	static boolean isprime(int [] ar,int index) {
		for(int i = 0; i < index; i++) {
			if(ar[i] == ar[i+1]) {
				return false;
			}
		}
		return true;
	}
	static void Solution2(int k,int [][] ar,int [] count) {
		if(count[k-1] == ar.length) {
			count[k-1] = ar.length-1;
		}
		if(count[k-1] == ar.length-1) {
			if(ar[k-1][count[k-1]] != 0) {
				value[val_idx++] = ar[k-1][count[k-1]];
			}
		}
		else {
			if(ar[k-1][count[k-1]] != 0) {
				value[val_idx++] = ar[k-1][count[k-1]++];
			}
			else {
				count[k-1]++;
				Solution2(k,ar,count);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
