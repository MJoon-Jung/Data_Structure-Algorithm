package programmers_problem;
import java.util.Arrays;

public class code14 {

	public static void main(String[] args) {
		
//		���� ����
//		�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. 
//		�̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� 
//		�Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.
//
//		1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
//		2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
//		3. �׷��� ������ J�� �μ��մϴ�.
//		���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� �߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.
//
//		���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. ���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.
//
//		���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� ���� �μ⸦ ��û�� ������ ���� ������� 
//		� ��ġ�� �ִ����� �˷��ִ� location�� �Ű������� �־��� ��, ���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� 
//		return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//		���ѻ���
//		���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
//		�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
//		location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ ������� ���� �տ� ������ 0, 
//		�� ��°�� ������ 1�� ǥ���մϴ�.
//		����� ��
//		priorities	location	return
//		[2, 1, 3, 2]	2	1
//		[1, 1, 9, 1, 1, 1]	0	5
//		����� �� ����
//		priorities	location	return
//				[2, 1, 3, 2]	2	1
//				[1, 1, 9, 1, 1, 1]	0	5
//				����� �� ����
//				���� #1
//
//				������ ���� ���� �����ϴ�.
//
//				���� #2
//
//				6���� ����(A, B, C, D, E, F)�� �μ� ����Ͽ� �ְ� �߿䵵�� 1 1 9 1 1 1 �̹Ƿ� C D E F A B ������ �μ��մϴ�.

		int [] priorities = {2,1,3,2};
		int [] priorities2 = {1,1,9,1,1,1};
		int [] priorities3 = {2,6,3,1,2,4,5,3,7,2,1,9,6,4,2,1};
//							 9 7 6 6 5 4 4 3 3 2 2 2 1 1
		int location3 = 7;
		int location = 2;
		int location2 = 0;
		System.out.println(solution(priorities3,location3));
	}
	 public static int solution(int[] priorities, int location) {
	        int answer = 0;
	        int printSize = priorities.length;
	        int[] arr = new int[printSize];
	        int size = 0;
	        while (size != printSize) {
	            for (int i = 0; i < printSize && size != printSize; i++) {
	                if (isMax(priorities, priorities[i])) {
	                    arr[i] = size + 1;
	                    priorities[i] = 0;
	                    size++;
	                }
	            }
	        }
	        return arr[location];
	    }

	    public static boolean isMax(int[] priorities, int now) {
	    	int max = priorities[now];
	    	for(int i = 0; i < priorities.length; i++) {
	    		if(max < priorities[i]) {
	    			return false;
	    		}
	    	}
	    	return true;
	    }

}
