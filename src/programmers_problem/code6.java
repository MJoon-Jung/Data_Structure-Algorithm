package programmers_problem;
import java.util.ArrayList;

public class code6 {

	public static void main(String[] args) {
//		�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. 
//		�����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
//
//		1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//		2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//		3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//		1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� 
//		����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//		���� ����
//		������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
//		������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
//		���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.

		
		
	}
	public int[] solution(int[] answers) {
        int [] ar1 = {1,2,3,4,5};
        int [] ar2 = {2,1,2,3,2,4,2,5};
        int [] ar3 = {3,3,1,1,2,2,4,4,5,5};
        
        int one = student(ar1,answers);
        int two = student(ar2,answers);
        int three = student(ar3,answers);
        int max = Math.max(Math.max(one,two),three);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == one)list.add(1);
        if(max == two)list.add(2);
        if(max == three)list.add(3);
        int[] answer = new int [list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public int student(int [] ar,int [] answers){
        int num = ar.length;
        int idx = 0;
        int count = 0;
        int grade = 0;
        while(count < answers.length){
            if(ar[idx] == answers[count]){
                grade++;
            }
            count++;
            idx++;
            if(idx == num-1){
                idx = 0;
            }
        }
        return grade;
    }
}
