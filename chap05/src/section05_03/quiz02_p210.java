package section05_03;

public class quiz02_p210 {
	public static void main(String[] args) {
		quiz01_p210 result = quiz01_p210.FAIL_PASSWARD;
		if(result == quiz01_p210.SUCESS) {
			System.out.println("�α��� �Ϸ�");
		}else if(result == quiz01_p210.FAIL_ID) {
			System.out.println("���̵� ����");
		}else if(result == quiz01_p210.FAIL_PASSWARD) {
			System.out.println("��й�ȣ ����");
		}else {
			System.out.println("�� ����");
		}
	}
}
