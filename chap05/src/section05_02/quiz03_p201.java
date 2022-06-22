package section05_02;

import java.util.Scanner;

public class quiz03_p201 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료 6.초기화");
			System.out.println("---------------------------------------");
			System.out.print("선택 : ");
			
			int selectNo = sc.nextInt();
			//Integer.parseInt(sc.nextLine()); 이거쓰면 오류남;; if문으로 해야 안나나봄 switch에서는 이상하게 자꾸오류남.
			switch (selectNo) {
			
			case 1:
				if(scores != null) {
					System.out.println("이미 학생수를 입력하셨습니다.");
					break;
				}
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				System.out.println("학생수 : " + scores.length);
				break;
				
			case 2:
				if(scores == null) {
					System.out.println("학생수를 먼저 입력 하셔야 합니다");
					break;
				}
				for(int i=0;i<scores.length;i++) {
					System.out.print("점수입력 : scores[" + i + "] = ");
					scores[i] = sc.nextInt();
				}
				break;
				
			case 3:
				if(scores == null) {
					System.out.println("학생수를 먼저 입력 하셔야 합니다");
					break;
				}
				for(int i=0;i<scores.length;i++) {
					System.out.println("입력된 점수값  : scores[" + i + "] = " + scores[i]);
				}
				break;
				
			case 4:
				if(scores == null) {
					System.out.println("학생수를 먼저 입력 하셔야 합니다");
					break;
				}
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for(int i=0;i<scores.length;i++) {
					if(scores[i] <= max) {
						max = max;
					}
					else {
						max = scores[i];
					}
				}
				System.out.println("최대값 : " + max);
				
				for(int i=0;i<scores.length;i++) {
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("평균값 : " + avg);
				break;
				
			case 5:
				System.out.println("종료");
				run = false;
				break;
			
			case 6:
				scores = null;
				break;
				
			default:
				break;
				
			}
		}
	}
}
