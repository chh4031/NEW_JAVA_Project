package Design_sing01;

public class Singleton_main {
	public static void main(String[] args) {
		NonSingleton nonSingleton_01 = new NonSingleton();
		NonSingleton nonSingleton_02 = new NonSingleton();
		Singleton singleton_01 = Singleton.getInstance();
		Singleton singleton_02 = Singleton.getInstance();
		
	}
}
