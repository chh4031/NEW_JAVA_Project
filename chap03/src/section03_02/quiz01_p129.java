package section03_02;

import java.util.Scanner;

public class quiz01_p129 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		double num1;
		double num2;
		
		num1 = Double.parseDouble(sc.nextLine());//문자형 변수 변환 안에도 들어갈 수 있다.
		num2 = Double.parseDouble(sc.nextLine());
		
		if( num2 != 0) {
			System.out.println("결과값 : "+ (num1 / num2));
		}
		else {
			System.out.println("결과값 무한대");
		}
		sc.close();//블록 구문 안에서의 닫기 (close())
	}
}
