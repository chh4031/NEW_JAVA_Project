package section07_02.exam03_p340;
//Tire Ŭ������ �θ�� ����Ѵ�.
public class KumhoTire extends Tire{
	//�ʵ�
	
	//������
	public KumhoTire(String location, int maxR) {
		super(location, maxR);
	}
	//�����ڴ� �θ� Ŭ�����κ��� ��ӹ��� ���� ����Ѵ�.
	
	//�޼ҵ�
	@Override
	public boolean roll() { //booleanŸ���� �޼ҵ�
		++countR;//Ÿ�̾��� ���� ȸ������ �߰���Ŵ
		if(countR < maxR) { //���� ȸ������ �ִ� ȸ�������� ���� �� ����
			System.out.println(location + "KumhoTire ����" + (maxR - countR) + "ȸ");//���� ��ġ Tire ���� (�ִ� ȸ���� - ���� ȸ����) ȸ
			return true;
		}else {
			System.out.println("!!!" + location + "Tire ��ũ");//Ÿ�̾��� ���� ȸ������ �ִ� ȸ������ �Ѿ Ÿ�̾� ���� �ʰ��� Ÿ�̾ ��ũ�� ���� �κ�.
			return false;
		}
	}
	//�������̵��� �� ������ 17��° �ٿ��� ���๮�� ������ �ʿ䰡 �ֱ� ������ �������̵����� �ڽ� Ŭ�������� ���� �������.
}
