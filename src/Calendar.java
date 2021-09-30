
public class Calendar {
	final static int MAX_DAYS[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDays(int year, int month) {
		if (month == 2 && (year % 4) == 0 && (year % 100) != 0 || year % 400 == 0) return 28;
		return MAX_DAYS[month - 1];
	}
	public int getDayNumber(String day) {
		switch (day) {
			case "월" : return 1;
			case "화" : return 2;
			case "수" : return 3;
			case "목" : return 4;
			case "금" : return 5;
			case "토" : return 6;
			case "일" : return 7;
			default: return 0;
		}
	}
	public void createBlank(String day) {
		for (int i = 1; i <= getDayNumber(day); i++) {
			System.out.print("   ");
		}
	}
	public void printStartDay(int weakDay) {
		for (int i = 1; i <= weakDay; i++) {
			checkNumber(i);
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public void checkNumber(int i) {
		if (i < 10) {
			System.out.print(" ");
		}
	}
	public void printCalendar(int year,int month, int maxDay, String day) {
		System.out.printf("<<%d년 %d월 %s요일 시작 >>\n", year, month, day);
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		createBlank(day);
		int weakDay = 7 - getDayNumber(day);
		printStartDay(weakDay); //시작 요일을 알맞게 출력
		for (int i = 8-getDayNumber(day); i <= maxDay; i++) {
			checkNumber(i);
			System.out.print(i + " ");
			if (i % 7 == weakDay) System.out.println();
		}
		System.out.println();
	}
}
