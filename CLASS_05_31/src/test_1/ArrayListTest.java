package test_1;

import java.util.ArrayList;//java.util��Ű������ ArrayList Ŭ������ �ҷ���(API�ҷ�����)

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();// ���ڿ� ������ ���� ��ü ���� <String>�� String Ÿ���� �����ϰڴ�.
		
		names.add("KIM");//�ε��� 0
		names.add("Lee");//�ε��� 1
		names.add("Park");//�ε��� 2
		names.add("Choi");//�ε��� 3
		// add�� �迭�߰� 0������ ������ ����.
		
		names.set(0, "Han");
		//�ε��� 0�� ���� Han���� �ٲٴ°�.
		String removed = names.remove(1);
		//�ε��� 1�� ���� �� ���󰡰�, ���� ���� ���ڸ��� ä���. 
		//���� removed��� ���ο� ������ ���� �� ������ �־�����?
		
		for(int i = 0; i< names.size(); i++) {
			System.out.printf("%s ", names.get(i));
		}
		System.out.println(removed);
		/*size�� �迭�� ������
		 * get�� �ش� �ε����� ���� ��������.
		 * gkwk
		 * ���ڿ����� �ݺ����� ����Ǹ� �迭�� ���ɼ��� �ִ�.
		 */
	}

}
//���� ���� ���� �ϰڴ�. ������ ����.
