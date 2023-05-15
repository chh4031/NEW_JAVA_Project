package Design_sing07;

public class EspressoMachine {
	public static EspressoMachine EM = new EspressoMachine();
	private EspressoMachine() {
		System.out.println("���������� �ӽ� ����");
	}
	public synchronized static EspressoMachine getInMachine() {
		return EM;
	}
	
	private String[] vanillaLatte = {"����������", "����", "�ٴҶ�÷�"};
	private String[] americano = {"����������", "��"};
	private String[] stimmilk = {"����", "�÷�"};
	private String condiments = "";
	
	public void Brew(String Name, String Beverage) {
		System.out.println(Name + "���� " + Beverage + "�� �����ϴ�.");
		Blend(Beverage);
		System.out.println(Name + "���� " + Beverage + "�� �ϼ��Ǿ����ϴ�. (÷���� : "+condiments+")");
		condiments = "";
	}
	public synchronized void Blend(String Beverage) {
		if(Beverage.equals("�ٴҶ��")) {
			for(int i = 0; i < 3; i++) {
				System.out.println(vanillaLatte[i]+ "�� �߰�." );
				condiments = new StringBuffer(condiments).append(vanillaLatte[i]).append(",").toString();
			}
		}
		else if (Beverage.equals("�Ƹ޸�ī��")) {
			for(int i = 0; i < 2; i++) {
				System.out.println(americano[i]+"�� �߰�");
				condiments = new StringBuffer(condiments).append(americano[i]).append(",").toString();
			}
		}
		else if (Beverage.equals("������ũ")) {
			for(int i = 0; i < 2; i++) {
				System.out.println(stimmilk[i]+"�� �߰�");
				condiments = new StringBuffer(condiments).append(stimmilk[i]).append(",").toString();
			}
		}
	}
}
