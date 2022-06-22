package chap05;

public class exam01_p173 {
	public static void main(String[] args) {
		String str1 = "일";
		String str2 = "일";
		
		if(str1 == str2) {
			System.out.println("str1와 str2의 참조가 같다");
		}
		else{
			System.out.println("str1와 str2의 참조가 다르다");
		}
		
		String str3 = new String("일");
		String str4 = new String("일");
		
		if(str3 == str4) {
			System.out.println("str3와 str4의 참조가 같다");
		}
		else {
			System.out.println("str3와 str4의 참조가 같다");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3와 str4의 내부 문자열이 같다");
		}
		
		if(str1 == str3) {
			System.out.println("str1와 str3의 참조가 같다");
		}
		else {
			System.out.println("str1와 str3의 참조가 다르다");
		}
	}
	
}
