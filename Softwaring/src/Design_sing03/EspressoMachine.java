package Design_sing03;

public class EspressoMachine {
	public void Brew(String Name, String Beberageg) {
		try {
			System.out.println(Name + "���� " + Beberageg + "�� �����ϴ�.");
			Thread.sleep(100);
			System.out.println(Name + "���� " + Beberageg + "�� �ϼ��Ǿ����ϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
