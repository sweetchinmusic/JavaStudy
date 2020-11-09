package kh.chapter9_API.dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
	DateTest dt = new DateTest();
	dt.testDate();
	dt.testCalendar();

	}
	
	public void testDate() {
		// 날짜 데이터를 담당하는 클래스
		// 1970년 1월 1일이 기준이다. UTC 제정년도 1970
		// 일반적으로 년, 월, 일 기준으로 시간을
		// 세는 것이 아니라 컴퓨터의 시간 단위인
		// 1000분의 1초 (millisecond)가 기준이다.
		Date date = new Date();
		
		Date when = new Date(new GregorianCalendar().getTimeInMillis());
		
		System.out.println("date : " + date);
		System.out.println("when : " + when); // 왜 코리안 타임임?
		
		System.out.println("date 시간 : " + date.getTime());
		System.out.println("when 시간 : " + when.getTime());
		
	}

		public void testCalendar() {
			// 기존의 Date 클래스가 한정적인 정ㅂ만을
			// 가져, 보다 확장된 시간 개념을 구성하기 위해
			// 만들어진 클래스
			
//			Calendar cal = new Calendar();
			Calendar cal = new GregorianCalendar();
			
			System.out.println("date : " + cal);
			
			int year = cal.get(Calendar.YEAR);
			// 월은 문자열 내용도 포함하기 때문에 배열로 관리한다.
			// 따라서 처음 시작하는 1월은 0부터!
			int month = cal.get(Calendar.MONTH)+1;
			int date = cal.get(Calendar.DATE);
			int am_pm = cal.get(Calendar.AM_PM);
			int hour = cal.get(Calendar.HOUR);
			int min = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			
			System.out.printf("%d년 %d월 %d일 \n" , year, month, date);
			System.out.printf("%d:%d:%d(%s) \n",hour,min,sec,(am_pm > 0? "오후" : "오전"));
			
			
			// 사용자 정의 날짜 포맷(형식)
			
			SimpleDateFormat dateStr
				= new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
			String formatDate = dateStr.format(cal.getTime());
			
			System.out.println(formatDate);
			
			// 날짜 직접 변경하기
			cal.set(2020, 4, 5);
			
			formatDate = dateStr.format(cal.getTime());
			
			System.out.println(formatDate);
		}
	}
