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
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.���� 6.�ʱ�ȭ");
			System.out.println("---------------------------------------");
			System.out.print("���� : ");
			
			int selectNo = sc.nextInt();
			//Integer.parseInt(sc.nextLine()); �̰ž��� ������;; if������ �ؾ� �ȳ����� switch������ �̻��ϰ� �ڲٿ�����.
			switch (selectNo) {
			
			case 1:
				if(scores != null) {
					System.out.println("�̹� �л����� �Է��ϼ̽��ϴ�.");
					break;
				}
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				System.out.println("�л��� : " + scores.length);
				break;
				
			case 2:
				if(scores == null) {
					System.out.println("�л����� ���� �Է� �ϼž� �մϴ�");
					break;
				}
				for(int i=0;i<scores.length;i++) {
					System.out.print("�����Է� : scores[" + i + "] = ");
					scores[i] = sc.nextInt();
				}
				break;
				
			case 3:
				if(scores == null) {
					System.out.println("�л����� ���� �Է� �ϼž� �մϴ�");
					break;
				}
				for(int i=0;i<scores.length;i++) {
					System.out.println("�Էµ� ������  : scores[" + i + "] = " + scores[i]);
				}
				break;
				
			case 4:
				if(scores == null) {
					System.out.println("�л����� ���� �Է� �ϼž� �մϴ�");
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
				System.out.println("�ִ밪 : " + max);
				
				for(int i=0;i<scores.length;i++) {
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("��հ� : " + avg);
				break;
				
			case 5:
				System.out.println("����");
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
