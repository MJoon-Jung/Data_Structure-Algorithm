package Algorithm;

public class programmer2016_2 {

	public static void main(String[] args) {
//		���� ����
//		2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 
//				2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//				������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT
//
//		�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
//
//		���� ����
//		2016���� �����Դϴ�.
//		2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)

		int a = 5;
		int b = 24;
		System.out.println(Solution(a,b));
		

	}
	static String Solution(int a, int b) {
		String answer = "";
		int [] ar = {31,29,31,30,31,30,31,31,30,31,30};
		int days = 0;		
		for(int i = 0; i < a-1;  i++) {
			days += ar[i];
		}
		days += b;
		days--;
		answer = day(days);
		
		
		return answer;
	}
	static String day(int days) {
		String answer = "";
		switch(days%7) {
			case 0:{
				answer = "FRI";
				break;
			}
			case 1:{
				answer = "SAT";
				break;
			}
			case 2:{
				answer = "SUN";
				break;
			}
			case 3:{
				answer = "MON";
				break;
			}
			case 4:{
				answer = "TUE";
				break;
			}
			case 5:{
				answer = "WED";
				break;
			}
			case 6:{
				answer = "THU";
				break;
			}
		}
		return answer;
	}

}
