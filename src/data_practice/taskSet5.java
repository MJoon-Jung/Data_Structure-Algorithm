package data_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class taskSet5 {
	static String [] words = new String [10000];
	static int count = 0;
	static int n = 0;
	public static void main(String[] args) {
//		�Է����� �ϳ��� �ؽ�Ʈ ������ �д´� (sample.txt).
//		�ؽ�Ʈ ���Ͽ� �����ϴ� ��� �ܾ���� ����� �����, �� �ܾ �ؽ�Ʈ ���Ͽ�
//		�����ϴ� Ƚ���� ����. ��, �ܾ� ������ 100,000�� ���϶�� �����Ѵ�.
//		����ڰ� ��û�ϸ� �ܾ� ����� �ϳ��� ���Ϸ� �����Ѵ�.
//		����ڰ� �ܾ �˻��ϸ� �� �ܾ �ؽ�Ʈ ���Ͽ� �� �� �����ϴ��� ����Ѵ�.
//		$ read sample.txt  �ؽ�Ʈ ���� sample.txt�� �а� �ε����� �����.
//		$ find heaven // heaven�̶�� �ܾ ��� �������� ����Ѵ�.
//		The word ��heaven�� appears 13 times.
//		$ saveas index.txt  �ε����� index.txt��� ���Ϸ� �����Ѵ�.
//		$ find java
//		The word ��java�� does not appear.
//		$ exit
		
		try {
			Scanner inFile = new Scanner(new File("sample.txt"));
			while(inFile.hasNext()) {
				words[n] = inFile.next();
				n++;
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
