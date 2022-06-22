package section04_02;

public class exam09_p158 {
	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + " " + lower);
				if (lower == 'g') {
					break Outter;//라벨 Outter을 지정한 반복문을 종료시킴
				}
			}
		}
		System.out.println("exit");
	}
}
