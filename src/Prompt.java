import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt {
	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();
		
	}
	private void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");           
		System.out.println("| 2. 일정 검색");           
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	}
	private void runPrompt() {
		printMenu();
		Calendar cal = new Calendar();
		Scanner scan = new Scanner(System.in);
		boolean isLoop = true;
		while (isLoop) {
			System.out.print(">");
			String inputPrompt = scan.next();
			switch (inputPrompt) {
				case "1":
					System.out.println("일정 등록 선택");
					cmdRegist();
					break;
				case "2":
					System.out.println("일정 검색 선택");
					cmdSearch();
					break;
				case "3":
					System.out.println("달력 보기 선택");
					cmdCalender(cal, scan);
					break;
				case "h":
					printMenu();
					break;
				case "q":
					System.out.println("종료");
					isLoop = false;
			}
		}
	}
	private void cmdRegist() {
	}
	private void cmdSearch() {
	}
	
	private void cmdCalender(Calendar cal, Scanner scan) {
		int year = 0;
		int month = 0;
		String day = "월";
		int maxDay = 0;
		System.out.print("YEAR >");
		year = scan.nextInt();
		
		System.out.print("MONTH >");
		
		month = scan.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("잘못입력하셨습니다. 1 ~ 12 월 까지만 입력해주세요.");
			return;
		}
		System.out.print("DAY >");
		day = scan.next();
		maxDay = cal.getMaxDays(year, month);
		if (cal.getDayNumber(day) == 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		cal.printCalendar(year,month, maxDay, day);
	}
}

