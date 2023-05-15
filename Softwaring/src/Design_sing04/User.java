package Design_sing04;

public class User extends Thread{
	public EspressoMachine EM;
	public String Name;
	public String Beverage;
	public User(String Name, String Beverage) {
		this.Name = Name;
		this.Beverage = Beverage;
	}
	public void run() {
		EM = EspressoMachine.getInMachine();
		EM.Brew(Name, Beverage);
	}
}
