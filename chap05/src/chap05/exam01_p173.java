package chap05;

public class exam01_p173 {
	public static void main(String[] args) {
		String str1 = "��";
		String str2 = "��";
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ������ ����");
		}
		else{
			System.out.println("str1�� str2�� ������ �ٸ���");
		}
		
		String str3 = new String("��");
		String str4 = new String("��");
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������ ����");
		}
		else {
			System.out.println("str3�� str4�� ������ ����");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3�� str4�� ���� ���ڿ��� ����");
		}
		
		if(str1 == str3) {
			System.out.println("str1�� str3�� ������ ����");
		}
		else {
			System.out.println("str1�� str3�� ������ �ٸ���");
		}
	}
	
}
