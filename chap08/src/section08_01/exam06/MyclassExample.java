package section08_01.exam06;

public class MyclassExample {
	public static void main(String[] args) {
		System.out.println("1 _____________________________________");
		
		Myclass m1 = new Myclass();//Myclass�� �⺻ ������ �̿�
		m1.rc.turnOn();
		m1.rc.setVolume(3);
		
		System.out.println("2 _____________________________________");
		
		Myclass m2 = new Myclass(new Audio());//Myclass�� �ι�° ������ ���
		
		System.out.println("3 _____________________________________");
		
		Myclass m3 = new Myclass();
		m3.methodA();
		
		System.out.println("4 _____________________________________");
		
		Myclass m4 = new Myclass();
		m4.methodB(new Televison()); 
	}

}
