package section04_02;

public class exam09_p158 {
	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + " " + lower);
				if (lower == 'g') {
					break Outter;//�� Outter�� ������ �ݺ����� �����Ŵ
				}
			}
		}
		System.out.println("exit");
	}
}
