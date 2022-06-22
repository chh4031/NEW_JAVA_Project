package section02_02;

public class exam01_p61_62 {
	public static void main(String[] args) {
		int v1 = 0b1011;
		int v2 = 0206;
		int v3 = 365;
		int v4 = 0xB3;
		// byte = 128; //byte 값 초과로 컴파일 에러
		long v5 = 100000000000000000L;
		
		System.out.println(v1); //2진수
		System.out.println(v2); //8진수
		System.out.println(v3); //10진수
		System.out.println(v4); //16진수
		System.out.println(v5); //L을 붙여 큰값 출력
		
	}
}
