package section06_02;

public class exam02_p228 {
	public static void main(String[] args) {
		exam02_01_p228 typeField = new exam02_01_p228();
		
		//필드의 기본값 알아보기
		
		System.out.println("바이트 타입 필드값 : " + typeField.byteField);
		System.out.println("쇼트 타입 필드값 : " + typeField.shortField);
		System.out.println("인트 타입 필드값 : " + typeField.intField);
		System.out.println("롱 타입 필드값 : " + typeField.longField);
		System.out.println("불리언 타입 필드값 : " + typeField.booleanField);
		System.out.println("채얼 타입 필드값 : " + typeField.charField);
		System.out.println("플루트 타입 필드값 : " + typeField.floatField);
		System.out.println("더블 타입 필드값 : " + typeField.doubleField);
		System.out.println("배열(참조) 타입 필드값 : " + typeField.arrField);
		System.out.println("문자(참조) 타입 필드값 : " + typeField.StringField);
		
	}

}
