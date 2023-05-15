package Design_sing05;

public class User extends Thread{
	public String Name;
	public String Beverage;
	public User(String Name, String Beverage) {
		this.Name = Name;
		this.Beverage = Beverage;
	}
	public void run() {
		EspressoMachine EM = EspressoMachine.getInMachine();
		EM.Brew(Name, Beverage);
	}
}
