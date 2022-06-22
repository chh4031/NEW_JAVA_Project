package section03_02;

public class exam08_p123 {
	public static void main(String[] args) {
	int charcode = 'A';
	
	if( (charcode >= 65) & (charcode <= 90) ) { //논리곱
		System.out.println("대문자");
	}
	if( (charcode >= 97) && (charcode <= 122) ) {
		System.out.println("소문자");
	}
	
	if( !(charcode < 48) && (charcode > 57 )) {
		System.out.println("0~9숫자");
	}
	
	int value = 6;
	if( (value % 2 == 0) | (value % 3 == 0)) { //논리합
		System.out.println("2또는 3 배수");
	}
	if( (value % 2 == 0) || (value % 3 == 0)) {
		System.out.println("2또는 3 배수");
	}
}
}
