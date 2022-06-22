package section04_02;

public class exam03_p152 {
	public static void main(String[] args) {
		int sum = 0;

		int i = 0;//루프 카운터 변수, for 문 밖에서도 쓰기 위해 위에서 선언함. 아래쪽 출력문에서 사용됨을 알 수 있음.
		for (i = 1; i <= 100; ++i) {
			sum += i;
		}

		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}
}