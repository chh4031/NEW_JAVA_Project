package Design_sing02;

public class User{
	public EspressoMachine EM = new EspressoMachine();
	public String Name;
	public String Beverage;
	public User(String Name, String Beverage) {
		this.Name = Name;
		this.Beverage = Beverage;
	}
	public void make() {
		EM.Brew(Name, Beverage);
	}
}
