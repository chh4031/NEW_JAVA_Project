package section02_03;

import java.util.Scanner; //scanner�� java.util�� �ִٰ� �˸�.

public class exam09_p96 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);//�ý��� �Է� ��ġ�� ���� ���� scanner ���� �ڵ�
		String ipd;
		
		while(true) {
			ipd = sc.nextLine();//enter Ű�� �Է� ������ ������
			System.out.println("data : \""+ ipd + "\".");
			if(ipd.equals("q")) {
				break;
			}
		}
		
	}
}
