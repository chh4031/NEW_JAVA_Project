package Design_sing01;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("싱글톤 패턴을 사용하는 경우");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
