package programmers_problem;
import java.util.ArrayList;
import java.util.Arrays;

public class code3 {

	public static void main(String[] args) {
//		���� �迭 numbers�� �־����ϴ�. numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ����
//		�迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
		int [] ar = {5,0,2,7};
		int [] br = plus(ar);
		int [] cr = sort(br);
		
		for(int i = 0; i < cr.length; i++) {
			System.out.println(cr[i]);
		}
	}
	public static int [] plus(int [] ar) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < ar.length-1; i++) {
			for(int j = i+1; j < ar.length; j++){
				if(!list.contains(ar[i] + ar[j]))
					list.add(ar[i] + ar[j]);
			}
		}
		Integer [] brr = list.toArray(new Integer[list.size()]);
		int[] arr = Arrays.stream(brr).mapToInt(Integer::intValue).toArray();
		return arr;
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
