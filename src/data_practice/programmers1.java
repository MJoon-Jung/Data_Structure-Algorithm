package data_practice;

public class programmers1 {

	public static void main(String[] args) {
//		�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
//
//		���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
//
//		array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
//		1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
//		2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
//		�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��,
//		commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int [] answer = new int [commands.length];
		int i = 0;
		int j = 0;
		int k = 0;
		for(int x = 0; x < commands.length; x++){
            i = commands[x][0];
            j = commands[x][1];
            k = commands[x][2];
            answer[x] = renum(sort(i,j,array),k);
        }
		for(int z = 0; z < answer.length; z++) {
			System.out.println(answer[z]);
		}
    }
	static int [] sort (int i, int j, int [] array){
        int [] cr = new int [j-i+1];
		int n = 0;
        for(int x = i-1; x < j; x++) {
			int temp  = array[x];
			if(n==0) {
				cr[n] = temp;
				n++;
				continue;
			}
			int z = n;
			while(z > 0 && cr[z-1] > temp) {
				cr[z] = cr[z-1];
				z--;
			}
			cr[z] = temp;
			n++;
        }
        return cr;
    }
	static int renum(int [] cr,int k) {
        return cr[k-1];
    }
}

