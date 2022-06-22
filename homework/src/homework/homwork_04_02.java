package homework;

public class homwork_04_02 {
	public static void main(String[] args) {//A = 65, Z = 90 65 ~ 90사이가 대문자
		int strnum = (int)(Math.random() * 26) + 65;// 26을 곱하고 65를 더해 65<=strnum<91 이라는 범위를 만들어줌.
		char strAZ = (char)strnum; //int형 타입을 char형으로 변환
		System.out.println("값: "+ strAZ);
		
		for(int i=1; i<=10; i++) { // 반복문으로 반복 10회를 통해 랜덤한 알파벳 값이 나오는지 확인하는 구문
			int strnum2 = (int)(Math.random() * 26) + 65;
			char strAZ2 = (char)strnum2;
			System.out.println("반복 " +i+ "번을 통해 얻은 값 " + strAZ2);
		}
		
	}
}


//20191598 조현호
//배운 for문을 활용해 랜덤값이 실제로 출력되는지를 확인하는 코드를 추가