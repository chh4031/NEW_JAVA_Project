package homework;

public class homwork_04_02 {
	public static void main(String[] args) {//A = 65, Z = 90 65 ~ 90���̰� �빮��
		int strnum = (int)(Math.random() * 26) + 65;// 26�� ���ϰ� 65�� ���� 65<=strnum<91 �̶�� ������ �������.
		char strAZ = (char)strnum; //int�� Ÿ���� char������ ��ȯ
		System.out.println("��: "+ strAZ);
		
		for(int i=1; i<=10; i++) { // �ݺ������� �ݺ� 10ȸ�� ���� ������ ���ĺ� ���� �������� Ȯ���ϴ� ����
			int strnum2 = (int)(Math.random() * 26) + 65;
			char strAZ2 = (char)strnum2;
			System.out.println("�ݺ� " +i+ "���� ���� ���� �� " + strAZ2);
		}
		
	}
}


//20191598 ����ȣ
//��� for���� Ȱ���� �������� ������ ��µǴ����� Ȯ���ϴ� �ڵ带 �߰�