import java.util.Scanner;

public class hw2 {
	
	public static void main(String[] args) {
		int input;
		int tenthDigit, unitsDigit;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		input = scanner.nextInt();
		tenthDigit = input/10;
		unitsDigit = input%10;
		if(tenthDigit == unitsDigit) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No.. 10의 자리와 1의 자리가 다릅니다.");
		}
		scanner.close();
	}
}
