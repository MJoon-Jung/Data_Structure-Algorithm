package Algorithm;

public class programmer2016 {

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
		String answer ="";
		int day_num = days(a,b);
		switch (day_num%7) {
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
	static int days(int a,int b) {
		int day = 0;
		switch (a) {
			case 2:{
				day += 31;
				break;
			}
			case 3:{
				day += 60;
				break;
			}
			case 4:{
				day += 91;
				break;
			}
			case 5:{
				day += 121;
				break;
			}
			case 6:{
				day += 152;
				break;
			}
			case 7:{
				day += 182;
				break;
			}
			case 8:{
				day += 213;
				break;
			}
			case 9:{
				day += 244;
				break;
			}
			case 10:{
				day += 274;
				break;
			}
			case 11:{
				day += 305;
				break;
			}
			case 12:{
				day += 335;
				break;
			}	
		}
		day += b;
		return day-1;
	}

}
