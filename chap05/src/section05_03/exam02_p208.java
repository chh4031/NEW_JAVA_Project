package section05_03;

import java.util.Calendar;
//컴퓨터의 현재 날짜 정보를 가져옴.

public class exam02_p208 {
	public static void main(String[] args) {
		exam01_p205 today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//일 ~ 토까지의 숫자 리턴 1 ~ 7
		
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
		
		System.out.println("오늘 요일: " + today);
		
		if(today == exam01_p205.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
	}
}
//열거 타입으로 선언해서 사용
