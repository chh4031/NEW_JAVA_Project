package section05_03;

import java.util.Calendar;
//��ǻ���� ���� ��¥ ������ ������.

public class exam02_p208 {
	public static void main(String[] args) {
		exam01_p205 today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//�� ~ ������� ���� ���� 1 ~ 7
		
		switch(week) {
		case 1:
			today = exam01_p205.SUNDAY;break;
		case 2:
			today = exam01_p205.MONDAY;break;
		case 3:
			today = exam01_p205.TUESDAY;break;
		case 4:
			today = exam01_p205.WEDNESDAY;break;
		case 5:
			today = exam01_p205.THURSDAY;break;
		case 6:
			today = exam01_p205.FRIDAY;break;
		case 7:
			today = exam01_p205.SATURDAY;break;
		}
		
		System.out.println("���� ����: " + today);
		
		if(today == exam01_p205.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		}else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}
		
	}
}
//���� Ÿ������ �����ؼ� ���
