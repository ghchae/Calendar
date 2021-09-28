import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두 수를 입력해주세요 : ");
		String inputValue = scan.nextLine();
		scan.close();
		String[] values = inputValue.split(" ");
		int A = Integer.parseInt(values[0]);
		int B = Integer.parseInt(values[1]);
		
		System.out.print(A + B);
	}
}
