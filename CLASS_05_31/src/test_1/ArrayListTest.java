package test_1;

import java.util.ArrayList;//java.util패키지에서 ArrayList 클래스를 불러옴(API불러오기)

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();// 문자열 저장을 위한 객체 생성 <String>은 String 타입을 관리하겠다.
		
		names.add("KIM");//인덱스 0
		names.add("Lee");//인덱스 1
		names.add("Park");//인덱스 2
		names.add("Choi");//인덱스 3
		// add로 배열추가 0번부터 스택이 쌓임.
		
		names.set(0, "Han");
		//인덱스 0의 값을 Han으로 바꾸는것.
		String removed = names.remove(1);
		//인덱스 1의 값이 다 날라가고, 뒤의 값이 빈자리를 채운다. 
		//구지 removed라는 새로운 변수를 만들어서 쓸 이유가 있었을까?
		
		for(int i = 0; i< names.size(); i++) {
			System.out.printf("%s ", names.get(i));
		}
		System.out.println(removed);
		/*size는 배열의 사이즈
		 * get은 해당 인덱스의 값을 가져오다.
		 * gkwk
		 * 문자열에서 반복문이 시행되면 배열일 가능성이 있다.
		 */
	}

}
//시험 문제 출제 하겠다. 무조건 나옴.
