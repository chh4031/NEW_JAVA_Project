package Design_sing08;

public class EspressoMachine {
	public volatile static EspressoMachine EM;
	private EspressoMachine() {
		System.out.println("에스프레소 머신 생성");
	}
	private String[] vanillaLatte = {"에스프레소", "우유", "바닐라시럽"};
	private String[] americano = {"에스프레소", "물"};
	private String[] stimmilk = {"우유", "시럽"};
	private String condiments = "";
	public static EspressoMachine getInMachine() {
		if(EM == null) {
			synchronized (EspressoMachine.class) {
				if(EM == null) {
					EM = new EspressoMachine();
				}
			}
		}
		return EM;
	}
	public void Brew(String Name, String Beverage) {
		System.out.println(Name + "님이 " + Beverage + "를 내립니다.");
		Blend(Beverage);
		System.out.println(Name + "님의 " + Beverage + "가 완성되었습니다. (첨가물 : "+condiments+")");
		condiments = "";
	}
	public synchronized void Blend(String Beverage) {
		if(Beverage.equals("바닐라라떼")) {
			for(int i = 0; i < 3; i++) {
				System.out.println(vanillaLatte[i]+ "를 추가." );
				condiments = new StringBuffer(condiments).append(vanillaLatte[i]).append(",").toString();
			}
		}
		else if (Beverage.equals("아메리카노")) {
			for(int i = 0; i < 2; i++) {
				System.out.println(americano[i]+"를 추가");
				condiments = new StringBuffer(condiments).append(americano[i]).append(",").toString();
			}
		}
		else if (Beverage.equals("스팀밀크")) {
			for(int i = 0; i < 2; i++) {
				System.out.println(stimmilk[i]+"를 추가");
				condiments = new StringBuffer(condiments).append(stimmilk[i]).append(",").toString();
			}
		}
	}
}
