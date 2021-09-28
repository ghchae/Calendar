import java.util.Scanner;

public class Calendar {
	final static int MAX_DAYS[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int outMaxDays(int month) {
		return MAX_DAYS[month - 1];
	}
	// static을 사용하는 이유 -> 공부하기, static은 자바파일이 클래스파일로될때부터 인스턴스가 없어도 메모리에 올라가서 사용가능할 수 있다
	// 지금 main 함수에서 outMaxDays() 메소드를 사용하는데 에러가 나는이유는 
	// outMaxDays() 메소드를 가진 내가만든 Calendar 클래스의 인스턴스가 없기때문이다.
	// 따라서 Calendar 인스턴스를 생성해서 메소드를 사용하게하면 static을 사용하지않고 메서드를 사용할 수 있다.
	public static void main(String[] args) {
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		System.out.println("");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력해주세요 : ");
		int inputMonth = scan.nextInt();
		scan.close();
		Calendar cal = new Calendar();
		System.out.printf("%d월의 마지막 일은 %d 입니다.", inputMonth, cal.outMaxDays(inputMonth));
	}
}
