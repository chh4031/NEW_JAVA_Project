package section04_02;

public class quiz02_p161 {
	public static void main(String[] args) {
		int num1, num2;
		
		while(true) {
		
			num1 = (int) (Math.random()*6)+1;
			num2 = (int) (Math.random()*6)+1;
			
			if(num1 + num2 == 5) {
				System.out.println("���� ���� 5�� �½��ϴ�." + "(" + num1 + "," + num2 + ")");
				break;
			}
			else {
				System.out.println("���� ���� 5�� �ƴմϴ�." + "(" + num1 + "," + num2 + ")");
			}
		}
	}
}