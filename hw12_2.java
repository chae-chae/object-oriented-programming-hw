import java.util.Scanner;

public class hw12_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, res;
		String op;

		System.out.print("연산>>");
		a = scanner.nextDouble();
		op = scanner.next();
		b = scanner.nextDouble();

		switch (op) {
		case ("+"):
			res = a + b;
			if (a - (int) a == 0.0) { // a가 정수인지 판단
				System.out.print((int) a);
			} else {
				System.out.print(a);
			}
			System.out.print(op); // 기호 출력
			if (b - (int) b == 0.0) { // b가 정수인지 판단
				System.out.print((int) b);
			} else {
				System.out.print(b);
			}
			if (res - (int) res == 0.0) { // res가 정수인지 판단
				System.out.print("의 계산 결과는 " + (int) res);
			} else {
				System.out.print("의 계산 결과는 " + res);
			}
			break;
		case ("-"):
			res = a - b;
			if (a - (int) a == 0.0) { // a가 정수인지 판단
				System.out.print((int) a);
			} else {
				System.out.print(a);
			}
			System.out.print(op); // 기호 출력
			if (b - (int) b == 0.0) { // b가 정수인지 판단
				System.out.print((int) b);
			} else {
				System.out.print(b);
			}
			if (res - (int) res == 0.0) { // res가 정수인지 판단
				System.out.print("의 계산 결과는 " + (int) res);
			} else {
				System.out.print("의 계산 결과는 " + res);
			}
			break;
		case ("*"):
			res = a * b;
			if (a - (int) a == 0.0) { // a가 정수인지 판단
				System.out.print((int) a);
			} else {
				System.out.print(a);
			}
			System.out.print(op); // 기호 출력
			if (b - (int) b == 0.0) { // b가 정수인지 판단
				System.out.print((int) b);
			} else {
				System.out.print(b);
			}
			if (res - (int) res == 0.0) { // res가 정수인지 판단
				System.out.print("의 계산 결과는 " + (int) res);
			} else {
				System.out.print("의 계산 결과는 " + res);
			}
			break;
		case ("/"):
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
			res = a / b;
			if (a - (int) a == 0.0) { // a가 정수인지 판단
				System.out.print((int) a);
			} else {
				System.out.print(a);
			}
			System.out.print(op); // 기호 출력
			if (b - (int) b == 0.0) { // b가 정수인지 판단
				System.out.print((int) b);
			} else {
				System.out.print(b);
			}
			if (res - (int) res == 0.0) { // res가 정수인지 판단
				System.out.print("의 계산 결과는 " + (int) res);
			} else {
				System.out.print("의 계산 결과는 " + res);
			}
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		scanner.close();

	}

}
