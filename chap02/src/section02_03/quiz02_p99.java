package section02_03;

import java.util.Scanner;//패키지 임포트

public class quiz02_p99 {
		public static void main(String[] args) throws Exception{//문자열 스레드 생략가능
			//정확한 결과값, 예외처리 try except 같은 역할
			Scanner scanner = new Scanner(System.in);//스캐너 객체 생성
			String str1 = scanner.nextLine();//스캐너 지정
			
			String str2 = scanner.nextLine();
			
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int re = num1 + num2;
			System.out.println(re);
			
			scanner.close();
		}
}
/* nextLine()으로 바로 안받고, nextInt()로 받으면 더 쉽다.
 * parseInt()를 이용한 숫자형 변환 부분이 존재하지 않아도 가능
 * 코드를 줄일 수 있음
 * 
 * int num1 = scanner.nextInt();
 * int num2 = scanner.nextInt();
 * 
 * 처음부터 int형으로 받아서 스캐너 지정
 * 
 * Scanner(System.in)으로 열리면
 * scanner.close()를 이용해서 스캐너를 닫아 주어야 함.
 * 
 * scanner is never closed라는 경고 문구가 나올시
 */ 
