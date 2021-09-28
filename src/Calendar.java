import java.util.Scanner;

public class Calendar {
	final static int MAX_DAYS[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int outMaxDays(int month) {
		return MAX_DAYS[month - 1];
	}
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
		 
		System.out.printf("%d월의 마지막 일은 %d 입니다.", inputMonth, outMaxDays(inputMonth));
	}
}
