import java.util.Scanner;

public class Prompt {
	public static void main(String[] args) {
		Calendar cal = new Calendar();
		Scanner scan = new Scanner(System.in);
		
		int year = 0;
		int month = 0;
		String day = "월";
		int maxDay = 0;
		while(true) {
			System.out.print("YEAR >");
			year = scan.nextInt();
			
			if (year == -1) {
				System.out.print("종료"); 
				break;
			}
			
			System.out.print("MONTH >");
			
			month = scan.nextInt();
			if (month > 12 || month < 1) {
				System.out.println("잘못입력하셨습니다. 1 ~ 12 월 까지만 입력해주세요.");
				continue;
			}
			System.out.print("DAY >");
			day = scan.next();
			maxDay = cal.getMaxDays(year, month);
			if (cal.getDayNumber(day) == 0) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			System.out.printf("%d년의 %d월의 마지막 일은 %d입니다.\n\n",year, month, maxDay);
			cal.printCalendar(year,month, maxDay, day);
		}
		scan.close();
	}
}
