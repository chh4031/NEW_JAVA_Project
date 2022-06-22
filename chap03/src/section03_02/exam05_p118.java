package section03_02;

public class exam05_p118 {
	public static void main(String[] args) {
		String str1 = "JDK" + 3.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";//숫자가 먼저 연산됨.
		System.out.println(str3);
		System.out.println(str4);
	}

}
