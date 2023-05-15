package Design_sing03;

public class User extends Thread{
	public EspressoMachine EM = new EspressoMachine();
	public String Name;
	public String Beverage;
	public User(String Name, String Beverage) {
		this.Name = Name;
		this.Beverage = Beverage;
	}
	public void run() {
		EM.Brew(Name, Beverage);
	}
}
