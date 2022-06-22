package section04_02;

import java.util.Scanner;

public class quiz06_p161 {
	public static void main(String[] args)throws Exception {
		boolean run = true;
		int balance = 0;
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔고 입력 : ");
		num3 = sc.nextInt();
		
		
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택 : ");
			
			balance = sc.nextInt();
			switch(balance) {
			
			case 1:
				System.out.print("예금할 금액을 입력 : ");
				num1 = sc.nextInt();
				System.out.println(num1 + " 원 예금");
				num3 += num1;
				break;
			case 2:
				System.out.print("출금할 금액을 입력 : ");
				num2 = sc.nextInt();
				System.out.println(num2 + " 원 출금");
				num3 -= num2;
				break;
			case 3:
				System.out.println("잔고 확인");
				System.out.println(num3 + " 원 잔고");
				break;
			case 4:
				System.out.println("종료");
				run = false;//while문을 종료시키는문
				break;
			default:
				break;
			}
		}

	}

}
