package ch05.sec12;

import java.util.Calendar;

public class WeekEx {
	public static void main(String[] args) {
		//요일 표시
		
		Week today = null;
		//Week는 class 아님
		//Enum으로부터 상속
		//ctrl + 좌클 -> 좌표 표시
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:			today = Week.SUNDAY;	break;
		case 2:			today = Week.MONDAY;	break;
		case 3:			today = Week.TUESDAY;	break;
		case 4:			today = Week.WEDNESDAY;	break;
		case 5:			today = Week.THURSDAY;	break;
		case 6:			today = Week.FRIDAY;	break;
		case 7:			today = Week.SATURDAY;		}
		
		//
		if(today == Week.SUNDAY) {
			System.out.println("일요일 축구");
		}else {
			System.out.println("자바공부");
		}
	}

}
