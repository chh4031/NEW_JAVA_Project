package section08_01.exam05;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevison tv = new SmartTelevison();
		
		RemoteControl1 rc = tv;//�ٸ� ��Ű���� RemoteControl�� ���Ǽ� ������ �߻��ϴµ� ���� ��Ű�������� RemoteControl1�� �̸� �ٲ����.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOFF();
		
		Searchable sc = tv;
		sc.search("http");
	}
}
