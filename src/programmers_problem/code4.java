package programmers_problem;

public class code4 {

	public static void main(String[] args) {
//		�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
//		�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�
//		0 0 1 1 1 2 3 4
		int ar [] = {39,40,41,42,43,44,82,83,84,85};
		int arr [] = new int [ar.length];
		for(int i = 0; i < ar.length; i++) {
			arr[i] = ar[i] % 42;
		}
		int br [] = sort(arr);
		int count = 0;
		for(int i = 0; i < br.length-1; i++) {
			if(br[i] == br[i+1])
				count++;
		}
		System.out.println(br.length - count);
	}
	public static int [] sort(int [] ar) {
		for(int i = 0; i < ar.length; i++) {
			int min = ar[i];
			int tmp = i;
			for(int j = i+1; j < ar.length; j++) {
				if(min > ar[j]) {
					min = ar[j];
					tmp = j;
				}
			}
			if(!(min == ar[i])) {
				int temp = ar[i];
				ar[i] = ar[tmp];
				ar[tmp] = temp;
			}
		}
		return ar;
	}

}
