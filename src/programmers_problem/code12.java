package programmers_problem;
import java.util.Arrays;

public class code12 {

	public static void main(String[] args) {

//		H-Index�� �������� ���꼺�� ������� ��Ÿ���� ��ǥ�Դϴ�. ��� �������� H-Index�� ��Ÿ���� ���� h�� ���Ϸ��� �մϴ�. 
//		��Ű���1�� ������, H-Index�� ������ ���� ���մϴ�.
//
//		� �����ڰ� ��ǥ�� �� n�� ��, h�� �̻� �ο�� ���� h�� �̻��̰� ������ ���� h�� ���� �ο�Ǿ��ٸ� 
//		h�� �ִ��� �� �������� H-Index�Դϴ�.
//
//		� �����ڰ� ��ǥ�� ���� �ο� Ƚ���� ���� �迭 citations�� �Ű������� �־��� ��, �� �������� H-Index��
//		return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//		���ѻ���
//		�����ڰ� ��ǥ�� ���� ���� 1�� �̻� 1,000�� �����Դϴ�.
//		���� �ο� Ƚ���� 0ȸ �̻� 10,000ȸ �����Դϴ�.
//		citations	return
//				[3, 0, 6, 1, 5]	3
//				����� �� ����
//				�� �����ڰ� ��ǥ�� ���� ���� 5���̰�, ���� 3���� ���� 3ȸ �̻� �ο�Ǿ����ϴ�.
//		�׸��� ������ 2���� ���� 3ȸ ���� �ο�Ǿ��� ������ �� �������� H-Index�� 3�Դϴ�.
		int [] citations = {3,0,6,1,5};
		int [] citations1 = {12,11,10,9,8,1};
		int [] citations2 = {6, 6, 6, 6, 6, 1};
		int [] citations3 = {4, 4, 4};
		int [] citations4 = {4, 4, 4, 5, 0, 1, 2, 3};
		int [] citations5 = {10, 11, 12, 13};
		int [] citations6 = {3, 0, 6, 1, 5};
		int [] citations7 = {0, 0, 1, 1};
		int [] citations8 = {0, 1};
		int [] citations9 = {10, 9, 4, 1, 1};
//		[12, 11, 10, 9, 8, 1] 5
//		[6, 6, 6, 6, 6, 1] 5
//		[4, 4, 4] 3 ���� citations3
//		[4, 4, 4, 5, 0, 1, 2, 3] 4
//		[10, 11, 12, 13] 4  ���� citations5
//		[3, 0, 6, 1, 5] 3
//		[0, 0, 1, 1] 1
//		[0, 1] 1
//		[10, 9, 4, 1, 1] 3
//		Arrays.sort(citations);
//		System.out.println(citations[5]);
		System.out.println(solution(citations3));
		
	}
	static int ar_min(int [] citations) {
        int min = citations[0];
        for(int i = 0; i < citations.length; i++) {
            if(min > citations[i]) {
                min = citations[i];             
            }
        }
        return min;
    }
    static int solution(int[] citations) {
	    int answer = -1;
	    int MIN = ar_min(citations);
	    int k = citations.length;
	    if(k == 1){
	        answer = citations[0];
	        return answer;
	    }
	    else if(MIN>= k){
	        return k;
	    }
	    else{
	        Arrays.sort(citations);
	        for(int i = k-1; i >= 0; i--) {
	            int count = 0;
	            for(int j = k-1; j >= 0; j--) {
	                if(i<=citations[j]) {
	                    count++;
	                    if(i <= count) {
	                        answer = i;
	                        break;
	                    }
	                }
	            }
	            if(answer != -1) {
	                break;
	            }   
	        }
	        return answer;
	    }
    }
}

