package programmers_problem;

public class code1 {

	public static void main(String[] args) {
//		
//		���� ����
//		���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, 
//		Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//
//		���� ����
//		���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
//		ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
		System.out.println(solution2("try hello worldsadf sdfs asdfas dafsfs"));

	}
	 public static String solution(String s) {
	        String [] ar = s.split(" ");
	        int count = 1;
	        for(int i = 0; i < ar.length; i++) {
	        	String temp = "";
		        char temp2;
	        	for(int j = 0; j < ar[i].length(); j++) {
	        		if(count % 2 == 1) {
	        			temp2= Character.toUpperCase(ar[i].charAt(j));
	        			temp += temp2;
	        			count++;
	        		}
	        		else {
	        			temp += ar[i].charAt(j);
	        			count++;
	        		}
	        	}
	        	ar[i] = temp;
	        	count++;
	        }
	        String answer ="";
	        for(int i = 0; i < ar.length-1; i++) {
	        	answer += ar[i];
	        	answer += " ";
	        }
	        answer += ar[ar.length-1];
	        return answer;
	        
	    }
	 public static String solution2(String s) {
		 String [] ar = s.split("");
		 int count = 1;
		 String answer = "";
		 for(int i = 0; i < ar.length; i++) {
			 if(!ar[i].equals(" ")) {
				 if(count % 2 == 1) {
					 answer += ar[i].toUpperCase();
					 count++;
				 }
				 else {
					 answer += ar[i];
					 count++;
				 }	 
			 }
			 else {
				 count = 1;
				 answer += " ";
			 }
		 }
		 return answer;
	 }
}
