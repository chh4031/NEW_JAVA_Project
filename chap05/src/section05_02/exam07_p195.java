package section05_02;

public class exam07_p195 {
	public static void main(String[] args) {
		String [] stry = new String[3];
		stry[0] = "java";
		stry[1] = "java";
		stry[2] = new String("java");
		
		System.out.println(stry[0] == stry[1]);// 참조타입 String는 같은 값을 참조한다.
		System.out.println(stry[0] == stry[2]);// 참조타입 String에서 new로 새로 생성한 값이므로 다른 객체를 참도한다. 그래서 false
		System.out.println(stry[0].equals(stry[1]));//문자열 즉 안에 있는 값은 같다
	}
}
