import java.util.Scanner;

public class Prompt {
	public static void main(String[] args) {
		Calendar cal = new Calendar();
		Scanner scan = new Scanner(System.in);
		// 년, 월, 요일을 입력 받기 위해서
		
		int year = 0;
		int month = 0;
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
			maxDay = cal.getMaxDays(year, month);
			System.out.printf("%d년의 %d월의 마지막 일은 %d입니다.\n\n",year, month, maxDay);
			cal.printCalendar(maxDay);
		}
		scan.close();
	}
}
