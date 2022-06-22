package section04_02;

public class exam10_p159 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {//홀수인 숫자는 다 건너뛰어버림
				continue;
			}
			System.out.println(i);
		}
	}
}
