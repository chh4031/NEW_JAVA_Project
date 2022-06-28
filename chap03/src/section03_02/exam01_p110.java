package section03_02;

public class exam01_p110 {
	public static void main(String[] args) {
		int x = -100;
		int re1 = +x;
		int re2 = -x;
		
		System.out.println(re1);
		System.out.println(re2);
		
		byte b = 100;
		byte re3 = (byte)-b; //연산은 int형으로 하므로 byte형에서 연산은 불가
		int re4 = -b;
		System.out.println(re4);
		System.out.println(re3);
	}

}
//부호 연산의 결과는 int
