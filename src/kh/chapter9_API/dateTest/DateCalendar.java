package kh.chapter9_API.dateTest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalendar {

	public DateCalendar() {}
	
	// 평년과 윤년 확인하기
	
	public boolean isLeapYear(int year) {
		// 년도가 4의 배수이면서
		// 100의 배수가 400의 배수가 아닌 년도
//		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//			return true;
//		} else {
//			
//		}
		
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
// 속도는 같다.
	

	}

	// 이전 년도까지의 총 일수 계산하기
	
	public long getDays() {
		Calendar cal = new GregorianCalendar();
		
		long sumDays =0;
		
		// 반복문을 통해
		for(int i = 1 ; i <= cal.get(Calendar.YEAR); i++) {
			
		 if( i == cal.get(Calendar.YEAR)) {
			sumDays += cal.get(Calendar.DAY_OF_YEAR);
		} else { 
			sumDays += isLeapYear(i) ? 366 : 365; // 참 : 거짓
		}
			
		}
		
		
		return sumDays; // 끝날 때 돌려줌.
		
		
		
	}
	
	
	
	
}