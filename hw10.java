import java.util.Scanner;

public class hw10 {

	public static void main(String[] args) {
		int x1, y1;
		int x2, y2;
		double r1, r2, distance;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		r1 = scanner.nextDouble();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		r2 = scanner.nextDouble();

		distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		if(distance <= r1+r2) {
			System.out.println("두 원은 서로 겹친다.");
		} else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		
		scanner.close();
	}

}
