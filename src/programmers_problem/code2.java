package programmers_problem;
import java.util.ArrayList;
import java.util.Arrays;

public class code2 {

	public static void main(String[] args) {
//		������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
//
//		�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
//		�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//		���ѻ���
//		������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
//		completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
//		�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//		������ �߿��� ���������� ���� �� �ֽ��ϴ�.
//		����� ��
//		participant	completion	return
//		[leo, kiki, eden]	[eden, kiki]	leo
//		[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
//		[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
		String [] participant = {"leo", "kiki", "eden"};
		String [] completion = {"eden", "kiki"};
		System.out.println(solution(participant,completion));
		
	}
	public static String solution(String[] participant, String[] completion) {
		String answer ="";
		String temp = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i =0; i < completion.length; i++) {
			if(participant[i] != completion[i]) {
				answer = participant[i];
			}
			else {
				answer = participant[participant.length-1];
			}
		}
		return answer;
	}
	public static String solution3(String[] participant, String[] completion) {
		String answer="";
		String temp = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0;
		while(i < completion.length) {
			if(!participant[i].equals(completion[i])) {
				temp = participant[i];
				break;
			}
			else {
				i++;
			}
		}
		if(!temp.equals("")) {
			answer = temp;
		}
		else {
			answer = participant[participant.length-1];
		}
		
		return answer;
	}
	public static String solution2(String[] participant, String[] completion) {
//        ArrayList<String> arrayList = new ArrayList<>();
//		for(String temp : participant) {
//			arrayList.add(temp);
//		}
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(participant));
		int count = 0;
		for(int i = 0; i < completion.length; i++) {
			arrayList.remove(completion[i]);
		}
		String answer="";
		answer = arrayList.get(0);
		return answer;
    }
//	public static String solution(String [] ar, String arr []) {
//		ArrayList<String> numbers = new ArrayList<>();
//		for(int i = 0; i < ar.length; i++) {
//			numbers.add(ar[i]);
//		}
//		int count = 0;
//		for(int i = 0; i < numbers.size(); i++) {
//			numbers.remove(arr[count]);
//			count++;
//		}
//		String answer="";
//		answer = numbers.get(0);
//		return answer;
//	}

}
