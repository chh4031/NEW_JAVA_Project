package section02_03;

import java.util.Scanner; //scanner가 java.util에 있다고 알림.

public class exam09_p96 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);//시스템 입력 장치로 부터 읽은 scanner 생성 코드
		String ipd;
		
		while(true) {
			ipd = sc.nextLine();//enter 키가 입력 전까지 대기상태
			System.out.println("data : \""+ ipd + "\".");
			if(ipd.equals("q")) {
				break;
			}
		}
		
	}
}
