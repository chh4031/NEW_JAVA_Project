package section04_02;

public class exam08_p157 {
	public static void main(String[] args) {
		while(true) {
			int num = (int) (Math.random() * 6) + 1; // ((0.0(이상) ~ 1.0(미만)*6)+1 1~7
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("exit");
	}
}
