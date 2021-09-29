
public class Calendar {
	final static int MAX_DAYS[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDays(int year, int month) {
		if (month == 2 && (year % 4) == 0 && (year % 100) != 0 || year % 400 == 0) return 28;
		return MAX_DAYS[month - 1];
	}
	// static을 사용하는 이유 -> 공부하기, static은 자바파일이 클래스파일로될때부터 인스턴스가 없어도 메모리에 올라가서 사용가능할 수 있다
	// 지금 main 함수에서 outMaxDays() 메소드를 사용하는데 에러가 나는이유는 
	// outMaxDays() 메소드를 가진 내가만든 Calendar 클래스의 인스턴스가 없기때문이다.
	// 따라서 Calendar 인스턴스를 생성해서 메소드를 사용하게하면 static을 사용하지않고 메서드를 사용할 수 있다.
	
	public void printCalendar(int maxDay) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		for(int i = 1; i <= maxDay; i++) {
			System.out.print(i + " ");
			if (i % 7 == 0) System.out.println();
		}
		System.out.println();
	}
}
