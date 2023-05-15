package Design_sing03;

public class EspressoMachine {
	public void Brew(String Name, String Beberageg) {
		try {
			System.out.println(Name + "님이 " + Beberageg + "를 내립니다.");
			Thread.sleep(100);
			System.out.println(Name + "님의 " + Beberageg + "가 완성되었습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
