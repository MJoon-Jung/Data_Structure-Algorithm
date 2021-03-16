package programmers_problem;
import java.util.ArrayList;
import java.util.Arrays;

public class code2 {

	public static void main(String[] args) {
//		수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
//		완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//		제한사항
//		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//		completion의 길이는 participant의 길이보다 1 작습니다.
//		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//		참가자 중에는 동명이인이 있을 수 있습니다.
//		입출력 예
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
