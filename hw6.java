import java.util.Scanner;

public class hw6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input, tenthDigit, unitsDigit;
		int cnt = 0;
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		input = scanner.nextInt();
		if(input>=10) {
			tenthDigit = input/10; // 10의 자리 숫자
			unitsDigit = input%10; // 1의 자리 숫자
		} else {
			tenthDigit = -1; // 10의 자리 숫자가 없음을 표시
			unitsDigit = input; // 1의 자리 숫자
		}
		if(tenthDigit == 3 || tenthDigit == 6 || tenthDigit == 9) {
			cnt++;
		}
		if(unitsDigit == 3 || unitsDigit == 6 || unitsDigit == 9) {
			cnt++;
		}
		if(cnt == 1) {
			System.out.println("박수짝");
		} else if (cnt == 2) {
			System.out.println("박수짝짝");
		}
		scanner.close();
	}

}
