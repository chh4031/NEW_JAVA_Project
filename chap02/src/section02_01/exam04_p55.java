package section02_01;

public class exam04_p55 {
		public static void main(String[] args) {
			//int $#value = 1; 예약여 변수 사용 불가
			int v1 = 15;
			if(v1>10) {
				int v2;
				v2 = v1 -10;
			}
			//int v3 = v1 + v2 + 5; // v2라는 변수가 if블록 내에서 선언 되어서 컴파일 오류가 발생한다.(로컬변수)
		}

}
