package section07_02.exam03_p340;

public class Tire {
	//�ʵ�
	public int maxR; //�ִ� ȸ����(Ÿ�̾��� ����)
	public int countR; //���� ȸ����
	public String location; //Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxR) {
		this.location = location; //�ʵ��� location����
		this.maxR = maxR; //�ʵ��� maxR��
	}
	
	//�޼ҵ�
	public boolean roll() { //booleanŸ���� �޼ҵ�
		++countR;//Ÿ�̾��� ���� ȸ������ �߰���Ŵ
		if(countR < maxR) { //���� ȸ������ �ִ� ȸ�������� ���� �� ����
			System.out.println(location + "Tire ����" + (maxR - countR) + "ȸ");//���� ��ġ Tire ���� (�ִ� ȸ���� - ���� ȸ����) ȸ
			return true;
		}else {
			System.out.println("!!!" + location + "Tire ��ũ");//Ÿ�̾��� ���� ȸ������ �ִ� ȸ������ �Ѿ Ÿ�̾� ���� �ʰ��� Ÿ�̾ ��ũ�� ���� �κ�.
			return false;
		}
	}
}
