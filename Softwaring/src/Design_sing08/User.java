package Design_sing08;

public class User{
	public String Name;
	public String Beverage;
	public User(String Name, String Beverage) {
		this.Name = Name;
		this.Beverage = Beverage;
	}
	public void make() {
		EspressoMachine EM = EspressoMachine.getInMachine();
		EM.Brew(Name, Beverage);
	}
}
