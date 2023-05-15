package Design_sing04;

public class EspressoMachine {
	public static EspressoMachine EM;
	private EspressoMachine() {
		System.out.println("���������� �ӽ� ����");
	}
	private String[] vanillaLatte = {"����������", "����", "�ٴҶ�÷�"};
	private String[] americano = {"����������", "��"};
	private String[] stimmilk = {"����", "�÷�"};
	private String condiments = "";
	public static EspressoMachine getInMachine() {
		if(EM == null) {
			EM = new EspressoMachine();
		}
		return EM;
	}
	public void Brew(String Name, String Beverage) {
		System.out.println(Name + "���� " + Beverage + "�� �����ϴ�.");
		Blend(Beverage);
		System.out.println(Name + "���� " + Beverage + "�� �ϼ��Ǿ����ϴ�. (÷���� : "+condiments+")");
		condiments = "";
	}
	public void Blend(String Beverage) {
		if(Beverage.equals("�ٴҶ��")) {
			for(int i = 0; i < 3; i++) {
				System.out.println(vanillaLatte[i]+ "�� �߰�." );
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				condiments = new StringBuffer(condiments).append(vanillaLatte[i]).append(",").toString();
			}
		}
		else if (Beverage.equals("�Ƹ޸�ī��")) {
			for(int i = 0; i < 2; i++) {
				System.out.println(americano[i]+"�� �߰�");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				condiments = new StringBuffer(condiments).append(americano[i]).append(",").toString();
			}
		}
		else if (Beverage.equals("������ũ")) {
			for(int i = 0; i < 2; i++) {
				System.out.println(stimmilk[i]+"�� �߰�");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				condiments = new StringBuffer(condiments).append(stimmilk[i]).append(",").toString();
			}
		}
	}
}
