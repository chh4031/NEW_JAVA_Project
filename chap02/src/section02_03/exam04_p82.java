package section02_03;

public class exam04_p82 {
	public static void main(String[] args) {
		//숫자 연산
		int v1 = 10 + 2 + 1;
		System.out.println(v1);
		
		//문자열 숫자 섞여서 연산인데 다 문자열취급됨. 단 ()안에는 숫자연산함.
		String s1 = "10" + 1 + 2;
		System.out.println(s1);
		String s2 = "10" + (1 + 2);
		System.out.println(s2);
		String s3 = 10 + "1" + 2;
		System.out.println(s3);
		String s4 = (10 + 1) + "2";
		System.out.println(s4);

	}
}
