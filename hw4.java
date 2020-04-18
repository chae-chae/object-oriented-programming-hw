import java.util.Scanner;

public class hw4 {
	
	public static void main(String[] args) {
		int a, b, c;
		int median;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>"); // 같은 수가 들어오지 않는다는 전제하에 작성
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if(a > b) { // a와 b를 비교
			if(a > c) { // a와 c를 비교
				if(b > c) {
					median = b;
				} else {
					median = c;
				}
			} else {
				median = a;
			}
		} else {
			if(b > c) {
				if(a > c) {
					median = a;
				} else {
					median = c;
				}
			} else {
				median = b;
			}
		}
		System.out.println("중간 값은 " + median);
		
		scanner.close();
	}

}
